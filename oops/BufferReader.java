import java.io.*;

public class BufferReader {

    public static void main(String[] args) throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);// it need an argument inputstream object which is in
                                                                // system class and it is a static so that we access it
                                                                // with class name(system.in)
        BufferedReader br = new BufferedReader(is);// it need an argument of InputStreamReader object(is)
        System.out.println("Enter your name");
        String str = br.readLine();
        System.out.println("your name is " + str);
        // readLine always gives as string so if you want to use any other datatype do
        // typecasting
        System.out.println("Enter your age:");
        int num = Integer.parseInt(br.readLine());
        System.out.println("Your age Is : " + num);
    }
}
