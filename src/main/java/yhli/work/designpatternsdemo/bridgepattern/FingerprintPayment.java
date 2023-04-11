package yhli.work.designpatternsdemo.bridgepattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author yhli3
 * @ClassName FingerPrintPayment.java
 * @packageName yhli.work.designpatternsdemo.bridgepattern
 * @createTime 2023年04月11日 15:47:00
 */
public class FingerprintPayment implements IPayMode{

    private static Logger logger = LoggerFactory.getLogger(FingerprintPayment.class);


    @Override
    public boolean security(String uId) {
        logger.info("指纹支付校验");
        return true;
    }
}
