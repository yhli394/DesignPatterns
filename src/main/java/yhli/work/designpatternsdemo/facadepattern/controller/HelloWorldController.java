package yhli.work.designpatternsdemo.facadepattern.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import yhli.work.designpatternsdemo.facadepattern.UserInfo;
import yhli.work.designpatternsdemo.facadepattern.annotation.DoDoor;

/**
 * @author yhli3
 * @ClassName HelloWorldController.java
 * @packageName yhli.work.designpatternsdemo.facadepattern.controller
 * @createTime 2023年04月18日 14:23:00
 */
@RestController
public class HelloWorldController {

    @Value("8080")
    private int port;

    @DoDoor(key = "userId",returnJson = "{\"code\":\"1111\",\"info\":\"非白名单可访问用户拦截！\"}")
    @RequestMapping(path = "/api/queryUserInfo",method = RequestMethod.GET)
    public UserInfo queryUserInfo(@RequestParam String userId){
        return new UserInfo("虫虫:" + userId, "19", "天津市南开区旮旯胡同100号");
    }


}
