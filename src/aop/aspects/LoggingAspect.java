package aop.aspects;


import aop.beans.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {


    @Before("aop.aspects.MyPointcut.allAddMethods()")
    public void beforeGettingLoggingAdvice(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println(methodSignature);
        System.out.println(methodSignature.getMethod());
        System.out.println(methodSignature.getReturnType());
        System.out.println(methodSignature.getName());

        if (methodSignature.getName().equals("addBook")) {
            Object[] arguments = joinPoint.getArgs();
            for (Object obj : arguments) {
                if (obj instanceof Book) {
                    Book myBook = (Book) obj;
                    System.out.println("Name " + myBook.getName() + " Author " + myBook.getAuthor() + " Year " + myBook.getYearOfPub());
                } else if (obj instanceof String) {
                    System.out.println("book adding to lib " + obj);
                }
            }
        }
        System.out.println("  >trying to getting some");
        System.out.println("______________________________________");
    }



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
