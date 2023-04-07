package yhli.work.designpatternsdemo.adapterpattern;

import com.alibaba.fastjson.JSON;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/**MQ类适配器
 * @author yhli3
 * @ClassName MQAdapter.java
 * @packageName yhli.work.designpatternsdemo.adapterpattern
 * @createTime 2023年04月06日 16:58:00
 */
public class MQAdapter {


    public static RebateInfo filter(String strJson,Map<String,String> link) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        //Object parse = JSON.parse(strJson);
        //return filter(JSON.parseObject(parse.toString(), Map.class),link);
        return filter(JSON.parseObject(strJson, Map.class), link);
    }


    public static RebateInfo filter (Map obj,Map<String,String> link) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        RebateInfo rebateInfo = new RebateInfo();
        for (String key : link.keySet()) {
            Object val = obj.get(link.get(key));
            //"set"+key.substring(0,1).toUpperCase()+key.substring(1)等价于set方法
            RebateInfo.class.getMethod("set"+key.substring(0,1).toUpperCase()+key.substring(1),String.class).invoke(rebateInfo,val.toString());
        }
        return rebateInfo;
    }


}
