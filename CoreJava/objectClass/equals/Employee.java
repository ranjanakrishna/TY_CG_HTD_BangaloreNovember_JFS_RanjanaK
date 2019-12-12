package equals;

public class Employee {
	int empId;
	String empName;
	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empId;
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		return result;
	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Employee other = (Employee) obj;
//		if (empId != other.empId)
//			return false;
//		if (empName == null) {
//			if (other.empName != null)
//				return false;
//		} else if (!empName.equals(other.empName))
//			return false;
//		return true;
//	}
//	
	
	
	public boolean equals(Object obj)
	{
		Employee e1=(Employee)obj;
		if(e1.empId==this.empId){
			if(e1.empName.equals(empName)){
				return true;
			}
			else{
				return false;
			}
		}
		else {
			return false;
		}
	}
	
}
