import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamTerminalOperationExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
        Optional<Integer> total = numbers.stream().reduce((num, sum) -> sum + num);
        System.out.println(total.get());

        Optional<Integer> maxNum = numbers.stream().max((n1, n2) -> n1.compareTo(n2));
        System.out.println(maxNum.get());

        Optional<Integer> minNum = numbers.stream().min((n1, n2) -> n1.compareTo(n2));
        System.out.println(minNum.get());

        Long count = numbers.stream().count();
        System.out.println(count);
    }
}
