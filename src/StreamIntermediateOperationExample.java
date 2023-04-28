import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamIntermediateOperationExample {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Abhishek", 24));
        studentList.add(new Student("Rahul", 25));
        studentList.add(new Student("Ajay", 22));
        studentList.add(new Student("Sanjay", 32));
        List<String> names = studentList.stream().map(student -> student.name).collect(Collectors.toList());
        names.forEach(name -> System.out.println(name));
    }
}

class Student {
    public String name;
    public int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}