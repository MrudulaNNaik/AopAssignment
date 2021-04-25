package assignmentAop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect

public class LoggingAspect {
	
	//Advice before the get method of employee state
	//@Before("execution(public String getEmp_state())")
	
	@Before("allEmployeeMethods()")
	public void LoggingAdvice(JoinPoint joinPoint) {
		//System.out.println(joinPoint.toString());
		//System.out.println("Advice is run before get method");
		System.out.println(joinPoint.getTarget());
	
	}
	
	/*@Before("allGetters()")
	public void secondAdvice() {
		System.out.println("Second Advice executed");
	}*/
	
	@AfterReturning("args(name)")
	public void stringArguementMethods(String name) {
	System.out.println("the name is" +name);	
	}
		
	@AfterThrowing("args(name)")
	public void exceptionAdvice(String name) {
		System.out.println("An execption is thrown");
	}
	
	@Around("allGetters()")
	public void myAroundAdvice(ProceedingJoinPoint proceedingJoinPoint) {
		try {
			System.out.println("before advice");
			proceedingJoinPoint.proceed();
			System.out.println("after returning");
			
		} catch (Throwable e) {
			System.out.println("after throwing");
			
		}
		System.out.println("after finally");
		
	}
	
	
	
	@Pointcut("execution(* get*())")
	public void allGetters() {
		
	}
	
	//@Pointcut("execution(* * assignmentAop.model.Employee.*(..))")
	@Pointcut("within(assignmentAop.model.Employee)")
	public void allEmployeeMethods() {}
	
	/*
	 * @Before("args(String)") public void stringArguementMethods() {
	 * System.out.println("A method with String arguements"); }
	 */
	
	
	

}
