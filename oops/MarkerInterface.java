
//used to update something to compiler
//Marker Interface (Serializable) (0 methodds) - permission
//Serialization means it is a concept in java, it means we can take the object and store the value of that object in our hardDrive
//if you want to execute some method with permision we can use this
import java.io.*;

interface Permision {// this is a marker interface
}

class Myclass implements Permision {
    public void show() {
        System.out.println("in shoe method");
    }
}

// Serializable
// it is used as a permision to store a values in file
class Save implements Serializable {// to see remove the implement and save it and run it
    int i;
}

public class MarkerInterface {
    public static void main(String[] args) throws Exception {
        Myclass obj = new Myclass();
        if (obj instanceof Permision)
            obj.show();
        else
            System.out.println("No acess granted");// if we remove the implement then this part execute

        // Serializable
        Save obj1 = new Save();
        obj1.i = 10;
        System.out.println(obj1.i);
        File f = new File("myfile.txt");
        FileOutputStream fos = new FileOutputStream(f);// we need to add exception
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(obj1);

        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Save obj2 = (Save) ois.readObject();
        System.out.println("val of obj2: " + obj2.i);

    }
}
