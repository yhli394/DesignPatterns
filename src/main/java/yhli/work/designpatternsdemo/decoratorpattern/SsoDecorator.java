package yhli.work.designpatternsdemo.decoratorpattern;

/**
 * @author yhli3
 * @ClassName SsoDecorator.java
 * @packageName yhli.work.designpatternsdemo.decoratorpattern
 * @createTime 2023年04月17日 16:08:00
 */
public abstract class SsoDecorator implements HandlerInterceptor{

    private HandlerInterceptor handlerInterceptor;

    private SsoDecorator(){}

    public SsoDecorator(HandlerInterceptor handlerInterceptor){
        this.handlerInterceptor = handlerInterceptor;
    }

    @Override
    public boolean preHandle(String request, String response, Object handler) {
        return handlerInterceptor.preHandle(request,response,handler);
    }

}
