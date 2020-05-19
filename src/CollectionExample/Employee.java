package CollectionExample;

public class Employee {

    private String empId;
    private String empName;
    private String desg;
    private int salary;

    public String getEmpId() {
        return empId;
    }

    public Employee(String empId, String empName, String desg, int salary) {
        this.empId = empId;
        this.empName = empName;
        this.desg = desg;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "empId=" + empId + ", empName=" + empName + ", desg=" + desg + ", salary=" + salary + '}';
    }
}
