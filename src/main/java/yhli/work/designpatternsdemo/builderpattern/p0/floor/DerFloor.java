package yhli.work.designpatternsdemo.builderpattern.p0.floor;

import yhli.work.designpatternsdemo.builderpattern.p0.Matter;

import java.math.BigDecimal;

/**
 * @author yhli3
 * @ClassName DerFloor.java
 * @packageName yhli.work.designpatternsdemo.builderpattern.p0.floor
 * @createTime 2022年12月05日 16:02:00
 */
public class DerFloor implements Matter {

    @Override
    public String scene() {
        return "地板";
    }

    @Override
    public String brand() {
        return "德尔";
    }

    @Override
    public String model() {
        return "A+";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(119);
    }

    @Override
    public String desc() {
        return "DER德尔集团是全球领先的专业木地板制造商，北京2008年奥运会家装和公装地板供应商";
    }

}
