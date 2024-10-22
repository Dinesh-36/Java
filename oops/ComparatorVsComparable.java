import java.util.*;

public class ComparatorVsComparable {
    public static void main(String[] args) {
        Comparator<Integer> com = new Comparator<Integer>() {
            public int compare(Integer i, Integer j) {
                if (i % 10 > j % 10)
                    return 1;
                else
                    return -1;
            }
        };
        List<Integer> num = new ArrayList<>();
        num.add(43);
        num.add(84);
        num.add(25);
        num.add(71);
        num.add(68);
        num.add(59);

        Collections.sort(num, com);

        System.out.println(num);
    }
}
