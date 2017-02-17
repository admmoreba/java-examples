package com.botkul.spring.utils;

import java.lang.reflect.Proxy;
import org.springframework.beans.factory.config.AbstractFactoryBean;

public class CachingProxyFactoryBean extends AbstractFactoryBean<Object> {
	public Object target;

	@Override
	protected Object createInstance() throws Exception {
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), 
				target.getClass().getInterfaces(),
					new CachingInvoctionHandler(target));
	}
	
	@Override
	public Class<?> getObjectType() {
		return this.getClass();
	}

	public void setTarget(Object target) {
		this.target = target;
	}
}
