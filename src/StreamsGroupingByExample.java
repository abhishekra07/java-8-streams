import java.util.List;

public class StreamsGroupingByExample {
    public static void main(String[] args) {

    }
    public static List<Employee> getEmployeeList() {
        
        return null;
    }
}


class Employee {
    private String name;
    private int age;
    private String salaryDescription;
    private int salaryAmount;

    public Employee(String name, int age, String salaryDescription, int salaryAmount) {
        this.name = name;
        this.age = age;
        this.salaryDescription = salaryDescription;
        this.salaryAmount = salaryAmount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSalaryDescription() {
        return salaryDescription;
    }

    public int getSalaryAmount() {
        return salaryAmount;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalaryDescription(String salaryDescription) {
        this.salaryDescription = salaryDescription;
    }

    public void setSalaryAmount(int salaryAmount) {
        this.salaryAmount = salaryAmount;
    }
}
