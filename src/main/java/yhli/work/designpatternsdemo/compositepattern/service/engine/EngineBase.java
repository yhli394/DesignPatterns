package yhli.work.designpatternsdemo.compositepattern.service.engine;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import yhli.work.designpatternsdemo.compositepattern.model.EngineResult;
import yhli.work.designpatternsdemo.compositepattern.model.TreeNode;
import yhli.work.designpatternsdemo.compositepattern.model.TreeRich;
import yhli.work.designpatternsdemo.compositepattern.model.TreeRoot;
import yhli.work.designpatternsdemo.compositepattern.service.logic.LogicFilter;

import java.util.Map;

/**
 * @author yhli3
 * @ClassName EngineBase.java
 * @packageName yhli.work.designpatternsdemo.compositepattern.service.engine
 * @createTime 2023年04月12日 10:51:00
 */
public abstract class EngineBase extends EngineConfig implements IEngine{

    private static Logger logger = LoggerFactory.getLogger(EngineBase.class);

    @Override
    public abstract EngineResult process(Long treeId, String userId, TreeRich treeRich, Map<String, String> decisionMatter);

    protected TreeNode engineDecisionMaker(TreeRich treeRich,Long treeId,String userId,Map<String,String> decisionMatter){
        TreeRoot treeRoot = treeRich.getTreeRoot();
        Map<Long, TreeNode> treeNodeMap = treeRich.getTreeNodeMap();
        Long rootNodeId = treeRoot.getTreeRootNodeId();
        TreeNode treeNodeInfo = treeNodeMap.get(rootNodeId);
        while (treeNodeInfo.getNodeType().equals(1)){
            String ruleKey = treeNodeInfo.getRuleKey();
            LogicFilter logicFilter = logicFilterMap.get(ruleKey);
            String matterValue = logicFilter.matterValue(treeId, userId, decisionMatter);
            Long nextNode = logicFilter.filter(matterValue, treeNodeInfo.getTreeNodeLinkList());
            treeNodeInfo = treeNodeMap.get(nextNode);
            logger.info("决策树引擎=>{} userId：{} treeId：{} treeNode：{} ruleKey：{} matterValue：{}", treeRoot.getTreeName(), userId, treeId, treeNodeInfo.getTreeNodeId(), ruleKey, matterValue);
        }
        return treeNodeInfo;
    }

}
