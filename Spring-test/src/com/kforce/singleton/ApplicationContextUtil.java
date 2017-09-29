package com.kforce.singleton;

import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

import com.kforce.config.ConfigObj;

public class ApplicationContextUtil {

	private static AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
	
	static {
		
		ctx.register(ConfigObj.class);
	}
	public static Object getBean(Class<?> beans) {
		
		ctx.refresh();
		Object bean = ctx.getBean(beans);
		return bean;
		
	}
	
	public static void close() {
		ctx.close();
		
	}
}
