package yhli.work.designpatternsdemo.adapterpattern.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author yhli3
 * @ClassName ThirdPartyOrderService.java
 * @packageName yhli.work.designpatternsdemo.adapterpattern.service
 * @createTime 2023年04月07日 11:11:00
 */
public class ThirdPartyOrderService {

    private static Logger logger = LoggerFactory.getLogger(ThirdPartyOrderService.class);

    public boolean isFirstOrder(String uId){
        logger.info("非自营商家，查询用户的订单是否为首单：{}", uId);
        return true;
    }

}
