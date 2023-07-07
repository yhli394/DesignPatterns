package yhli.work.designpatternsdemo.mementodesignpattern;

import java.util.Date;

public class ConfigFile {

    private String versionNum;

    private String content;

    private Date dateTime;

    private String operator;

    public ConfigFile(String versionNum, String content, Date dateTime, String operator) {
        this.versionNum = versionNum;
        this.content = content;
        this.dateTime = dateTime;
        this.operator = operator;
    }

    public String getVersionNum() {
        return versionNum;
    }

    public void setVersionNum(String versionNum) {
        this.versionNum = versionNum;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
}
