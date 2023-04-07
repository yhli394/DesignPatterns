package yhli.work.designpatternsdemo.adapterpattern.mq;

import com.alibaba.fastjson.JSON;

import java.util.Date;

/**开户MQ
 * @author yhli3
 * @ClassName CreateAccount.java
 * @packageName yhli.work.designpatternsdemo.adapterpattern.mq
 * @createTime 2023年04月06日 16:33:00
 */
public class CreateAccount {

    //开户编号
    private String number;

    //开户地址
    private String address;

    //开户时间
    private Date accountDate;

    //开户描述
    private String desc;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getAccountDate() {
        return accountDate;
    }

    public void setAccountDate(Date accountDate) {
        this.accountDate = accountDate;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }

}
