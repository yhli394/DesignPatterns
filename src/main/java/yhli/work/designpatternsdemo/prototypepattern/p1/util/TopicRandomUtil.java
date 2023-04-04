package yhli.work.designpatternsdemo.prototypepattern.p1.util;

import java.util.*;

/**
 * @author yhli3
 * @ClassName TopicRandomUtil.java
 * @packageName yhli.work.designpatternsdemo.prototypepattern.p1.util
 * @createTime 2022年12月08日 14:17:00
 */
public class TopicRandomUtil {

    public static Topic random(Map<String,String> option,String key){
        Set<String> keySet = option.keySet();
        ArrayList<String> keyList = new ArrayList<>(keySet);
        Collections.shuffle(keyList);
        HashMap<String, String> optionNew = new HashMap<>();
        int idx = 0;
        String keyNew = "";
        for (String next : keySet) {
            String randomKey = keyList.get(idx++);
            if (key.equals(next)){
                keyNew = randomKey;
            }
            optionNew.put(randomKey,option.get(next));
        }
        return new Topic(optionNew,keyNew);
    }

}
