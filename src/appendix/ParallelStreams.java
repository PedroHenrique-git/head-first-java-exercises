package appendix;

import java.util.List;
import java.util.stream.IntStream;

public class ParallelStreams {
    public static void main(String[] args) {
        List<Integer> numbers = IntStream.range(0, 100000).boxed().toList();

        Integer total = numbers.parallelStream().reduce(Integer::sum).orElse(0);

        System.out.println("Sum of numbers from 0 to 100000 " + total);
    }
}
