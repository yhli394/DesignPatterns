package yhli.work.designpatternsdemo.flyweightpattern;

/**
 * @author yhli3
 * @ClassName ActivityController.java
 * @packageName yhli.work.designpatternsdemo.flyweightpattern
 * @createTime 2023年04月20日 15:58:00
 */
public class ActivityController {

    private RedisUtils redisUtils = new RedisUtils();

    public Activity queryActivityInfo(Long id){
        Activity activity = ActivityFactory.getActivity(id);
        Stock stock = new Stock(1000, redisUtils.getStockUsed());
        activity.setStock(stock);
        return activity;
    }

}
