class Employee {
    private String employeeName;
    private int employeeSSN;
    private String employeeDepartment;

    public String getEmployeeName(){
        return this.employeeName;
    }
    public void setEmployeeName(String name){
        this.employeeName=name;
    }

    public int getEmployeeSSN(){
        return this.employeeSSN;
    }
    public void setEmployeeSSN(int ssn){
        //String.valueOf(ssn).length()
        this.employeeSSN=ssn;
    }

    public String getEmployeeDepartment(){
        return this.employeeDepartment;
    }
    public void setEmployeeDepartment(String dept){
        this.employeeDepartment=dept;
    }
}

public class CoreJavaQuestion2{
    public static void main(String args[]){
         Employee employee=new Employee();
         employee.setEmployeeName("John");
         employee.setEmployeeSSN(123456789);
         employee.setEmployeeDepartment("Packing");
         System.out.printf("Employee Name: %s \nEmployee SSN: %d \nEmployee Department: %s"
         , employee.getEmployeeName(),employee.getEmployeeSSN(),employee.getEmployeeDepartment());
    }
}