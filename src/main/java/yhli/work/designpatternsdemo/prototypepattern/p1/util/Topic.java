package yhli.work.designpatternsdemo.prototypepattern.p1.util;

import java.util.Map;

/**
 * @author yhli3
 * @ClassName Topic.java
 * @packageName yhli.work.designpatternsdemo.prototypepattern.p1.util
 * @createTime 2022年12月08日 14:15:00
 */
public class Topic {

    private Map<String,String> option;

    private String key;

    public Topic(Map<String, String> option, String key) {
        this.option = option;
        this.key = key;
    }

    public Map<String, String> getOption() {
        return option;
    }

    public void setOption(Map<String, String> option) {
        this.option = option;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
