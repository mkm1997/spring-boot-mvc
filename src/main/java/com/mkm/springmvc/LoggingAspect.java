package com.mkm.springmvc;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    public static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);

    @Before("execution(public * com.mkm.springmvc.HomeController.*(*))")
    public void log(){
        LOGGER.info("Getting all aliens from aspect before the class has executed");

    }

    @After("execution(public * com.mkm.springmvc.HomeController.*(*))")
    public void logAfter(){
        LOGGER.info("Getting all aliens from aspect after the class has been executed ");

    }
    @AfterReturning("execution(public * com.mkm.springmvc.HomeController.*(*))")
    public void logAfterReturning(){
        LOGGER.info("Getting all aliens from aspect after the return of function has been executed");
    }

}
