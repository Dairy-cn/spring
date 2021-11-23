package com.dair.spring.context.service.impl;

import com.dair.spring.context.service.AService;
import com.dair.spring.context.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @author Dair
 * @since
 */
@Service
public class AServiceImpl implements AService {
	
	@Autowired
	private BServiceImpl bService;
	
	@Override
	public void setParam() {
		System.out.println(bService.toString());
	}
}
