package yhli.work.designpatternsdemo.decoratorpattern;

/**
 * @author yhli3
 * @ClassName SsoInterceptor.java
 * @packageName yhli.work.designpatternsdemo.decoratorpattern
 * @createTime 2023年04月17日 16:04:00
 */
public class SsoInterceptor implements HandlerInterceptor{

    @Override
    public boolean preHandle(String request, String response, Object handler) {
        String ticket = request.substring(1, 8);
        return ticket.equals("success");
    }

}




