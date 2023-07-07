package yhli.work.designpatternsdemo.iteratordesignpattern.group;

public class Employee {

    //用户id
    private String uId;

    //姓名
    private String name;

    //备注
    private String desc;


    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
