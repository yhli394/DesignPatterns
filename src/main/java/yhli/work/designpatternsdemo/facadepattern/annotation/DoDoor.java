package yhli.work.designpatternsdemo.facadepattern.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author yhli3
 * @ClassName DoDoor.java
 * @packageName yhli.work.designpatternsdemo.facadepattern.annotation
 * @createTime 2023年04月18日 14:28:00
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface DoDoor {

    String key() default "";

    String returnJson() default "";

}
