package assignmentAop.model;

public class Employee {
	private int emp_id;
	private String name;
	private int emp_phn;
	private String emp_state;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		throw (new RuntimeException());
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public int getEmp_phn() {
		return emp_phn;
	}

	public void setEmp_phn(int emp_phn) {
		this.emp_phn = emp_phn;
	}

	public String getEmp_state() {
		return emp_state;
	}

	public void setEmp_state(String emp_state) {
		this.emp_state = emp_state;
	}
	
	

}
