package yhli.work.designpatternsdemo.compositepattern.service.logic;

import yhli.work.designpatternsdemo.compositepattern.model.TreeNodeLink;

import java.util.List;
import java.util.Map;

/**
 * @author yhli3
 * @ClassName LogicFilter.java
 * @packageName yhli.work.designpatternsdemo.compositepattern.service.logic
 * @createTime 2023年04月12日 09:58:00
 */
public interface LogicFilter {

    //过滤
    Long filter(String matterValue, List<TreeNodeLink> treeNodeLinkList);


    String matterValue(Long treeId, String userId, Map<String,String> decisionMatter);

}
