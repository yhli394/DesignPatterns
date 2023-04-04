package yhli.work.designpatternsdemo.factorypattern;

/**
 * @author yhli3
 * @ClassName GoodsFactory.java
 * @packageName yhli.work.designpatternsdemo.factorypattern
 * @createTime 2022年12月02日 16:19:00
 */
public interface IDistributionGoods {

    AwardRes sendGood(AwardReq req);

}
