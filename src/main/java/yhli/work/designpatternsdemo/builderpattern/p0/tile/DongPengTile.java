package yhli.work.designpatternsdemo.builderpattern.p0.tile;

import yhli.work.designpatternsdemo.builderpattern.p0.Matter;

import java.math.BigDecimal;

/**
 * @author yhli3
 * @ClassName DongPengTile.java
 * @packageName yhli.work.designpatternsdemo.builderpattern.p0.tile
 * @createTime 2022年12月05日 16:07:00
 */
public class DongPengTile implements Matter {
    @Override
    public String scene() {
        return "瓷砖";
    }

    @Override
    public String brand() {
        return "东鹏瓷砖";
    }

    @Override
    public String model() {
        return "10001";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(102);
    }

    @Override
    public String desc() {
        return "东鹏瓷砖以品质铸就品牌，科技推动品牌，口碑传播品牌为宗旨，2014年品牌价值132.35亿元，位列建陶行业榜首。";
    }

}
