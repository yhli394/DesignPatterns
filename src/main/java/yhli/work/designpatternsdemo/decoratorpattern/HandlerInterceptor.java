package yhli.work.designpatternsdemo.decoratorpattern;

/**
 * @author yhli3
 * @ClassName HandlerInterceptor.java
 * @packageName yhli.work.designpatternsdemo.decoratorpattern
 * @createTime 2023年04月17日 15:56:00
 */
public interface HandlerInterceptor {

    boolean preHandle(String request,String response,Object handler);

}
