package yhli.work.designpatternsdemo.facadepattern.config;

/**
 * @author yhli3
 * @ClassName StarterService.java
 * @packageName yhli.work.designpatternsdemo.facadepattern.config
 * @createTime 2023年04月18日 14:47:00
 */
public class StarterService {

    private String userStr;

    public StarterService(String userStr){
        this.userStr = userStr;
    }

    public String[] split(String separatorChar){
        return this.userStr.split(separatorChar);
    }

}
