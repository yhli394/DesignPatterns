package yhli.work.designpatternsdemo.bridgepattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

/**
 * @author yhli3
 * @ClassName ZfbPay.java
 * @packageName yhli.work.designpatternsdemo.bridgepattern
 * @createTime 2023年04月11日 15:35:00
 */
public class ZfbPay extends Pay{

    private static Logger logger = LoggerFactory.getLogger(ZfbPay.class);

    public ZfbPay(IPayMode payMode) {
        super(payMode);
    }

    @Override
    public String transfer(String uId, String tradeId, BigDecimal amount) {
        logger.info("支付宝转账开始，uId:{},tradeId:{},amount:{}",uId,tradeId,amount);
        //支付宝支付风控校验
        boolean security = payMode.security(uId);
        if (!security){
            logger.info("暂停支付宝转账，uId:{},tradeId:{},amount:{}",uId,tradeId,amount);
        }
        logger.info("支付宝转账成功，uId:{},tradeId:{},amount:{}",uId,tradeId,amount);
        return "0000";
    }

}
