package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class SecurityCheckAspect {
    @Before("aop.aspects.MyPointcut.allAddMethods()")
    public void beforeAddSecurityAdvice() {
        System.out.println("  >checking rules on getting book/magazine");
    }
}
