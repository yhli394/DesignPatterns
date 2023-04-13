package yhli.work.designpatternsdemo.compositepattern.service.engine;

import yhli.work.designpatternsdemo.compositepattern.model.EngineResult;
import yhli.work.designpatternsdemo.compositepattern.model.TreeNode;
import yhli.work.designpatternsdemo.compositepattern.model.TreeRich;

import java.util.Map;

/**
 * @author yhli3
 * @ClassName TreeEngineHandle.java
 * @packageName yhli.work.designpatternsdemo.compositepattern.service.engine
 * @createTime 2023年04月12日 11:09:00
 */
public class TreeEngineHandler extends EngineBase{
    @Override
    public EngineResult process(Long treeId, String userId, TreeRich treeRich, Map<String, String> decisionMatter) {
        TreeNode treeNode = engineDecisionMaker(treeRich, treeId, userId, decisionMatter);
        return new EngineResult(userId,treeId,treeNode.getTreeNodeId(),treeNode.getNodeValue());
    }
}
