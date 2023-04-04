package yhli.work.designpatternsdemo.abstractfactory;

import jakarta.annotation.Resource;
import yhli.work.designpatternsdemo.abstractfactory.util.ClassLoaderUtils;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author yhli3
 * @ClassName JDKInvocationHandler.java
 * @packageName yhli.work.designpatternsdemo.abstractfactory
 * @createTime 2022年12月03日 12:46:00
 */
public class JDKInvocationHandler implements InvocationHandler {

    @Resource
    private ICacheAdapter cacheAdapter;

    public JDKInvocationHandler(ICacheAdapter cacheAdapter){
        this.cacheAdapter = cacheAdapter;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return ICacheAdapter.class.getMethod(method.getName(), ClassLoaderUtils.getClazzByArgs(args)).invoke(cacheAdapter,args);
    }


}
