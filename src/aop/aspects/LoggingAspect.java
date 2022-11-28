package aop.aspects;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {


//    @Pointcut("execution(* aop.beans.UniLibrary.get*())")
//    private void allGetMethods() {
//    }
//
//
//    @Pointcut("execution(* aop.beans.UniLibrary.return*())")
//    private void allReturnMethods() {
//    }
//
//
//    @Pointcut("allGetMethods() || allReturnMethods()")
//    private void allGetAndReturnMethods() {
//    }
//
//
//    @Pointcut("execution(* aop.beans.UniLibrary.*(..))")
//    private void allMethodsFromUniLib(){
//    }
//
//
//    @Pointcut("execution(public void aop.beans.UniLibrary.returnBook())")
//    private void returnBookMethod(){
//    }
//
//
//    @Pointcut("allMethodsFromUniLib() && !returnBookMethod()")
//    private void noReturnMethod(){
//    }
//
//    @Before("noReturnMethod()")
//    public void noReturnMethAdvice(){
//        System.out.println("Log #4");
//    }
//
//
//    @Before("allGetMethods()")
//    public void beforeGetMethodsAdvice() {
//        System.out.println("Log #1");
//    }
//
//    @Before("allReturnMethods()")
//    public void beforeReturnMethodsAdvice() {
//        System.out.println("Log #2");
//    }
//
//    @Before("allGetAndReturnMethods()")
//    public void beforeGetAndReturnMethodsAdvice() {
//        System.out.println("Log #3");
//    }

}
