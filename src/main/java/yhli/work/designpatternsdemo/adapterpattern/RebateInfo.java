package yhli.work.designpatternsdemo.adapterpattern;

/**
 * @author yhli3
 * @ClassName RebateInfo.java
 * @packageName yhli.work.designpatternsdemo.adapterpattern
 * @createTime 2023年04月06日 16:55:00
 */
public class RebateInfo {

    //用户编号
    private String userId;
    //业务编号
    private String businessId;
    //业务时间
    private String businessTime;
    //业务描述
    private String businessDesc;


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getBusinessId() {
        return businessId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId;
    }

    public String getBusinessTime() {
        return businessTime;
    }

    public void setBusinessTime(String businessTime) {
        this.businessTime = businessTime;
    }

    public String getBusinessDesc() {
        return businessDesc;
    }

    public void setBusinessDesc(String businessDesc) {
        this.businessDesc = businessDesc;
    }
}
