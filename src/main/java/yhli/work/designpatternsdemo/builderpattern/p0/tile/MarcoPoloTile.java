package yhli.work.designpatternsdemo.builderpattern.p0.tile;

import yhli.work.designpatternsdemo.builderpattern.p0.Matter;

import java.math.BigDecimal;

/**
 * @author yhli3
 * @ClassName MarcoPoloTile.java
 * @packageName yhli.work.designpatternsdemo.builderpattern.p0.tile
 * @createTime 2022年12月05日 16:08:00
 */
public class MarcoPoloTile implements Matter {
    @Override
    public String scene() {
        return "瓷砖";
    }

    @Override
    public String brand() {
        return "马克波罗";
    }

    @Override
    public String model() {
        return "S";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(140);
    }

    @Override
    public String desc() {
        return "“马可波罗”品牌诞生于1996年，作为国内最早品牌化的建陶品牌，以“文化陶瓷”占领市场，享有“仿古砖至尊”的美誉。";
    }

}
