package yhli.work.designpatternsdemo.factorypattern.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import yhli.work.designpatternsdemo.factorypattern.AwardReq;
import yhli.work.designpatternsdemo.factorypattern.AwardRes;
import yhli.work.designpatternsdemo.factorypattern.IDistributionGoods;

/**优惠卷服务
 * @author yhli3
 * @ClassName CouponGoodService.java
 * @packageName yhli.work.designpatternsdemo.factorypattern
 * @createTime 2022年12月02日 16:45:00
 */
public class CouponGoodService implements IDistributionGoods {

    private static Logger logger = LoggerFactory.getLogger(CouponGoodService.class);

    @Override
    public AwardRes sendGood(AwardReq req) {
        logger.info("模拟发放优惠卷:"+req.getAwardNumber());
        return new AwardRes("200","发放成功");
    }

}
