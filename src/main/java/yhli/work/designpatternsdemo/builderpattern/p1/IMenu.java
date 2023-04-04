package yhli.work.designpatternsdemo.builderpattern.p1;

import yhli.work.designpatternsdemo.builderpattern.p0.Matter;

/**
 * @author yhli3
 * @ClassName IMenu.java
 * @packageName yhli.work.designpatternsdemo.builderpattern.p1
 * @createTime 2022年12月05日 16:46:00
 */
public interface IMenu {

    IMenu appendCeiling(Matter matter);

    IMenu appendCoat(Matter matter);

    IMenu appendFloor(Matter matter);

    IMenu appendTile(Matter matter);

    String getDetail();

}
