package yhli.work.designpatternsdemo.compositepattern.service.engine;

import yhli.work.designpatternsdemo.compositepattern.model.EngineResult;
import yhli.work.designpatternsdemo.compositepattern.model.TreeRich;

import java.util.Map;

/**
 * @author yhli3
 * @ClassName IEngine.java
 * @packageName yhli.work.designpatternsdemo.compositepattern.service.engine
 * @createTime 2023年04月12日 10:38:00
 */
public interface IEngine {

    EngineResult process(final Long treeId, final String userId, TreeRich treeRich, final Map<String,String> decisionMatter);

}
