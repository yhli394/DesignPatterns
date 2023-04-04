package yhli.work.designpatternsdemo.builderpattern.p0.ceiling;

import yhli.work.designpatternsdemo.builderpattern.p0.Matter;

import java.math.BigDecimal;

/**二级吊顶
 * @author yhli3
 * @ClassName LevelTwoCeiling.java
 * @packageName yhli.work.designpatternsdemo.builderpattern.p0.ceiling
 * @createTime 2022年12月05日 15:49:00
 */
public class LevelTwoCeiling implements Matter {

    @Override
    public String scene() {
        return "吊顶";
    }

    @Override
    public String brand() {
        return "装修公司自带";
    }

    @Override
    public String model() {
        return "二级顶";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(850);
    }

    @Override
    public String desc() {
        return "两个层次的吊顶，二级吊顶高度一般就往下吊20cm，要是层高很高，也可增加每级的厚度";
    }

}
