package com.botkul.spring.utils;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class CachingInvoctionHandler implements InvocationHandler   {
	Object target;
	
	public CachingInvoctionHandler(Object target){
		this.target=target;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object returnValue=null;
		
		String key=method.getReturnType()+method.getName()+"(";
		if(args !=null && args.length >0){
			for (Object obj : args) {
				key+=obj.toString();
			}
		}
		key+=")";
		
		returnValue=CacheUtil.cache.get(key);
		if (returnValue==null) {
			System.out.println("Cache Miss!!! Hitting DB");
			returnValue=method.invoke(target, args);
			CacheUtil.cache.put(key, returnValue);
		}
		else{
			System.out.println("Cache Hit...!!!");
		}
		return returnValue;
	}
}
