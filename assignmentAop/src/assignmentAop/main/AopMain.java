package assignmentAop.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import assignmentAop.Service.EmployeeService;
import assignmentAop.model.Employee;

public class AopMain {
	public static void main(String[] args) {
	
	ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
	EmployeeService employeeService = ctx.getBean("employeeService", EmployeeService.class);
	//employeeService.getEmployee().setName("Mnn");
	/*System.out.println(employeeService.getEmployee().getEmp_state());
	System.out.println(employeeService.getEmployee().getEmp_id());
	System.out.println(employeeService.getEmployee().getEmp_phn());*/
	//System.out.println(employeeService.getEmployee().getName());
	employeeService.getEmployee();
	}

}
