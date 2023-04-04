package yhli.work.designpatternsdemo.prototypepattern.p0;

/**问答题
 * @author yhli3
 * @ClassName AnswerQuestion.java
 * @packageName yhli.work.designpatternsdemo.prototypepattern.p0
 * @createTime 2022年12月08日 12:18:00
 */
public class AnswerQuestion {

    /**
     * 题目名
     */
    private String name;

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

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public AnswerQuestion(String name, String key) {
        this.name = name;
        this.key = key;
    }

}
