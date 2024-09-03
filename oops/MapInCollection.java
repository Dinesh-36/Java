//map for more redability,we can give a name for index so that it can be more redability
//map is a key,Value pair.By default it followe 'Set'Interface(unordered and unique)

import java.util.*;

public class MapInCollection {
    public static void main(String[] args) {
        Map<String, Integer> m = new HashMap<>();
        m.put("Ram", 57);
        m.put("Raghul", 67);
        m.put("Raghul", 77);// here it will uptate the value(value can be same but if key is sme then it
                            // updates it value not create new one)
        m.put("Ravi", 87);
        System.out.println(m.keySet());
        System.out.println(m.values());
        System.out.println(m.containsKey("Raghul"));
        System.out.println(m.containsValue(78));
        System.out.println(m.remove("Raghul"));

        for (String str : m.keySet())
            System.out.println(str + ": " + m.get(str));

        // TreeMap used for 'sorted' order and it wont accept 'null'
        // HashTable also wont accept 'null'

    }
}
