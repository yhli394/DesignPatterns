package yhli.work.designpatternsdemo.builderpattern.p1;

import yhli.work.designpatternsdemo.builderpattern.p0.ceiling.LevelOneCeiling;
import yhli.work.designpatternsdemo.builderpattern.p0.ceiling.LevelTwoCeiling;
import yhli.work.designpatternsdemo.builderpattern.p0.coat.DuluxCoat;
import yhli.work.designpatternsdemo.builderpattern.p0.coat.LiBangCoat;
import yhli.work.designpatternsdemo.builderpattern.p0.floor.ShengXiangFloor;
import yhli.work.designpatternsdemo.builderpattern.p0.tile.DongPengTile;
import yhli.work.designpatternsdemo.builderpattern.p0.tile.MarcoPoloTile;

/**
 * @author yhli3
 * @ClassName Builder.java
 * @packageName yhli.work.designpatternsdemo.builderpattern.p1
 * @createTime 2022年12月05日 17:01:00
 */
public class Builder {

    /**
     * 豪华套餐
     * @param area
     * @return
     */
    public IMenu levelOne(Double area){
        return new DecorationPackageMenu(area,"豪华欧式").appendCeiling(new LevelTwoCeiling()).appendCoat(new DuluxCoat()).appendFloor(new ShengXiangFloor());
    }

    /**
     * 轻奢套餐
     * @param area
     * @return
     */
    public IMenu levelTwo(Double area){
        return new DecorationPackageMenu(area,"轻奢田园").appendCeiling(new LevelTwoCeiling()).appendCoat(new LiBangCoat()).appendTile(new MarcoPoloTile());
    }

    /**
     * 简约套餐
     * @param area
     * @return
     */
    public IMenu levelThree(Double area){
        return new DecorationPackageMenu(area,"现代简约").appendCeiling(new LevelOneCeiling()).appendCoat(new LiBangCoat()).appendTile(new DongPengTile());
    }

}
