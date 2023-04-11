package yhli.work.designpatternsdemo.bridgepattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

/**
 * @author yhli3
 * @ClassName WxPay.java
 * @packageName yhli.work.designpatternsdemo.bridgepattern
 * @createTime 2023年04月11日 14:52:00
 */
public class WxPay extends Pay{

    private static Logger logger = LoggerFactory.getLogger(WxPay.class);

    public WxPay(IPayMode payMode) {
        super(payMode);
    }

    @Override
    public String transfer(String uId, String tradeId, BigDecimal amount) {
        logger.info("微信转账开始，uId:{},tradeId:{},amount:{}",uId,tradeId,amount);
        //微信支付风控校验
        boolean security = payMode.security(uId);
        if (!security){
            logger.info("暂停微信转账，uId:{},tradeId:{},amount:{}",uId,tradeId,amount);
        }
        logger.info("微信转账成功，uId:{},tradeId:{},amount:{}",uId,tradeId,amount);
        return "0000";
    }


}
