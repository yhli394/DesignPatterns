package yhli.work.designpatternsdemo.abstractfactory;

import java.util.concurrent.TimeUnit;

/**
 * @author yhli3
 * @ClassName CacheService.java
 * @packageName yhli.work.designpatternsdemo.abstractfactory
 * @createTime 2022年12月03日 13:00:00
 */
public interface CacheService {

    String get(final String key);

    void set(String key, String value);

    void set(String key, String value, long timeout, TimeUnit timeUnit);

    void del(String key);
}
