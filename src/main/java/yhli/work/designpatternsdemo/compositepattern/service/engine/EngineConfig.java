package yhli.work.designpatternsdemo.compositepattern.service.engine;

import yhli.work.designpatternsdemo.compositepattern.service.logic.LogicFilter;
import yhli.work.designpatternsdemo.compositepattern.service.logic.UserAgeFilter;
import yhli.work.designpatternsdemo.compositepattern.service.logic.UserGenderFilter;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author yhli3
 * @ClassName EngineConfig.java
 * @packageName yhli.work.designpatternsdemo.compositepattern.service.engine
 * @createTime 2023年04月12日 10:47:00
 */
public class EngineConfig {

    protected static Map<String, LogicFilter> logicFilterMap;

    static {
        logicFilterMap = new ConcurrentHashMap<>();
        logicFilterMap.put("userAge",new UserAgeFilter());
        logicFilterMap.put("userGender",new UserGenderFilter());
    }

    public static Map<String, LogicFilter> getLogicFilterMap() {
        return logicFilterMap;
    }

    public static void setLogicFilterMap(Map<String, LogicFilter> logicFilterMap) {
        EngineConfig.logicFilterMap = logicFilterMap;
    }

}
