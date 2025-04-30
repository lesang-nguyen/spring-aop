package com.example.rest.webservices.springaop.config;

import org.aspectj.lang.annotation.Pointcut;

public class CommonPointcutConfig {

    @Pointcut("execution(* com.example.rest.webservices.springaop.*.*.*(..))")
    public void businessAndDataPackageConfig() {
    }

    @Pointcut("execution(* com.example.rest.webservices.springaop.services.bussiness.*(..))")
    public void businessPackageConfig() {
    }

    @Pointcut("execution(* com.example.rest.webservices.springaop.services.data.*(..))")
    public void dataPackageConfig() {
    }

    @Pointcut("bean(*Service*)")
    public void dataPackageConfigUsingBean() {
    }

    @Pointcut("annotation(com.example.rest.webservices.springaop.annotations.TrackTime)")
    public void annotationPointcut() {
    }
}
