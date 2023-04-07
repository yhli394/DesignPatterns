package yhli.work.designpatternsdemo.adapterpattern;

import yhli.work.designpatternsdemo.adapterpattern.service.ThirdPartyOrderService;

/**
 * @author yhli3
 * @ClassName ThirdPartyOrderServiceImpl.java
 * @packageName yhli.work.designpatternsdemo.adapterpattern
 * @createTime 2023年04月07日 13:41:00
 */
public class ThirdPartyOrderServiceImpl implements OrderAdapterService{

    private ThirdPartyOrderService thirdPartyOrderService = new ThirdPartyOrderService();

    @Override
    public boolean isFirst(String uId) {
        return thirdPartyOrderService.isFirstOrder(uId);
    }

}
