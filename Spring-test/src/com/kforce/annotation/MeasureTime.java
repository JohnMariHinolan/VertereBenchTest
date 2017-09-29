package com.kforce.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Member;

import org.springframework.ui.Model;
 
@Documented
@Target(ElementType.METHOD)
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface MeasureTime {
	 int studentAge() default 18;
	    String studentName();
	    String stuAddress();
	    String stuStream() default "CSE";
//	    
//	    enum HandlesAnnotation implements AnnotationHandler<MeasureTime> {
//	        INSTANCE;
//
//	        @Override
//	        public void process(Model model, Member member, MeasureTime ca) {
//	            // do something with a model based on the members details and the annotation state.
//	        }
//	    }
}
