package yhli.work.designpatternsdemo.abstractfactory.impl;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import yhli.work.designpatternsdemo.abstractfactory.ICacheAdapter;
import yhli.work.designpatternsdemo.abstractfactory.IIR;

import java.util.concurrent.TimeUnit;

/**
 * @author yhli3
 * @ClassName IIRCacheAdapter.java
 * @packageName yhli.work.designpatternsdemo.abstractfactory.impl
 * @createTime 2022年12月03日 12:33:00
 */
@Service
public class IIRCacheAdapter implements ICacheAdapter {

    private IIR iir = new IIR();

    @Override
    public String get(String key) {
        return iir.get(key);
    }

    @Override
    public void set(String key, String value) {
        iir.set(key, value);
    }

    @Override
    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        iir.setExpire(key, value, timeout, timeUnit);
    }

    @Override
    public void del(String key) {
        iir.del(key);
    }

}
