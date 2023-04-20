package yhli.work.designpatternsdemo;

import com.alibaba.fastjson.JSON;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import yhli.work.designpatternsdemo.flyweightpattern.Activity;
import yhli.work.designpatternsdemo.flyweightpattern.ActivityController;

/**
 * @author yhli3
 * @ClassName flyweighttest.java
 * @packageName yhli.work.designpatternsdemo
 * @createTime 2023年04月20日 16:01:00
 */
public class flyweighttest {

    private static Logger logger = LoggerFactory.getLogger(flyweighttest.class);

    private ActivityController activityController = new ActivityController();

    @Test
    public void test_flyweight() throws InterruptedException {
        for(int idx = 0;idx<10;idx++){
            Long req = 10001L;
            Activity activity = activityController.queryActivityInfo(req);
            logger.info("查询结果:{}，{}",req, JSON.toJSONString(activity));
            Thread.sleep(1200);
        }
    }

}
