package com.dair.spring.context;

import com.dair.spring.context.config.ContextConfig;
import com.dair.spring.context.service.IUserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Dair
 * @since
 */
public class ContextApplication {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				ContextConfig.class
		);
		IUserService bean = context.getBean(IUserService.class);
		System.out.println(bean);
	}
}
