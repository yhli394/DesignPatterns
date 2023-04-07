package yhli.work.designpatternsdemo.adapterpattern;

import yhli.work.designpatternsdemo.adapterpattern.service.InternalOrderService;

/**
 * @author yhli3
 * @ClassName InternalOrderAdapterServiceImpl.java
 * @packageName yhli.work.designpatternsdemo.adapterpattern
 * @createTime 2023年04月07日 13:40:00
 */
public class InternalOrderAdapterServiceImpl implements OrderAdapterService{

    private InternalOrderService internalOrderService = new InternalOrderService();

    @Override
    public boolean isFirst(String uId) {
        return internalOrderService.queryUserOrderCount(uId)<=1;
    }


}
