package yhli.work.designpatternsdemo.adapterpattern.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author yhli3
 * @ClassName OrderService.java
 * @packageName yhli.work.designpatternsdemo.adapterpattern.service
 * @createTime 2023年04月07日 11:08:00
 */
public class InternalOrderService {

    private static Logger logger = LoggerFactory.getLogger(InternalOrderService.class);

    public long queryUserOrderCount(String userId){
        logger.info("自营商家，查询用户的订单是否为首单：{}", userId);
        return 10L;
    }

}
