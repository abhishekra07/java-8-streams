import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsGroupingByExample {
    public static void main(String[] args) {
        List<Employee> empList = getEmployeeList();
        Map<String, List<Employee>> map = empList.stream().collect(Collectors.groupingBy(e -> e.getName()));
        map.forEach((k,v) -> {
            System.out.println(k + " " + v);
        });
    }
    public static List<Employee> getEmployeeList() {
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee("Abhishek", 24, "HRA", 120000));
        empList.add(new Employee("Abhishek", 24, "Allocation Bonus", 20000));
        empList.add(new Employee("Rahul", 23, "HRA", 100000));
        empList.add(new Employee("Rahul", 23, "Allocation Bonus", 12000));
        return empList;
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
