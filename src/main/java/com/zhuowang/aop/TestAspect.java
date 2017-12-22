package com.zhuowang.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.zhuowang.annotation.TestAnnotation;
/**
 * MethodInterceptor是AOP项目中的拦截器，它拦截的目标是方法，即使不是Controller中的方法。 
实现MethodInterceptor拦截器大致也分为两种，一种是实现MethodInterceptor接口，另一种利用Aspect的注解或配置
 * @author Administrator
 *
 */
@Aspect // FOR AOP
@Order(-99) //控制多个Aspect的执行顺序，越小越先执行
@Component
public class TestAspect {

	@Before("@annotation(test)") //拦截被TestAnnotation注解的方法；如果你需要拦截指定package指定规则名称的方法，可以使用表达式execution(...)
	public void beforeTest(JoinPoint point, TestAnnotation test)  throws Throwable{
		System.out.println("beforeTest:" + test.name());
	}
	
	@After("@annotation(test)")
	public void afterTest(JoinPoint point, TestAnnotation test){
		System.out.println("afterTest:" + test.name());
	}
}
