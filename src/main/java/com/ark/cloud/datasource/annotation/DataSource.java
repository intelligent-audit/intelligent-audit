/**
 * Copyright (c) 2018 人人开源 All rights reserved.
 *

 *
 * 版权所有，侵权必究！
 */

package com.ark.cloud.datasource.annotation;

import java.lang.annotation.*;

/**
 * 多数据源注解
 *
 * @author peixiuyue
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface DataSource {
    String value() default "";
}
