package aop.aspects;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class MyPointcut {

    @Pointcut("execution(* get*())")
    public void allGetMethods() {
    }

    @Before("allGetMethods()")
    public void beforeGettingLoggingAdvice() {
        System.out.println("  >trying to getting some");
    }
}
