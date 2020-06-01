package com.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import javax.validation.OverridesAttribute;

import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;


@Target(PARAMETER)
@Retention(RUNTIME)
@Documented
@javax.validation.constraints.Min(0)
public @interface Min {
    String field();
    String message() default "{field} {javax.validation.constraints.Min.message}";
    @OverridesAttribute(constraint = javax.validation.constraints.Min.class, name = "value") long value();
}
