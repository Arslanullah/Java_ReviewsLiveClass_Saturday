package Week11_Method_Overiding;

public class Employee extends Person {

private String employeeId;
    private String jobtitle;
private double salary;

    public Employee(String name, int age, char gender, String employeeId, String jobtitle, double salary) {
        super(name, age, gender);
        setEmployeeId(employeeId);
        setJobtitle(jobtitle);
        setSalary(salary);
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getJobtitle() {
        return jobtitle;
    }

    public void setJobtitle(String jobtitle) {
        if (jobtitle==null){
            if (jobtitle.isEmpty()){
                System.err.println("error not valid");
                System.exit(1);
            }
        }
        this.jobtitle = jobtitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary<=0){
            System.err.println("error Wrong Salary");
            System.exit(1);
        }
        if (salary==0){
            System.err.println("error cannot be Zero");
            System.exit(1);
        }
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                super.toString()+   // calling parent class toString
                "employeeId='" + employeeId + '\'' +
                ", jobtitle='" + jobtitle + '\'' +
                ", salary=" + salary +
                '}';
    }

    public void work(){
        System.out.println(getName()+jobtitle+ "is working");


    }


}





