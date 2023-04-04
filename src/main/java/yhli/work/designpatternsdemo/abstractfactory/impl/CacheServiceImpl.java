package yhli.work.designpatternsdemo.abstractfactory.impl;

import org.springframework.stereotype.Service;
import yhli.work.designpatternsdemo.abstractfactory.CacheService;
import yhli.work.designpatternsdemo.abstractfactory.util.RedisUtils;

import java.util.concurrent.TimeUnit;

/**
 * @author yhli3
 * @ClassName CacheServiceImpl.java
 * @packageName yhli.work.designpatternsdemo.abstractfactory.impl
 * @createTime 2022年12月03日 12:57:00
 */
@Service
public class CacheServiceImpl implements CacheService {

    private RedisUtils redisUtils = new RedisUtils();

    @Override
    public String get(String key) {
        return redisUtils.get(key);
    }

    @Override
    public void set(String key, String value) {
        redisUtils.set(key, value);
    }

    @Override
    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        redisUtils.set(key, value, timeout, timeUnit);
    }

    @Override
    public void del(String key) {
        redisUtils.del(key);
    }

}
