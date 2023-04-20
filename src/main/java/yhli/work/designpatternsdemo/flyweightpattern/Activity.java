package yhli.work.designpatternsdemo.flyweightpattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

/**
 * @author yhli3
 * @ClassName Activity.java
 * @packageName yhli.work.designpatternsdemo.flyweightpattern
 * @createTime 2023年04月20日 15:44:00
 */
public class Activity {

    private static Logger logger = LoggerFactory.getLogger(Activity.class);

    private Long id;

    private String name;

    private String desc;

    private Date startTime;

    private Date stopTime;

    private Stock stock;

    public Activity(Long id, String name, String desc, Date startTime, Date stopTime, Stock stock) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.startTime = startTime;
        this.stopTime = stopTime;
        this.stock = stock;
    }

    public Activity() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getStopTime() {
        return stopTime;
    }

    public void setStopTime(Date stopTime) {
        this.stopTime = stopTime;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }
}
