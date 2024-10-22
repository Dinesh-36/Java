import java.util.*;
import java.util.stream.Stream;

public class StreamApi {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(3, 4, 6, 7, 4, 2, 1);
        // normal for loop to print elements in array
        System.out.println("normal for loop");
        for (int i = 0; i < num.size(); i++) {

            System.out.println(num.get(i));
        }
        // enhanced for loop
        System.out.println("enhanced for loop");
        for (int n : num) {

            System.out.println(n);
        }
        // forEach method to print elements in array
        System.out.println("forEach loop");
        num.forEach(n -> System.out.println(n));

        // Stream
        Stream<Integer> s1 = num.stream();// the values in num is noe available in s1,so now with this stream s1 we can
                                          // perform any operation that will not affect the num
        System.out.println("From stream API");
        s1.forEach(n -> System.out.println(n));// once we worked with stream once we "cant reuse it"

        // filtering in normal way
        int sum = 0;
        for (int n : num) {
            if (n % 2 == 0) {
                n = n * 2;
                sum = sum + n;
            }
        }

        System.out.println(sum);
        // filtering using stream API

        // Stream<Integer> s2 = num.stream();
        // Stream<Integer> s3 = s2.filter(n -> n % 2 == 0);
        // Stream<Integer> s4 = s3.map(n -> n * 2);
        // s4.forEach(n -> System.out.println(n));

        // int res = s4.reduce(0, (c, e) -> c + e);// reduce will gives you a single
        // value
        // System.out.println(res);

        // (or)

        int res = num.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .reduce(0, (c, e) -> c + e);
        System.out.println(res);

    }
}
