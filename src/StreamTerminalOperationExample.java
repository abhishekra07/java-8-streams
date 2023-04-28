import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamTerminalOperationExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
        Optional<Integer> total = numbers.stream().reduce((num, sum) -> sum + num);
        System.out.println(total.get());
    }
}
