package yhli.work.designpatternsdemo.flyweightpattern;

/**
 * @author yhli3
 * @ClassName Stock.java
 * @packageName yhli.work.designpatternsdemo.flyweightpattern
 * @createTime 2023年04月20日 15:45:00
 */
public class Stock {

    private int total;

    private int used;

    public Stock(int total, int used) {
        this.total = total;
        this.used = used;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getUsed() {
        return used;
    }

    public void setUsed(int used) {
        this.used = used;
    }
}
