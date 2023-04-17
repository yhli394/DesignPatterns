package yhli.work.designpatternsdemo;

import org.junit.jupiter.api.Test;
import yhli.work.designpatternsdemo.decoratorpattern.LoginSsoDecorator;
import yhli.work.designpatternsdemo.decoratorpattern.SsoInterceptor;

/**
 * @author yhli3
 * @ClassName DecoratorTest.java
 * @packageName yhli.work.designpatternsdemo
 * @createTime 2023年04月17日 16:20:00
 */
public class DecoratorTest {


    @Test
    public void test_decorator(){
        LoginSsoDecorator ssoDecorator = new LoginSsoDecorator(new SsoInterceptor());
        String request = "1successli";
        boolean success = ssoDecorator.preHandle(request, "xxxxx", "ssw");
        System.out.println("校验"+request+(success?"放行":"拦截"));
    }

}
