package yhli.work.designpatternsdemo.proxydesignpattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.FactoryBean;
import yhli.work.designpatternsdemo.proxydesignpattern.annotation.Select;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author yhli3
 * @ClassName MapperFactoryBean.java
 * @packageName yhli.work.designpatternsdemo.proxydesignpattern
 * @createTime 2023年04月22日 14:59:00
 */
public class MapperFactoryBean <T> implements FactoryBean<T> {

    private static Logger logger = LoggerFactory.getLogger(MapperFactoryBean.class);

    private Class<T> mapperInterface;

    public MapperFactoryBean(Class<T> mapperInterface) {
        this.mapperInterface = mapperInterface;
    }

    @Override
    public T getObject() throws Exception {
        InvocationHandler handler = (proxy, method, args) -> {
            Select select = method.getAnnotation(Select.class);
            logger.info("SQL:{}",select.value().replace("#{uId}",args[0].toString()));
            return args[0]+"xxx";
        };
        return (T) Proxy.newProxyInstance(this.getClass().getClassLoader(), new Class[]{mapperInterface},handler);
    }

    @Override
    public Class<?> getObjectType() {
        return mapperInterface;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
