package aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {

    @Around("execution(public String returnBook())")
    public Object aroundReturnBook(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("aroundReturnBook: trying to returning book to the lib ");
        long begin = System.currentTimeMillis();
        Object targetMethRes = proceedingJoinPoint.proceed();
        long end = System.currentTimeMillis();
        System.out.println(end - begin);
        System.out.println("aroundReturnBook: OK ");
        return targetMethRes;
    }
}
