package yhli.work.designpatternsdemo.facadepattern;

import com.alibaba.fastjson.JSON;
import jakarta.annotation.Resource;
import org.apache.commons.beanutils.BeanUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import yhli.work.designpatternsdemo.facadepattern.annotation.DoDoor;
import yhli.work.designpatternsdemo.facadepattern.config.StarterService;

import java.lang.reflect.Method;

/**
 * @author yhli3
 * @ClassName DoJoinPoint.java
 * @packageName yhli.work.designpatternsdemo.facadepattern
 * @createTime 2023年04月18日 15:41:00
 */
@Aspect
@Component
public class DoJoinPoint {
    private static Logger logger = LoggerFactory.getLogger(DoJoinPoint.class);

    @Resource
    private StarterService starterService;

    @Pointcut("@annotation(yhli.work.designpatternsdemo.facadepattern.annotation.DoDoor)")
    public void aopPoint(){

    }

    @Around("aopPoint()")
    public Object doRouter(ProceedingJoinPoint jp) throws Throwable {
        Method method = getMethod(jp);
        DoDoor door = method.getAnnotation(DoDoor.class);
        String keyValue = getFiledValue(door.key(), jp.getArgs());
        logger.info("itstack door handler method：{} value：{}", method.getName(), keyValue);
        if (null == keyValue || "".equals(keyValue)) return jp.proceed();
        //配置内容
        String[] split = starterService.split(",");
        //白名单过滤
        for (String str : split) {
            if (keyValue.equals(str)) {
                return jp.proceed();
            }
        }
        //拦截
        return returnObject(door, method);
    }

    private Method getMethod(JoinPoint jp) throws NoSuchMethodException {
        Signature signature = jp.getSignature();
        MethodSignature methodSignature = (MethodSignature) signature;
        return getClass(jp).getMethod(methodSignature.getName(),methodSignature.getParameterTypes());
    }

    private Class<? extends Object> getClass(JoinPoint jp){
        return jp.getTarget().getClass();
    }


    //返回对象
    private Object returnObject(DoDoor doGate, Method method) throws IllegalAccessException, InstantiationException {
        Class<?> returnType = method.getReturnType();
        String returnJson = doGate.returnJson();
        if ("".equals(returnJson)) {
            return returnType.newInstance();
        }
        return JSON.parseObject(returnJson, returnType);
    }

    //获取属性值
    private String getFiledValue(String filed, Object[] args) {
        String filedValue = null;
        for (Object arg : args) {
            try {
                if (null == filedValue || "".equals(filedValue)) {
                    filedValue = BeanUtils.getProperty(arg, filed);
                } else {
                    break;
                }
            } catch (Exception e) {
                if (args.length == 1) {
                    return args[0].toString();
                }
            }
        }
        return filedValue;
    }




}
