import java.util.stream.IntStream;

public class IntStreamExample {
    public static void main(String[] args) {
        //IntStream.of Example
        IntStream singleValue = IntStream.of(10);
        singleValue.forEach(num -> System.out.println(num));
        IntStream multipleValues = IntStream.of(1, 5, 10, 20, 30);
        multipleValues.forEach(num -> System.out.println(num));
    }
}
