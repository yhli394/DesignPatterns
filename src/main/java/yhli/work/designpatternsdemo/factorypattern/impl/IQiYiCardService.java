package yhli.work.designpatternsdemo.factorypattern.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import yhli.work.designpatternsdemo.factorypattern.AwardReq;
import yhli.work.designpatternsdemo.factorypattern.AwardRes;
import yhli.work.designpatternsdemo.factorypattern.IDistributionGoods;

/**爱奇艺卡服务
 * @author yhli3
 * @ClassName IQiYiCardService.java
 * @packageName yhli.work.designpatternsdemo.factorypattern
 * @createTime 2022年12月02日 16:55:00
 */
public class IQiYiCardService implements IDistributionGoods {

    private static Logger logger = LoggerFactory.getLogger(IQiYiCardService.class);

    @Override
    public AwardRes sendGood(AwardReq req) {
        logger.info("模拟发放爱奇艺卡片"+req.getAwardNumber());
        return new AwardRes("200","发放成功");
    }

}
