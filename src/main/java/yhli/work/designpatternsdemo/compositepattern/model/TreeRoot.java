package yhli.work.designpatternsdemo.compositepattern.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**树根信息
 * @author yhli3
 * @ClassName TreeRoot.java
 * @packageName yhli.work.designpatternsdemo.compositepattern.model
 * @createTime 2023年04月12日 10:07:00
 */
public class TreeRoot {

    private static Logger logger = LoggerFactory.getLogger(TreeRoot.class);

    private Long treeId;

    private Long treeRootNodeId;

    private String treeName;

    public static Logger getLogger() {
        return logger;
    }

    public static void setLogger(Logger logger) {
        TreeRoot.logger = logger;
    }

    public Long getTreeId() {
        return treeId;
    }

    public void setTreeId(Long treeId) {
        this.treeId = treeId;
    }

    public Long getTreeRootNodeId() {
        return treeRootNodeId;
    }

    public void setTreeRootNodeId(Long treeRootNodeId) {
        this.treeRootNodeId = treeRootNodeId;
    }

    public String getTreeName() {
        return treeName;
    }

    public void setTreeName(String treeName) {
        this.treeName = treeName;
    }
}
