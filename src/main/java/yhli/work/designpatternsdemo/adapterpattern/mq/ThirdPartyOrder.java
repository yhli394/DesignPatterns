package yhli.work.designpatternsdemo.adapterpattern.mq;

import com.alibaba.fastjson.JSON;

import java.math.BigDecimal;
import java.util.Date;

/**第三方订单MQ
 * @author yhli3
 * @ClassName ThirdPartyOrder.java
 * @packageName yhli.work.designpatternsdemo.adapterpattern.mq
 * @createTime 2023年04月06日 16:43:00
 */
public class ThirdPartyOrder {

    //用户id
    private String uId;

    //订单号
    private String orderId;

    //下单时间
    private Date orderTime;

    //商品
    private Date sku;

    //商品名称
    private Date skuName;

    //价格
    private BigDecimal decimal;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }


    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public Date getSku() {
        return sku;
    }

    public void setSku(Date sku) {
        this.sku = sku;
    }

    public Date getSkuName() {
        return skuName;
    }

    public void setSkuName(Date skuName) {
        this.skuName = skuName;
    }

    public BigDecimal getDecimal() {
        return decimal;
    }

    public void setDecimal(BigDecimal decimal) {
        this.decimal = decimal;
    }
}
