package yhli.work.designpatternsdemo.builderpattern.p0.floor;

import yhli.work.designpatternsdemo.builderpattern.p0.Matter;

import java.math.BigDecimal;

/**圣象
 * @author yhli3
 * @ClassName ShengXiangFloor.java
 * @packageName yhli.work.designpatternsdemo.builderpattern.p0.floor
 * @createTime 2022年12月05日 16:03:00
 */
public class ShengXiangFloor implements Matter {

    @Override
    public String scene() {
        return "地板";
    }

    @Override
    public String brand() {
        return "圣象";
    }

    @Override
    public String model() {
        return "一级";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(318);
    }

    @Override
    public String desc() {
        return "圣象地板是中国地板行业著名品牌。圣象地板拥有中国驰名商标、中国名牌、国家免检、中国环境标志认证等多项荣誉。";
    }

}
