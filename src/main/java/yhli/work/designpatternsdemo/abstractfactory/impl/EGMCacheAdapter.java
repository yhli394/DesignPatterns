package yhli.work.designpatternsdemo.abstractfactory.impl;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import yhli.work.designpatternsdemo.abstractfactory.EGM;
import yhli.work.designpatternsdemo.abstractfactory.ICacheAdapter;

import java.util.concurrent.TimeUnit;

/**
 * @author yhli3
 * @ClassName EGMCacheAdapter.java
 * @packageName yhli.work.designpatternsdemo.abstractfactory.impl
 * @createTime 2022年12月03日 12:27:00
 */
@Service
public class EGMCacheAdapter implements ICacheAdapter {

    private EGM egm = new EGM();

    @Override
    public String get(String key) {
        return egm.gain(key);
    }

    @Override
    public void set(String key, String value) {
        egm.set(key, value);
    }

    @Override
    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        egm.setEx(key, value, timeout, timeUnit);
    }

    @Override
    public void del(String key) {
        egm.delete(key);
    }


}
