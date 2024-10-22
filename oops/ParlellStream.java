import java.util.*;

public class ParlellStream {
    public static void main(String[] args) {
        int size = 10_000;
        List<Integer> num = new ArrayList<>(10000);
        Random ran = new Random();
        for (int i = 1; i <= size; i++) {
            num.add(ran.nextInt(100));
        }

        // int sum = num.stream()
        // .map(i -> i * 2)
        // .reduce(0, (c, e) -> c + e);
        // System.out.println(sum);

        long startSeq = System.currentTimeMillis();
        int sum2 = num.stream()
                .map(i -> {
                    try {
                        Thread.sleep(1);
                    } catch (Exception e) {
                    }

                    return i * 2;
                })
                .mapToInt(i -> i)// returns a intStream
                .sum();// sum is applicable only in intStream not in normal stream

        long endSeq = System.currentTimeMillis();

        long startpara = System.currentTimeMillis();
        int sum3 = num.parallelStream()// use parallelStream on independent values,dont use parellStream on sort()
                                       // because the values are dependent
                .map(i -> {
                    try {
                        Thread.sleep(1);
                    } catch (Exception e) {
                    }

                    return i * 2;
                })
                .mapToInt(i -> i)// returns a intStream
                .sum();
        long endpara = System.currentTimeMillis();

        System.out.println(sum2 + " " + sum3);
        System.out.println("Seq : " + (endSeq - startSeq));
        System.out.println("par : " + (endpara - startpara));

    }
}
