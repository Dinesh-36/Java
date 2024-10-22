import java.util.*;

public class OptionalClass {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Din", "trsvf", "gffg", "ffwe");

        Optional<String> name = names.stream()
                .filter(str -> str.contains("x"))
                .findFirst();// findFirst return a type Optional not a String,Optional is a class introduced
                             // in 1.8,it came to avoid the error Null Pointer Exception
        System.out.println(name.orElse("Not found"));

        Optional<String> name1 = names.stream()
                .filter(str -> str.contains("D"))
                .findFirst();
        System.out.println(name1.orElse("Not found"));
        // or
        String name2 = names.stream()
                .filter(str -> str.contains("t"))
                .findFirst()
                .orElse("Not found");
        System.out.println(name2);

    }
}
