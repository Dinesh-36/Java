//Unordered 'Unique' elements
//Drawback:it dosen't support index

import java.util.*;

public class SetInCollection {
    public static void main(String[] args) {
        Set<Integer> s = new HashSet<>();
        s.add(10);
        s.add(30);
        s.add(60);
        s.add(10);
        System.out.println(s);
        // It gives a element in sorted order
        Set<Integer> t = new TreeSet<>();
        t.add(20);
        t.add(55);
        t.add(64);
        t.add(20);
        t.add(26);
        System.out.println(t);

    }
}
