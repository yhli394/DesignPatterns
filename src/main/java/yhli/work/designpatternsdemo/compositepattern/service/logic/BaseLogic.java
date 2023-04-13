package yhli.work.designpatternsdemo.compositepattern.service.logic;

import yhli.work.designpatternsdemo.compositepattern.model.TreeNodeLink;

import java.util.List;
import java.util.Map;

/**
 * @author yhli3
 * @ClassName BaseLogic.java
 * @packageName yhli.work.designpatternsdemo.compositepattern.service.logic
 * @createTime 2023年04月12日 10:15:00
 */
public abstract class BaseLogic implements LogicFilter{

    @Override
    public Long filter(String matterValue, List<TreeNodeLink> treeNodeLinkList) {
        for (TreeNodeLink treeNodeLink : treeNodeLinkList) {
            if (decisionLogic(matterValue,treeNodeLink)){
                return treeNodeLink.getNodeIdTo();
            }
        }
        return 0L;
    }

    @Override
    public abstract String matterValue(Long treeId, String userId, Map<String, String> decisionMatter);

    private boolean decisionLogic(String matterValue,TreeNodeLink treeNodeLink){
        switch (treeNodeLink.getRuleLimitType()){
            case 1:
                return matterValue.equals(treeNodeLink.getRuleLimitValue());
            case 2:
                return Double.parseDouble(matterValue)>Double.parseDouble(treeNodeLink.getRuleLimitValue());
            case 3:
                return Double.parseDouble(matterValue)<Double.parseDouble(treeNodeLink.getRuleLimitValue());
            case 4:
                return Double.parseDouble(matterValue)>=Double.parseDouble(treeNodeLink.getRuleLimitValue());
            case 5:
                return Double.parseDouble(matterValue)<=Double.parseDouble(treeNodeLink.getRuleLimitValue());
            default:
                return false;
        }
    }

}
