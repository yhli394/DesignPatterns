package yhli.work.designpatternsdemo.builderpattern.p0.coat;

import yhli.work.designpatternsdemo.builderpattern.p0.Matter;

import java.math.BigDecimal;

/**多乐士涂料
 * @author yhli3
 * @ClassName DuluxCoat.java
 * @packageName yhli.work.designpatternsdemo.builderpattern.p0.coat
 * @createTime 2022年12月05日 15:53:00
 */
public class DuluxCoat implements Matter {

    @Override
    public String scene() {
        return "涂料";
    }

    @Override
    public String brand() {
        return "多乐士";
    }

    @Override
    public String model() {
        return "第二代";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(719);
    }

    @Override
    public String desc() {
        return "多乐士是阿克苏诺贝尔旗下的著名建筑装饰油漆品牌，产品畅销于全球100个国家，每年全球有5000万户家庭使用多乐士油漆。";
    }

}
