package yhli.work.designpatternsdemo.bridgepattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author yhli3
 * @ClassName FacePayment.java
 * @packageName yhli.work.designpatternsdemo.bridgepattern
 * @createTime 2023年04月11日 15:45:00
 */
public class FacePayment implements IPayMode{

    private static Logger logger = LoggerFactory.getLogger(FacePayment.class);

    @Override
    public boolean security(String uId) {
        logger.info("面部支付校验");
        return true;
    }

}
