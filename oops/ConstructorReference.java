import java.util.*;

class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }

}

public class ConstructorReference {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("sdfs", "dkmgfg", "frwef");

        List<Student> students = new ArrayList<>();
        List<Student> students1 = new ArrayList<>();

        // for (String name : names) {
        // students.add(new Student(name));
        // }

        students = names.stream()
                .map(name -> new Student(name))
                .toList();
        // Using Constructor Reference
        students1 = names.stream()
                .map(Student::new)
                .toList();

        System.out.println(students);
        System.out.println(students1);

    }
}
