package yhli.work.designpatternsdemo.decoratorpattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author yhli3
 * @ClassName LoginSsoDecorator.java
 * @packageName yhli.work.designpatternsdemo.decoratorpattern
 * @createTime 2023年04月17日 16:11:00
 */
public class LoginSsoDecorator extends SsoDecorator{

    private static Logger logger = LoggerFactory.getLogger(LoginSsoDecorator.class);

    private static Map<String,String> authMap = new ConcurrentHashMap<>();

    static {
        authMap.put("li","queryInfo");
        authMap.put("wang","queryInfo");
    }

    public LoginSsoDecorator(HandlerInterceptor handlerInterceptor) {
        super(handlerInterceptor);
    }

    @Override
    public boolean preHandle(String request, String response, Object handler) {
        boolean success = super.preHandle(request, response, handler);
        if (!success){
            return false;
        }
        String userId = request.substring(8);
        String method = authMap.get(userId);
        logger.info("模拟单点登录方法访问拦截校验：{} {}",userId,method);
        return "queryInfo".equals(method);
    }

}
