import java.util.*;

public class MethodReference {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("sdfs", "dkmgfg", "frwef");
        List<String> uNames = names.stream()
                .map(str -> str.toUpperCase())
                .toList();// converting stream to list (map returns stream)
        System.out.println(uNames);

        // using Method Reference
        List<String> uNames1 = names.stream()
                .map(String::toUpperCase)// method reference,instead of callig a method we directly passing a method and
                                         // mention the method where it is belongs to in this case toUpperCase method
                                         // belongs to String
                .toList();
        uNames1.forEach(System.out::println);
    }
}
