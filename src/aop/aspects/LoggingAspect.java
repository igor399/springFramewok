package aop.aspects;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Before("execution(public void getBook(aop.beans.Book,..))")
    public void beforeGettingBookAdvice(){
        System.out.println("  >trying to getting some");
    }

    @Before("execution(public * return*())")
    public void beforeReturningBookAdvice(){
        System.out.println("  >trying to return mag");
    }
}
