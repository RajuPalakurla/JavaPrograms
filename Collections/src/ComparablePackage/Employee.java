package ComparablePackage;

public class Employee implements Comparable<Employee> {
	String nameString;
	int salary;
	String departmentString;
	
	public Employee(String nameString, int salary, String departmentString) {
		super();
		this.nameString = nameString;
		this.salary = salary;
		this.departmentString = departmentString;
	}
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDepartmentString() {
		return departmentString;
	}
	public void setDepartmentString(String departmentString) {
		this.departmentString = departmentString;
	}
	@Override
	public int compareTo(Employee o) {
		if(this.hashCode() > o.hashCode()) {
			return 1;
		} else if (this.hashCode() < o.hashCode()) {
			return -1;
		}
		return 0;
	}
	@Override
	public String toString() {
		return "Employee [nameString=" + nameString + ", salary=" + salary + ", departmentString=" + departmentString
				+ "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nameString == null) ? 0 : nameString.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (nameString == null) {
			if (other.nameString != null)
				return false;
		} else if (!nameString.equals(other.nameString))
			return false;
		return true;
	}
	
	
}
