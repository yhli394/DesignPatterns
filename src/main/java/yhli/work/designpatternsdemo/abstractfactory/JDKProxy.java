package yhli.work.designpatternsdemo.abstractfactory;

import java.lang.reflect.Proxy;

/**
 * @author yhli3
 * @ClassName JDKProxy.java
 * @packageName yhli.work.designpatternsdemo.abstractfactory
 * @createTime 2022年12月03日 12:43:00
 */
public class JDKProxy {

    public static <T> T getProxy(Class<T> interfaceClass,ICacheAdapter cacheAdapter){
        JDKInvocationHandler handler = new JDKInvocationHandler(cacheAdapter);
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        Class<?>[] classes = interfaceClass.getInterfaces();
        return (T) Proxy.newProxyInstance(classLoader,new Class[]{classes[0]},handler);
    }

}
