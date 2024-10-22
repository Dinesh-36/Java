import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class MapFilterREduceSorted {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(3, 4, 5, 6, 8, 9, 3);
        // Predicate<Integer> p =n -> n % 2 == 0;(filter)
        // Function<Integer, Integer> fun = n-> n*2;(map)
        int res = num.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .reduce(0, (c, e) -> c + e);
        System.out.println(res);
        Stream<Integer> res1 = num.stream()
                .filter(n -> n % 2 == 0)
                .sorted();
        res1.forEach(n -> System.out.println(n));
    }

}
