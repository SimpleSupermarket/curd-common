package org.simplesupermarket.web.annotation;

import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface FromDb {
    String value() default "";
}
