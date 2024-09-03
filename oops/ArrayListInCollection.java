// collection Interface vs List Interface
//main difference is collection dosent support index
//Iterator is parent of Collection is parent of List is Parrent of ArrayList

import java.util.*;

public class ArrayListInCollection {
    public static void main(String[] args) {
        ArrayList<Integer> val = new ArrayList<Integer>();
        val.add(20);
        val.add(40);
        val.add(50);
        val.add(30);
        val.add(0, 10);
        System.out.println(val);
        Collections.sort(val);
        System.out.println(val);
        for (int a : val) {
            System.out.println("sorted array: " + a);
        }

        System.out.println("size of the array " + val.size());
        System.out.println("Value at index; " + val.get(2));
        System.out.println("update at index: " + val.set(4, 60));
        System.out.println(val);

        System.out.println(val.remove(2));
        System.out.println(val);

        System.out.println(val.indexOf(60));
        System.out.println(val.remove(val.indexOf(60)));
        System.out.println(val);

        Iterator it = val.iterator();
        System.out.println(it.next());
        System.out.println(it.next());

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        for (int i : val) {
            System.out.println(i);
        }

    }
}
