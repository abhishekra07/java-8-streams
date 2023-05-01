import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class IntStreamExample {
    public static void main(String[] args) {
        //IntStream.of Example
        IntStream singleValue = IntStream.of(10);
        singleValue.forEach(num -> System.out.println(num));
        IntStream multipleValues = IntStream.of(1, 5, 10, 20, 30);
        multipleValues.forEach(num -> System.out.println(num));

        //IntStream.range()
        //range() is used to generate the numbers in the order with incremental by one
        IntStream range10to30 = IntStream.range(10, 20); //last value not included
        range10to30.forEach(num -> System.out.println(num));

        //IntStream.rangeClosed()
        //rangeClosed() is also used to generate the numbers in the order with incremental by one but it includes the end index of this method
        IntStream range10to15closed = IntStream.rangeClosed(10, 15);
        range10to15closed.forEach(num -> System.out.println(num));

        //IntStream.generate()
        //Use the generate() method if you wish to generate random numbers with custom logic
//        IntStream random = IntStream.generate( () -> { return (int) Math.random() * 5000;});
//        random.forEach(num -> System.out.println(num));

        //IntStream.iterate()
        IntStream iterate = IntStream.iterate(1000, i -> i + 4000).limit(5);
        iterate.forEach(num -> System.out.println(num));

        //Sum, Average, Count on IntStream
        List<Integer> list = Arrays.asList(5,3,4,1,2);
//        IntStream intStream = IntStream.of(5,3,4,1,2); //java.lang.IllegalStateException as it will be closed after sum operation
        System.out.println("sum by using Stream : " + list.stream().mapToInt(Integer::intValue).sum());
        System.out .println("count by using Stream: " + list.stream().mapToInt(Integer::intValue).count());
        System.out.println("average by using Stream : " + list.stream().mapToInt(Integer::intValue).average());
        System.out.println("sum by using Stream and reduced: " + list.stream().mapToInt(Integer::intValue).reduce((num, sum) -> sum + num));
    }
}
