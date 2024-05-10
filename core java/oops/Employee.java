package oops;

public class Employee {
	
	private String empName;
	
	private int empId;
	
	private int empSal;
	
	private String empAdd;
	
	
	
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + ", empSal=" + empSal + ", empAdd=" + empAdd + "]";
	}

	public void setEmpName(String empName) {		//setting var value.
		
		this.empName = empName;
	}
	
	public String getEmpName() {		//getting var values
		return empName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public int getEmpSal() {
		return empSal;
	}

	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}

	public String getEmpAdd() {
		return empAdd;
	}

	public void setEmpAdd(String empAdd) {
		this.empAdd = empAdd;
	}
	
	public Employee() {
		System.out.println("Iam coming from the default constructor");
	}

	public Employee(String empName, int empId, int empSal, String empAdd) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empSal = empSal;
		this.empAdd = empAdd;
	}
	
	

}
