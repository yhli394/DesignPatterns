package yhli.work.designpatternsdemo.builderpattern.p0;

import java.math.BigDecimal;

/**物料
 * @author yhli3
 * @ClassName Matter.java
 * @packageName yhli.work.designpatternsdemo.builderpattern.p0
 * @createTime 2022年12月05日 15:42:00
 */
public interface Matter {

    /**
     * 场景
     * @return
     */
    String scene();

    /**
     * 品牌
     * @return
     */
    String brand();


    /**
     * 型号
     * @return
     */
    String model();

    /**
     * 价格/每平米
     * @return
     */
    BigDecimal price();

    /**
     * 描述
     * @return
     */
    String desc();

}
