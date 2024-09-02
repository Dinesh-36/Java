import java.util.*;//this is the package where collection and generic present
//It can be called a Collection API or Collection FrameWork
//Collection is usewd to store multiple values,but why we cant use arraytype because array is fixed,and we cant expand or shrink it and also it is hard to add or remove a element from a array,if we use collection API it is very easy because it has many build in class.
//Collection-Interface(singular)
//Collections-Class(plural)

public class CollectionAndGeneric {
    public static void main(String[] args) {
        Collection<Integer> values = new ArrayList<Integer>();// <Integer> this is 'Generic',giving the warper class
                                                              // that the array which type it should accept
        values.add(10);
        values.add(20);
        values.add(30);
        System.out.println(values);

    }
}
