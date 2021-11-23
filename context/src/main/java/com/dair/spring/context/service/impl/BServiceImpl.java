package com.dair.spring.context.service.impl;

import com.dair.spring.context.service.BService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @author Dair
 * @since
 */
@Service
public class BServiceImpl implements BService {
	
	@Autowired
	private AServiceImpl aService;
	
	
	@Override
	public void setParam() {
		System.out.println(aService.toString());
	}
}
