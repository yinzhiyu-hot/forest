package com.dtflys.forest.annotation;

import java.lang.annotation.*;

/**
 * @author gongjun
 * @since 2020-08-03
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.PARAMETER)
public @interface DataQuery {
    /**
     * URL query name
     * @return
     */
    String value();

}
