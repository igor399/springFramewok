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
        Object targetMethRes = null;
        try {
            targetMethRes = proceedingJoinPoint.proceed();
        } catch (Exception e) {
            System.out.println("exception was caught " + e);
          throw new ArithmeticException();
        }

        System.out.println("aroundReturnBook: OK ");
        return targetMethRes;
    }
}
