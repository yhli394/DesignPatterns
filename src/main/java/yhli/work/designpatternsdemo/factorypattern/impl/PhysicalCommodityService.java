package yhli.work.designpatternsdemo.factorypattern.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import yhli.work.designpatternsdemo.factorypattern.AwardReq;
import yhli.work.designpatternsdemo.factorypattern.AwardRes;
import yhli.work.designpatternsdemo.factorypattern.IDistributionGoods;

/**实体商品服务
 * @author yhli3
 * @ClassName PhysicalCommodityService.java
 * @packageName yhli.work.designpatternsdemo.factorypattern
 * @createTime 2022年12月02日 17:00:00
 */
public class PhysicalCommodityService implements IDistributionGoods {

    private static Logger logger = LoggerFactory.getLogger(PhysicalCommodityService.class);

    @Override
    public AwardRes sendGood(AwardReq req) {
        logger.info("模拟发放实体商品"+req.getAwardNumber());
        return new AwardRes("200","发放成功");
    }

}
