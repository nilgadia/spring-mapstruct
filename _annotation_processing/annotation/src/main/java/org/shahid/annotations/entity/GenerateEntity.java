package org.shahid.annotations.entity;

import java.lang.annotation.*;

/**
 * The GenerateEntity annotation type, used to flag bean/DTO interfaces which
 * corresponding implementation will be generated by GenerateEntityProcessor.
 *
 * @author Shaikh Shahid Iqbal
 */
@Documented
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.SOURCE)
public @interface GenerateEntity {

    /**
     * Whether the annotation method represents the Key field.
     */
    boolean id() default false;
}
