package yhli.work.designpatternsdemo.flyweightpattern;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author yhli3
 * @ClassName RedisUtils.java
 * @packageName yhli.work.designpatternsdemo.flyweightpattern
 * @createTime 2023年04月20日 15:53:00
 */
public class RedisUtils {

    private ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);

    private AtomicInteger stock = new AtomicInteger(0);

    public RedisUtils(){
        scheduledExecutorService.scheduleAtFixedRate(()->{
            stock.addAndGet(1);
        },0,100000, TimeUnit.MICROSECONDS);
    }

    public int getStockUsed(){
        return stock.get();
    }

}
