package yhli.work.designpatternsdemo.flyweightpattern;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author yhli3
 * @ClassName ActivityFactory.java
 * @packageName yhli.work.designpatternsdemo.flyweightpattern
 * @createTime 2023年04月20日 15:48:00
 */
public class ActivityFactory {

    private static Map<Long,Activity> activityMap = new HashMap<>();

    public static Activity getActivity(Long id){
        Activity activity = activityMap.get(id);
        if (null==activity){
            activity = new Activity();
            activity.setId(10001L);
            activity.setName("苹果手机秒杀");
            activity.setDesc("秒杀第二场");
            activity.setStartTime(new Date());
            activity.setStopTime(new Date());
            activityMap.put(id,activity);
        }
        return activity;
    }

}
