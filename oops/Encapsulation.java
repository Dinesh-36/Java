//Binding data members and methods into a single enntity

class Stu {
    // the variables which are inside a class are called instance variable
    int age1 = 23;
    private int age2 = 22;

    public int getAge() {
        System.out.println(age2);
        return age2;
    }

    public void setAge(int age) {
        this.age2 = age;
    }

}

public class Encapsulation {
    public static void main(String[] args) {
        Stu obj = new Stu();
        obj.age1 = 24;
        // we are directly accessing the instance variable so that there will be a
        // security issue to avoid this we make the variable,method,constructor into
        // private so that it can be accessed only with in that class.
        // obj.age2 = 25;(we cant acess this variable directly because it is private)
        // *we can acess these private varibles by binding this private variables into
        // the public methods

        obj.getAge();// so here we are binding the data members(age2) and methods(getAge()) into a
                     // single entity, this is called a encapsulation
        obj.setAge(44);
        obj.getAge();

    }

}
