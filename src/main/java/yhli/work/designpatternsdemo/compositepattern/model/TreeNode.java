package yhli.work.designpatternsdemo.compositepattern.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**树节点信息
 * @author yhli3
 * @ClassName TreeNode.java
 * @packageName yhli.work.designpatternsdemo.compositepattern.model
 * @createTime 2023年04月12日 10:03:00
 */
public class TreeNode {

    private static Logger logger = LoggerFactory.getLogger(TreeNode.class);

    private Long treeId;

    private Long treeNodeId;

    private Integer nodeType;

    private String nodeValue;

    private String ruleKey;

    private String ruleDesc;

    private List<TreeNodeLink> treeNodeLinkList;

    public static Logger getLogger() {
        return logger;
    }

    public static void setLogger(Logger logger) {
        TreeNode.logger = logger;
    }

    public Long getTreeId() {
        return treeId;
    }

    public void setTreeId(Long treeId) {
        this.treeId = treeId;
    }

    public Long getTreeNodeId() {
        return treeNodeId;
    }

    public void setTreeNodeId(Long treeNodeId) {
        this.treeNodeId = treeNodeId;
    }

    public Integer getNodeType() {
        return nodeType;
    }

    public void setNodeType(Integer nodeType) {
        this.nodeType = nodeType;
    }

    public String getNodeValue() {
        return nodeValue;
    }

    public void setNodeValue(String nodeValue) {
        this.nodeValue = nodeValue;
    }

    public String getRuleKey() {
        return ruleKey;
    }

    public void setRuleKey(String ruleKey) {
        this.ruleKey = ruleKey;
    }

    public String getRuleDesc() {
        return ruleDesc;
    }

    public void setRuleDesc(String ruleDesc) {
        this.ruleDesc = ruleDesc;
    }

    public List<TreeNodeLink> getTreeNodeLinkList() {
        return treeNodeLinkList;
    }

    public void setTreeNodeLinkList(List<TreeNodeLink> treeNodeLinkList) {
        this.treeNodeLinkList = treeNodeLinkList;
    }
}
