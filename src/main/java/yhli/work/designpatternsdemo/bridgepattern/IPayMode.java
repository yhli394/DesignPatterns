package yhli.work.designpatternsdemo.bridgepattern;

/**
 * @author yhli3
 * @ClassName IPayMode.java
 * @packageName yhli.work.designpatternsdemo.bridgepattern
 * @createTime 2023年04月11日 14:43:00
 */
public interface IPayMode {

    boolean security(String uId);

}
