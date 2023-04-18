package yhli.work.designpatternsdemo.facadepattern.config;

import jakarta.annotation.Resource;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author yhli3
 * @ClassName StarterAutoConfigure.java
 * @packageName yhli.work.designpatternsdemo.facadepattern.config
 * @createTime 2023年04月18日 15:07:00
 */
@Configuration
@ConditionalOnClass(StarterService.class)
@EnableConfigurationProperties(StarterServiceProperties.class)
public class StarterAutoConfigure {

    @Resource
    private StarterServiceProperties properties;

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(prefix = "itstack.door",value = "enabled",havingValue = "true")
    StarterService starterService(){
        return new StarterService(properties.getUserStr());
    }

}
