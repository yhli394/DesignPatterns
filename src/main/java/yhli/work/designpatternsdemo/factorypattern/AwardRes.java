package yhli.work.designpatternsdemo.factorypattern;

/**出参
 * @author yhli3
 * @ClassName AwardRes.java
 * @packageName yhli.work.designpatternsdemo.factorypattern
 * @createTime 2022年12月02日 16:27:00
 */
public class AwardRes {
    private String code; // 编码
    private String info; // 描述

    public AwardRes(String code, String info) {
        this.code = code;
        this.info = info;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
