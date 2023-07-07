package yhli.work.designpatternsdemo;


import com.alibaba.fastjson.JSON;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import yhli.work.designpatternsdemo.mementodesignpattern.Admin;
import yhli.work.designpatternsdemo.mementodesignpattern.ConfigFile;
import yhli.work.designpatternsdemo.mementodesignpattern.ConfigOriginator;
import java.util.Date;

public class MementoTest {

    private static Logger logger = LoggerFactory.getLogger(MementoTest.class);

    @Test
    public void test(){
        Admin admin = new Admin();
        ConfigOriginator configOriginator = new ConfigOriginator();

        configOriginator.setConfigFile(new ConfigFile("101","A",new Date(),"李同学"));
        admin.append(configOriginator.saveMemento());

        configOriginator.setConfigFile(new ConfigFile("102","B",new Date(),"李同学"));
        admin.append(configOriginator.saveMemento());

        configOriginator.setConfigFile(new ConfigFile("103","C",new Date(),"李同学"));
        admin.append(configOriginator.saveMemento());

        configOriginator.setConfigFile(new ConfigFile("104","D",new Date(),"李同学"));
        admin.append(configOriginator.saveMemento());

        configOriginator.getMemento(admin.undo());
        logger.info("回滚：{}", JSON.toJSONString(configOriginator.getConfigFile()));

        configOriginator.getMemento(admin.undo());
        logger.info("回滚：{}", JSON.toJSONString(configOriginator.getConfigFile()));

        configOriginator.getMemento(admin.redo());
        logger.info("前进：{}", JSON.toJSONString(configOriginator.getConfigFile()));

        configOriginator.getMemento(admin.get("102"));
        logger.info("获取：{}", JSON.toJSONString(configOriginator.getConfigFile()));

    }

}
