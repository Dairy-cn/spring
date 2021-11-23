package com.dair.spring.context;

import com.dair.spring.context.config.ContextConfig;
import com.dair.spring.context.service.IUserService;
import com.dair.spring.context.service.impl.AServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Dair
 * @since
 */
public class ContextApplication {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(
				ContextConfig.class
		);
		AServiceImpl bean = context.getBean(AServiceImpl.class);
		bean.setParam();
	}
}
