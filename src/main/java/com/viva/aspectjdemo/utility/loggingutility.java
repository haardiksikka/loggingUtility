package com.viva.aspectjdemo.utility;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import com.viva.aspectjdemo.loginaction.DemoClass;

@Aspect
@Component
public class loggingutility {
	
	@Around("@annotation(com.viva.aspectjdemo.customannotation.logResults)")
	public Object logresults(ProceedingJoinPoint joinPoint) throws Throwable {
		 long start = System.currentTimeMillis();
		// Object[] arguments = joinPoint.getArgs();

		 
		 	System.out.println("elslxs");
		    Object proceed = joinPoint.proceed();
		    
		    DemoClass instance = (DemoClass) joinPoint.getTarget();
		    
		    
		    long executionTime = System.currentTimeMillis() - start;
		    
		 
		    System.out.println(joinPoint.getSignature() + " executed in " + executionTime + "ms" + "result "+instance.response.getSuccess());
		    return proceed;
	}
}
