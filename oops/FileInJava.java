import java.io.*;

public class FileInJava {
    public static void main(String[] args) throws Exception {
        File obj = new File("demoFile.txt");

        // 1.Creation of a file
        if (obj.createNewFile())
            System.out.println("created " + obj.getName());
        else
            System.out.println("already exist " + obj.getName());

        // 2.Writing in the file
        // NotePad follows 'UTF-8' method most of the editors folows this methid
        FileOutputStream fos = new FileOutputStream(obj);
        DataOutputStream dos = new DataOutputStream(fos);
        dos.writeUTF("Hellow");
        System.out.println("msgwritten");
        dos.close();

        // Read from file
        FileInputStream fis = new FileInputStream(obj);
        DataInputStream dis = new DataInputStream(fis);
        String line = DataInputStream.readUTF(dis);
        System.out.println(line);

        // delete
        obj.delete();
    }
}
