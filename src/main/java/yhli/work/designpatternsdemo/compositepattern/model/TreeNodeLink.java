package yhli.work.designpatternsdemo.compositepattern.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**树节点链路信息
 * @author yhli3
 * @ClassName TreeNodeLink.java
 * @packageName yhli.work.designpatternsdemo.compositepattern.model
 * @createTime 2023年04月12日 09:59:00
 */
public class TreeNodeLink {

    private static Logger logger = LoggerFactory.getLogger(TreeNodeLink.class);

    private Long nodeIdFrom;

    private Long nodeIdTo;

    private Integer ruleLimitType;

    private String ruleLimitValue;

    public static Logger getLogger() {
        return logger;
    }

    public static void setLogger(Logger logger) {
        TreeNodeLink.logger = logger;
    }

    public Long getNodeIdFrom() {
        return nodeIdFrom;
    }

    public void setNodeIdFrom(Long nodeIdFrom) {
        this.nodeIdFrom = nodeIdFrom;
    }

    public Long getNodeIdTo() {
        return nodeIdTo;
    }

    public void setNodeIdTo(Long nodeIdTo) {
        this.nodeIdTo = nodeIdTo;
    }

    public Integer getRuleLimitType() {
        return ruleLimitType;
    }

    public void setRuleLimitType(Integer ruleLimitType) {
        this.ruleLimitType = ruleLimitType;
    }

    public String getRuleLimitValue() {
        return ruleLimitValue;
    }

    public void setRuleLimitValue(String ruleLimitValue) {
        this.ruleLimitValue = ruleLimitValue;
    }

}
