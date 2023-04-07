package yhli.work.designpatternsdemo.adapterpattern.mq;

import com.alibaba.fastjson.JSON;

import java.util.Date;

/**内部订单MQ
 * @author yhli3
 * @ClassName OrderMq.java
 * @packageName yhli.work.designpatternsdemo.adapterpattern.mq
 * @createTime 2023年04月06日 16:35:00
 */
public class InternalOrderMq {

    //用户id
    private String uid;

    //商品
    private String sku;

    //订单id
    private String orderId;

    //下单时间
    private Date createOrderTime;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }


    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Date getCreateOrderTime() {
        return createOrderTime;
    }

    public void setCreateOrderTime(Date createOrderTime) {
        this.createOrderTime = createOrderTime;
    }
}
