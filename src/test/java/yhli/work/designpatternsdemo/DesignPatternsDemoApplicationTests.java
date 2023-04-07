package yhli.work.designpatternsdemo;

import com.alibaba.fastjson.JSON;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import yhli.work.designpatternsdemo.abstractfactory.CacheService;
import yhli.work.designpatternsdemo.abstractfactory.JDKProxy;
import yhli.work.designpatternsdemo.abstractfactory.impl.CacheServiceImpl;
import yhli.work.designpatternsdemo.abstractfactory.impl.EGMCacheAdapter;
import yhli.work.designpatternsdemo.abstractfactory.impl.IIRCacheAdapter;
import yhli.work.designpatternsdemo.adapterpattern.InternalOrderAdapterServiceImpl;
import yhli.work.designpatternsdemo.adapterpattern.MQAdapter;
import yhli.work.designpatternsdemo.adapterpattern.RebateInfo;
import yhli.work.designpatternsdemo.adapterpattern.ThirdPartyOrderServiceImpl;
import yhli.work.designpatternsdemo.adapterpattern.mq.CreateAccount;
import yhli.work.designpatternsdemo.builderpattern.p1.Builder;
import yhli.work.designpatternsdemo.factorypattern.AwardReq;
import yhli.work.designpatternsdemo.factorypattern.AwardRes;
import yhli.work.designpatternsdemo.factorypattern.CommodityFactory;
import yhli.work.designpatternsdemo.factorypattern.IDistributionGoods;
import yhli.work.designpatternsdemo.prototypepattern.p1.QuestionBankController;
import yhli.work.designpatternsdemo.prototypepattern.p1.util.TopicRandomUtil;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = DesignPatternsDemoApplication.class)
class DesignPatternsDemoApplicationTests {

    private static Logger logger = LoggerFactory.getLogger(DesignPatternsDemoApplicationTests.class);

    @Test
    void contextLoads() {

    }

    @Test
    void testFirstAdapter(){
        InternalOrderAdapterServiceImpl internalOrderAdapterService = new InternalOrderAdapterServiceImpl();
        System.out.println("自营"+internalOrderAdapterService.isFirst("100001"));
        ThirdPartyOrderServiceImpl thirdPartyOrderService = new ThirdPartyOrderServiceImpl();
        System.out.println("非自营"+thirdPartyOrderService.isFirst("100001"));
    }


    @Test
    void testMQAdapter() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {

        CreateAccount createAccount = new CreateAccount();
        createAccount.setNumber("100001");
        createAccount.setAddress("四川省成都市金牛区西南交通大学");
        createAccount.setAccountDate(new Date());
        createAccount.setDesc("在校开户");

        HashMap<String, String> map1 = new HashMap<>();

        map1.put("userId","number");
        map1.put("businessId","number");
        map1.put("businessTime","accountDate");
        map1.put("businessDesc","desc");

        RebateInfo filter1 = MQAdapter.filter(createAccount.toString(), map1);

        System.out.println("适配前"+createAccount.toString());
        System.out.println("适配后"+JSON.toJSONString(filter1));

    }


    @Test
    void testPrototypePattern() throws CloneNotSupportedException {
        //Map<String, String> map = new HashMap<String, String>(){{
        //    put("A", "JAVA2 EE");
        //    put("B", "JAVA2 Card");
        //    put("C", "JAVA2 ME");
        //    put("D", "JAVA2 HE");
        //    put("E", "JAVA2 SE");
        //}};
        //TopicRandomUtil.random(map,"D");
        QuestionBankController questionBankController = new QuestionBankController();
        logger.info(questionBankController.createPaper("小李","100"));
        logger.info(questionBankController.createPaper("小王","101"));
        logger.info(questionBankController.createPaper("小青","102"));
    }

    @Test
    void testBuilderPattern(){
        Builder builder = new Builder();
        logger.info(builder.levelOne(132.52D).getDetail());
        logger.info(builder.levelTwo(98.25D).getDetail());
        logger.info(builder.levelThree(85.43D).getDetail());
    }

    @Test
    void testCommodityDeliver(){
        IDistributionGoods commodityService = CommodityFactory.getCommodityService(1);
        AwardRes awardRes = commodityService.sendGood(new AwardReq(1, "100000"));
        logger.info(JSON.toJSONString(awardRes));
    }

    @Test
    void testCacheService(){
        CacheService proxy = JDKProxy.getProxy(CacheServiceImpl.class, new EGMCacheAdapter());
        proxy.set("liyuehong","李越宏");
        System.out.println(proxy.get("liyuehong"));

        CacheService proxy1 = JDKProxy.getProxy(CacheServiceImpl.class, new IIRCacheAdapter());
        proxy1.set("xiaohong","小红");
        System.out.println(proxy1.get("xiaohong"));
    }

}
