package yhli.work.designpatternsdemo.factorypattern;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import yhli.work.designpatternsdemo.factorypattern.impl.CouponGoodService;
import yhli.work.designpatternsdemo.factorypattern.impl.IQiYiCardService;
import yhli.work.designpatternsdemo.factorypattern.impl.PhysicalCommodityService;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yhli3
 * @ClassName CommodityFactory.java
 * @packageName yhli.work.designpatternsdemo.factorypattern
 * @createTime 2022年12月02日 17:19:00
 */
public class CommodityFactory {

    private static Logger logger = LoggerFactory.getLogger(CommodityFactory.class);

    private static final Map<Integer,IDistributionGoods> map = new HashMap<>();

    static {
        map.put(1,new CouponGoodService());
        map.put(2,new PhysicalCommodityService());
        map.put(3,new IQiYiCardService());
        logger.info("初始化完成");
    }


    public static IDistributionGoods getCommodityService(Integer awardType){
        if (awardType==null){
            return null;
        }
        return map.get(awardType);
    }

    //public static IDistributionGoods getCommodityService(Integer awardType){
    //    switch (awardType){
    //        case 1:
    //            return new CouponGoodService();
    //        case 2:
    //            return new PhysicalCommodityService();
    //        case 3:
    //            return new IQiYiCardService();
    //        default:
    //            throw new RuntimeException("请检查awardType是否输入正确");
    //    }
    //}

}
