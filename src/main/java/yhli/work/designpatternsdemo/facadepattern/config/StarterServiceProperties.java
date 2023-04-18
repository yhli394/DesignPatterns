package yhli.work.designpatternsdemo.facadepattern.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author yhli3
 * @ClassName StarterServiceProperties.java
 * @packageName yhli.work.designpatternsdemo.facadepattern.config
 * @createTime 2023年04月18日 14:57:00
 */
@ConfigurationProperties("itstack.door")
public class StarterServiceProperties {

    private String userStr;

    public String getUserStr(){
        return userStr;
    }

    public void setUserStr(String userStr){
        this.userStr = userStr;
    }

}
