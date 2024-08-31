public class srting {
    public static void main(String a[]) {
        // immutable string
        String str = new String("hellow");
        System.out.println(str);

        String str1 = "dinesh";
        System.out.println(str1);

        str1.concat(" P");
        System.out.println(str1);

        // mutable string
        StringBuffer str3 = new StringBuffer("how ");
        System.out.println(str3);
        str3.append(" are you?");
        System.out.println(str3);
        str3.charAt(0);
        System.out.println("one");
        System.out.println(str3);
        str3.insert(2, "bye");
        System.out.println(str3);

    }

}
