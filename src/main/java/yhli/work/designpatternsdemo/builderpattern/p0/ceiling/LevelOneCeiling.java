package yhli.work.designpatternsdemo.builderpattern.p0.ceiling;

import yhli.work.designpatternsdemo.builderpattern.p0.Matter;

import java.math.BigDecimal;

/**一级吊顶
 * @author yhli3
 * @ClassName LevelOneCeiling.java
 * @packageName yhli.work.designpatternsdemo.builderpattern.p0.ceiling
 * @createTime 2022年12月05日 15:47:00
 */
public class LevelOneCeiling implements Matter {
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
        return "一级顶";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(260);
    }

    @Override
    public String desc() {
        return "造型只做低一级，只有一个层次的吊顶，一般离顶120-150mm";
    }

}
