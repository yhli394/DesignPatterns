package yhli.work.designpatternsdemo;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import yhli.work.designpatternsdemo.proxydesignpattern.IUserDao;

/**
 * @author yhli3
 * @ClassName ProxyTest.java
 * @packageName yhli.work.designpatternsdemo
 * @createTime 2023年04月22日 15:21:00
 */
public class ProxyTest {


    private static Logger logger = LoggerFactory.getLogger(ProxyTest.class);


    @Test
    public void test_proxy(){
        ClassPathXmlApplicationContext beanFactory = new ClassPathXmlApplicationContext("spring-config.xml");
        IUserDao userDao = beanFactory.getBean("userDao", IUserDao.class);
        String s = userDao.queryUserInfo("1000");
        logger.info("测试结果=》{}",s);
    }


}
