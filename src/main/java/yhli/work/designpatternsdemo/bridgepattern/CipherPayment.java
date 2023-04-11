package yhli.work.designpatternsdemo.bridgepattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author yhli3
 * @ClassName CipherPayment.java
 * @packageName yhli.work.designpatternsdemo.bridgepattern
 * @createTime 2023年04月11日 15:50:00
 */
public class CipherPayment implements IPayMode{

    private static Logger logger = LoggerFactory.getLogger(CipherPayment.class);

    @Override
    public boolean security(String uId) {
        logger.info("密码支付校验");
        return true;
    }
}
