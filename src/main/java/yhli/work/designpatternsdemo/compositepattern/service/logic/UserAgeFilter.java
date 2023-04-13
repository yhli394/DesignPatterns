package yhli.work.designpatternsdemo.compositepattern.service.logic;

import java.util.Map;

/**
 * @author yhli3
 * @ClassName UserAgeFilter.java
 * @packageName yhli.work.designpatternsdemo.compositepattern.service.logic
 * @createTime 2023年04月12日 10:35:00
 */
public class UserAgeFilter extends BaseLogic{
    @Override
    public String matterValue(Long treeId, String userId, Map<String, String> decisionMatter) {
        return decisionMatter.get("age");
    }
}
