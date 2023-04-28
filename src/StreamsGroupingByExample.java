import java.util.*;
import java.util.stream.Collectors;

public class StreamsGroupingByExample {
    public static void main(String[] args) {
        List<Employee> empList = getEmployeeList();
        //GroupingBy employee name and storing it in a map
        //Simple Grouping by a Single Column i.e. Employee name
        Map<String, List<Employee>> map = empList.stream().collect(Collectors.groupingBy(e -> e.getName()));
        map.forEach((k,v) -> {
            System.out.println(k + " " + v);
        });

        //Grouping by Multiple Fields
//        List<BlogPost> posts = new ArrayList<>();
//        posts.add(new BlogPost("New Book 1", "Abhishek", BlogPostType.GUIDE, 24));
//        posts.add(new BlogPost("New Book 2", "Abhishek", BlogPostType.GUIDE, 30));
//        posts.add(new BlogPost("New Book 3", "Abhishek", BlogPostType.GUIDE, 22));
//        posts.add(new BlogPost("New Book 1", "Rahul", BlogPostType.GUIDE, 46));
//        posts.add(new BlogPost("New Book 1", "Rahul", BlogPostType.GUIDE, 11));
//        posts.add(new BlogPost("New Book 1", "Rahul", BlogPostType.GUIDE, 22));
//        Map<String, Map<BlogPostType, List<BlogPost>>> resultMap = posts.stream()
//                .collect(Collectors.groupingBy(BlogPost::getAuthor, Collectors.groupingBy(BlogPost::getType)));

        //Getting the Average from Grouped Results
        Map<String, Double> averageSalaryPerEmployee = empList.stream().collect(Collectors.groupingBy(Employee::getName, Collectors.averagingInt(Employee::getSalaryAmount)));
        averageSalaryPerEmployee.forEach((k,v) -> {
            System.out.println(k + " " + v);
        });

        //Getting the Sum from Grouped Results
        Map<String, Integer> salaryPerEmployee = empList.stream().collect(Collectors.groupingBy(Employee::getName, Collectors.summingInt(Employee::getSalaryAmount)));
        salaryPerEmployee.forEach((k,v) -> {
            System.out.println(k + " " + v);
        });

        //Getting the Maximum or Minimum from Grouped Results
        Map<String, Optional<Employee>> maxSalaryPerEmployee = empList.stream().collect(Collectors.groupingBy(Employee::getName, Collectors.maxBy(Comparator.comparingInt(Employee::getSalaryAmount))));
        maxSalaryPerEmployee.forEach((k,v) -> {
            System.out.println(k + " " + v.get());
        });

        //Getting a Summary for an Attribute of Grouped Results
        Map<String, IntSummaryStatistics> salaryStatisticsPerType = empList.stream().collect(Collectors.groupingBy(Employee::getName, Collectors.summarizingInt(Employee::getSalaryAmount)));
        salaryStatisticsPerType.forEach((k,v) -> {
            System.out.println(k + " Average " + v.getAverage());
            System.out.println(k + " Count " + v.getCount());
            System.out.println(k + " Max " + v.getMax());
            System.out.println(k + " Sum " + v.getSum());
            System.out.println(k + " Min " + v.getMin());
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

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salaryDescription='" + salaryDescription + '\'' +
                ", salaryAmount=" + salaryAmount +
                '}';
    }
}


class BlogPost {
    String title;
    String author;
    BlogPostType type;
    int likes;

    public BlogPost(String title, String author, BlogPostType type, int likes) {
        this.title = title;
        this.author = author;
        this.type = type;
        this.likes = likes;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public BlogPostType getType() {
        return type;
    }

    public int getLikes() {
        return likes;
    }
}

enum BlogPostType {
    NEWS,
    REVIEW,
    GUIDE
}