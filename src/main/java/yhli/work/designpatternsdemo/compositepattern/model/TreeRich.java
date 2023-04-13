package yhli.work.designpatternsdemo.compositepattern.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * @author yhli3
 * @ClassName TreeRich.java
 * @packageName yhli.work.designpatternsdemo.compositepattern.model
 * @createTime 2023年04月12日 10:44:00
 */
public class TreeRich {

    private static Logger logger = LoggerFactory.getLogger(TreeRich.class);

    private TreeRoot treeRoot;

    private Map<Long,TreeNode> treeNodeMap;

    public TreeRich(TreeRoot treeRoot, Map<Long, TreeNode> treeNodeMap) {
        this.treeRoot = treeRoot;
        this.treeNodeMap = treeNodeMap;
    }

    public static Logger getLogger() {
        return logger;
    }

    public static void setLogger(Logger logger) {
        TreeRich.logger = logger;
    }

    public TreeRoot getTreeRoot() {
        return treeRoot;
    }

    public void setTreeRoot(TreeRoot treeRoot) {
        this.treeRoot = treeRoot;
    }

    public Map<Long, TreeNode> getTreeNodeMap() {
        return treeNodeMap;
    }

    public void setTreeNodeMap(Map<Long, TreeNode> treeNodeMap) {
        this.treeNodeMap = treeNodeMap;
    }
}
