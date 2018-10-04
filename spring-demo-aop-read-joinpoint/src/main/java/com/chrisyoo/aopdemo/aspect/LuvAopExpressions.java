package com.chrisyoo.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LuvAopExpressions {

	@Pointcut("execution(* com.chrisyoo.aopdemo.dao.*.*(..))")
	public void forDaoPackage() {}
	
	@Pointcut("execution(* com.chrisyoo.aopdemo.dao.*.get*(..))")
	public void getter() {}
	
	@Pointcut("execution(* com.chrisyoo.aopdemo.dao.*.set*(..))")
	public void setter() {}
	
	@Pointcut("forDaoPackage() && !(getter() || setter())")
	public void forDaoPackageNoGetterSetter() {}
	
}
