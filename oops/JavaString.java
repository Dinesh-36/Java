//String is 'not a datatype' it is a 'Class'
//String is immutable(cant update)

//to create a mutable string there is a two classes
//StringBuilder(no guarentee of thread synchronization) and StringBuffer(A thread-safe(thread synchronization),mutable sequence of character)

public class JavaString {
    public static void main(String[] args) {

        // Explictly creating a string
        String str = new String("ddd");// righthand side is object and lefthand side is reference for that object
        System.out.println(str);

        // Implictly creating string(Automatically it will create a object we dont nedd
        // to use 'new keyword' and the class Constructor "String()" to create a object
        // for String class)
        String s = "hellow";// same the righthand part("hellow") which is a object so the string is stored
                            // as a object and 's' is the reference for that object("hellow")
        String s1 = "hellow";

        String s2 = new String("hellow");

        // == vs .equal method
        // == it compares the reference(adress)
        System.out.println("reference comparation");
        System.out.println(s1 == s2);

        // .equal(),this compaeres values
        System.out.println("value comparation");
        System.out.println(s1.equals(s2));

    }
}
