package hk.hku.proxy;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class KyleProxy {

    @Pointcut(value = "execution(* hk.hku.service.KyleService.*(..))")
    private void pointcut(){}
    // before advice
    @Before(value = "pointcut()")
    public void before(JoinPoint joinPoint){
        Object[] args = joinPoint.getArgs();
        for (Object arg : args) {
            System.out.println("arg = " + arg);
        }
        System.out.println("KyleProxy.before() is called");
    }
    @After(value = "pointcut()")
    public void after(){
        System.out.println("KyleProxy.after() is called");
    }
    @Around(value = "execution(* hk.hku.service.KyleService.*(..))")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("KyleProxy.around() is called");
        Object proceed = proceedingJoinPoint.proceed();
        System.out.println("KyleProxy.around() is called");
        return proceed;
    }
    @AfterReturning(value = "pointcut()", returning = "result")
    public void afterReturning(JoinPoint joinPoint, Object result){
        System.out.println("KyleProxy.afterReturning() is called");
        System.out.println("result = " + result);
    }
    @AfterThrowing (value = "pointcut()")
    public void afterThrowing(){
        System.out.println("KyleProxy.afterThrowing() is called");
    }
}
