package yhli.work.designpatternsdemo.proxydesignpattern;

import yhli.work.designpatternsdemo.proxydesignpattern.annotation.Select;

/**
 * @author yhli3
 * @ClassName IUserDao.java
 * @packageName yhli.work.designpatternsdemo.proxydesignpattern
 * @createTime 2023年04月22日 14:57:00
 */
public interface IUserDao {

    @Select("select userName from user where id = #{uId}")
    String queryUserInfo(String uId);

}
