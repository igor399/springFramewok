package aop.aspect;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Before("execution(public void getBook())")
    public void beforeGettingBookAdvice(){
        System.out.println("  >trying to getting book");
    }
}
