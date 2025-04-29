package com.example.rest.webservices.springaop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class PerformanceTrackingAspect {
    private Logger logger = LoggerFactory.getLogger(getClass());
    @Around( "execution(* com.example.rest.webservices.springaop.services.*.*(..))")
    public Object findExecutionTime(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();

        var returnValue = proceedingJoinPoint.proceed();

        long stopTime = System.currentTimeMillis();

        long executionTime = stopTime - startTime;
        logger.info("Around Aspect - {} Method execution time: {} ms", proceedingJoinPoint, executionTime);

        return returnValue;
    }
}
