package org.springframework.demo.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectDemo {

	@Pointcut("execution(* org.springframework.demo.spring.aop.AopTargetClass.*(..))")
	public void pointCut() {

	}

	@Before("pointCut()")
	public void before() {
		System.out.println("==========AOP===========> 执行Before方法");
	}


	@After("pointCut()")
	public void after() {
		System.out.println("==========AOP===========> 执行After方法");
	}

	@Around("pointCut()")
	public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("==========AOP===========> 执行Around Before方法");
		Object o = joinPoint.proceed();
		System.out.println("==========AOP===========> 执行Around After方法");
		return o;
	}

	@AfterThrowing("pointCut()")
	public void afterThrowing() {
		System.out.println("==========AOP===========> 执行AfterThrowing方法");
	}

	@AfterReturning("pointCut()")
	public void afterReturning() {
		System.out.println("==========AOP===========> 执行AfterReturning方法");
	}
}
