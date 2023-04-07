package yhli.work.designpatternsdemo.abstractfactory;

import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**抽象工厂了解一下即可
 * @author yhli3
 * @ClassName ICacheAdapter.java
 * @packageName yhli.work.designpatternsdemo.abstractfactory
 * @createTime 2022年12月03日 12:22:00
 */
@Component
public interface ICacheAdapter {

    String get(String key);

    void set(String key,String value);

    void set(String key, String value, long timeout, TimeUnit timeUnit);

    void del(String key);

}
