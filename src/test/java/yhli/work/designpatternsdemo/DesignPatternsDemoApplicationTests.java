package yhli.work.designpatternsdemo;

import com.alibaba.fastjson.JSON;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
import yhli.work.designpatternsdemo.bridgepattern.FacePayment;
import yhli.work.designpatternsdemo.bridgepattern.FingerprintPayment;
import yhli.work.designpatternsdemo.bridgepattern.WxPay;
import yhli.work.designpatternsdemo.bridgepattern.ZfbPay;
import yhli.work.designpatternsdemo.builderpattern.p1.Builder;
import yhli.work.designpatternsdemo.compositepattern.model.*;
import yhli.work.designpatternsdemo.compositepattern.service.engine.TreeEngineHandler;
import yhli.work.designpatternsdemo.factorypattern.AwardReq;
import yhli.work.designpatternsdemo.factorypattern.AwardRes;
import yhli.work.designpatternsdemo.factorypattern.CommodityFactory;
import yhli.work.designpatternsdemo.factorypattern.IDistributionGoods;
import yhli.work.designpatternsdemo.prototypepattern.p1.QuestionBankController;

import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.util.*;


//@RunWith(SpringRunner.class)
//@SpringBootTest(classes = DesignPatternsDemoApplication.class)
public class DesignPatternsDemoApplicationTests {

    private static Logger logger = LoggerFactory.getLogger(DesignPatternsDemoApplicationTests.class);

    private TreeRich treeRich;


    @BeforeEach
    public void init() {

        // 节点：1
        TreeNode treeNode_01 = new TreeNode();
        treeNode_01.setTreeId(10001L);
        treeNode_01.setTreeNodeId(1L);
        treeNode_01.setNodeType(1);
        treeNode_01.setNodeValue(null);
        treeNode_01.setRuleKey("userGender");
        treeNode_01.setRuleDesc("用户性别[男/女]");

        // 链接：1->11
        TreeNodeLink treeNodeLink_11 = new TreeNodeLink();
        treeNodeLink_11.setNodeIdFrom(1L);
        treeNodeLink_11.setNodeIdTo(11L);
        treeNodeLink_11.setRuleLimitType(1);
        treeNodeLink_11.setRuleLimitValue("man");

        // 链接：1->12
        TreeNodeLink treeNodeLink_12 = new TreeNodeLink();
        treeNodeLink_12.setNodeIdFrom(1L);
        treeNodeLink_12.setNodeIdTo(12L);
        treeNodeLink_12.setRuleLimitType(1);
        treeNodeLink_12.setRuleLimitValue("woman");

        List<TreeNodeLink> treeNodeLinkList_1 = new ArrayList<>();
        treeNodeLinkList_1.add(treeNodeLink_11);
        treeNodeLinkList_1.add(treeNodeLink_12);

        treeNode_01.setTreeNodeLinkList(treeNodeLinkList_1);

        // 节点：11
        TreeNode treeNode_11 = new TreeNode();
        treeNode_11.setTreeId(10001L);
        treeNode_11.setTreeNodeId(11L);
        treeNode_11.setNodeType(1);
        treeNode_11.setNodeValue(null);
        treeNode_11.setRuleKey("userAge");
        treeNode_11.setRuleDesc("用户年龄");

        // 链接：11->111
        TreeNodeLink treeNodeLink_111 = new TreeNodeLink();
        treeNodeLink_111.setNodeIdFrom(11L);
        treeNodeLink_111.setNodeIdTo(111L);
        treeNodeLink_111.setRuleLimitType(3);
        treeNodeLink_111.setRuleLimitValue("25");

        // 链接：11->112
        TreeNodeLink treeNodeLink_112 = new TreeNodeLink();
        treeNodeLink_112.setNodeIdFrom(11L);
        treeNodeLink_112.setNodeIdTo(112L);
        treeNodeLink_112.setRuleLimitType(4);
        treeNodeLink_112.setRuleLimitValue("25");

        List<TreeNodeLink> treeNodeLinkList_11 = new ArrayList<>();
        treeNodeLinkList_11.add(treeNodeLink_111);
        treeNodeLinkList_11.add(treeNodeLink_112);

        treeNode_11.setTreeNodeLinkList(treeNodeLinkList_11);

        // 节点：12
        TreeNode treeNode_12 = new TreeNode();
        treeNode_12.setTreeId(10001L);
        treeNode_12.setTreeNodeId(12L);
        treeNode_12.setNodeType(1);
        treeNode_12.setNodeValue(null);
        treeNode_12.setRuleKey("userAge");
        treeNode_12.setRuleDesc("用户年龄");

        // 链接：12->121
        TreeNodeLink treeNodeLink_121 = new TreeNodeLink();
        treeNodeLink_121.setNodeIdFrom(12L);
        treeNodeLink_121.setNodeIdTo(121L);
        treeNodeLink_121.setRuleLimitType(3);
        treeNodeLink_121.setRuleLimitValue("25");

        // 链接：12->122
        TreeNodeLink treeNodeLink_122 = new TreeNodeLink();
        treeNodeLink_122.setNodeIdFrom(12L);
        treeNodeLink_122.setNodeIdTo(122L);
        treeNodeLink_122.setRuleLimitType(4);
        treeNodeLink_122.setRuleLimitValue("25");

        List<TreeNodeLink> treeNodeLinkList_12 = new ArrayList<>();
        treeNodeLinkList_12.add(treeNodeLink_121);
        treeNodeLinkList_12.add(treeNodeLink_122);

        treeNode_12.setTreeNodeLinkList(treeNodeLinkList_12);

        // 节点：111
        TreeNode treeNode_111 = new TreeNode();
        treeNode_111.setTreeId(10001L);
        treeNode_111.setTreeNodeId(111L);
        treeNode_111.setNodeType(2);
        treeNode_111.setNodeValue("果实A");

        // 节点：112
        TreeNode treeNode_112 = new TreeNode();
        treeNode_112.setTreeId(10001L);
        treeNode_112.setTreeNodeId(112L);
        treeNode_112.setNodeType(2);
        treeNode_112.setNodeValue("果实B");

        // 节点：121
        TreeNode treeNode_121 = new TreeNode();
        treeNode_121.setTreeId(10001L);
        treeNode_121.setTreeNodeId(121L);
        treeNode_121.setNodeType(2);
        treeNode_121.setNodeValue("果实C");

        // 节点：122
        TreeNode treeNode_122 = new TreeNode();
        treeNode_122.setTreeId(10001L);
        treeNode_122.setTreeNodeId(122L);
        treeNode_122.setNodeType(2);
        treeNode_122.setNodeValue("果实D");

        // 树根
        TreeRoot treeRoot = new TreeRoot();
        treeRoot.setTreeId(10001L);
        treeRoot.setTreeRootNodeId(1L);
        treeRoot.setTreeName("规则决策树");

        Map<Long, TreeNode> treeNodeMap = new HashMap<>();
        treeNodeMap.put(1L, treeNode_01);
        treeNodeMap.put(11L, treeNode_11);
        treeNodeMap.put(12L, treeNode_12);
        treeNodeMap.put(111L, treeNode_111);
        treeNodeMap.put(112L, treeNode_112);
        treeNodeMap.put(121L, treeNode_121);
        treeNodeMap.put(122L, treeNode_122);

        treeRich = new TreeRich(treeRoot, treeNodeMap);


    }

    @Test
    public void test_tree(){
        logger.info("决策树信息:\r\n"+JSON.toJSONString(treeRich));

        TreeEngineHandler treeEngineHandler = new TreeEngineHandler();

        HashMap<String, String> map = new HashMap<>();

        map.put("gender","man");
        map.put("age","29");

        EngineResult result = treeEngineHandler.process(10001L, "2020212181", treeRich, map);

        logger.info("过滤结果：{}",JSON.toJSONString(result));

    }


    @Test
    void test_pay(){
        logger.info("模拟微信人脸支付");
        WxPay wxPay = new WxPay(new FacePayment());
        wxPay.transfer("wx_1009","1009",new BigDecimal(100));

        logger.info("模拟支付宝指纹支付");
        ZfbPay zfbPay = new ZfbPay(new FingerprintPayment());
        zfbPay.transfer("jfb_123456","123456",new BigDecimal(100));
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
