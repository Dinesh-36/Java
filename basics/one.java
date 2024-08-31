class student {
    int rollno;
    String name;
    int mark;

}

class arrofobj {
    public void stud() {
        System.out.println("/*****array of object**************/");
        student s1 = new student();
        s1.rollno = 1;
        s1.name = "din";
        s1.mark = 98;
        student s2 = new student();
        s2.rollno = 1;
        s2.name = "db";
        s2.mark = 100;
        student s3 = new student();
        s3.rollno = 1;
        s3.name = "db036";
        s3.mark = 110;

        student students[] = new student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].name + " " + students[i].mark);
        }
        System.out.println("/***displaying array of object using foreach loop**************/");

        for (student n : students) {
            System.out.println(n.name + " " + n.mark);
        }
    }

}

class arry {
    int a = 3;

    public void twod() {
        int nums[][] = new int[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                nums[i][j] = (int) (Math.random() * 9);
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("**************");
        for (int n[] : nums) {
            for (int m : n) {
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}

class jagged {
    int a = 10;

    public void jaggedArray() {
        System.out.println("*********Jagged Array**********");
        int numb[][] = new int[3][];
        numb[0] = new int[2];
        numb[1] = new int[4];
        numb[2] = new int[3];

        for (int i = 0; i < numb.length; i++) {
            for (int j = 0; j < numb[i].length; j++) {
                numb[i][j] = (int) (Math.random() * 9);
                System.out.print(numb[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class one {
    public static void main(String a[]) {

        arry obj = new arry();
        obj.twod();

        jagged obj1 = new jagged();
        obj1.jaggedArray();

        arrofobj obj2 = new arrofobj();
        obj2.stud();

    }
}