package yhli.work.designpatternsdemo.proxydesignpattern.annotation;

import java.lang.annotation.*;

/**
 * @author yhli3
 * @ClassName Select.java
 * @packageName yhli.work.designpatternsdemo.proxydesignpattern.annotation
 * @createTime 2023年04月22日 14:55:00
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Select {

    String value() default "";

}
