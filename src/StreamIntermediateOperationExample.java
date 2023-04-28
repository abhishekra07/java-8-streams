import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class StreamIntermediateOperationExample {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Abhishek", 24));
        studentList.add(new Student("Rahul", 25));
        studentList.add(new Student("Ajay", 22));
        studentList.add(new Student("Sanjay", 32));

        //Map usage
        List<String> names = studentList.stream().map(student -> student.name).collect(Collectors.toList());
        names.forEach(name -> System.out.println(name));

        //flatMap Example
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8, 9, 10)
        );

        List<Integer> flatList = listOfLists.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
        flatList.forEach(num -> System.out.println(num));
//        List<Integer> flatList = listOfLists.stream()
//                .flatMap(e -> e.stream())
//                .collect(Collectors.toList());
//        flatList.forEach(num -> System.out.println(num));
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