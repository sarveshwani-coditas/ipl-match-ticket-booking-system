package com.coditas.iplmatchticketbookingsystem.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

    @Around("execution(* com.coditas.iplmatchticketbookingsystem.service.*.*(..))")
    public Object ServiceLogging(ProceedingJoinPoint proceedingJoinPoint) {

        String method = proceedingJoinPoint.getSignature().toShortString();

        long startTime = System.currentTimeMillis();
        logger.info("Entering the method ------>" + method);

        Object result = null;
        try {
            result = proceedingJoinPoint.proceed();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }

        long endTime = System.currentTimeMillis();

        logger.info("Total execution time required is "+(endTime-startTime));
        logger.info("exiting from method ----->" + method);

        return result;

    }
}
