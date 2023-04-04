package yhli.work.designpatternsdemo.prototypepattern.p0;

import java.util.Map;

/**选择题
 * @author yhli3
 * @ClassName ChoiceQuestion.java
 * @packageName yhli.work.designpatternsdemo.prototypepattern.p0
 * @createTime 2022年12月08日 12:16:00
 */
public class ChoiceQuestion {

    /**
     * 题目名
     */
    private String name;

    /**
     * 选项
     */
    private Map<String,String> option;

    /**
     * 答案
     */
    private String key;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public ChoiceQuestion(String name, Map<String, String> option, String key) {
        this.name = name;
        this.option = option;
        this.key = key;
    }
}
