//java is not 100% object oriented programing language we can say like 99.99%,the remaining 0.1% is it supports primitive data types(int,char,float) from c.the datatypes int,float.. which are accepting values like 1,2,4,2.2,3.5 etc.. these are primitive values not an object,so this is the reason that java is not 100% oop(eg:int a =5;so if a language is 100% oop then it accept only object)
//for 'every primitive datatypes' there is a 'WrapperClass'(int->Integer,char->Character,etc...)

//When to use Primitivetype and object type ?
//Primitive types are 'Faster' than object type,because there is no need of heap memory concept

//Gendral Note:Object know some thing that is Variable and Object does something that is Methods

public class WrapperClass {
    public static void main(String[] args) {
        int i = 5;
        System.out.println(i);
        // the strike denotes there is a better approch,
        Integer obj = new Integer(5);// boxing(putting a primitive value inside the object )
        Integer obj1 = 5;// this one is the better aproach,it automaticall creates the object this is
                         // known as 'auto-boxing'
        Integer obj2 = i;// directly converting primitive value into a object

        int val = obj2.intValue();// this method converts object into primitive this is known as 'unboxing'

        int val1 = obj2;// 'auto-unboxing'
        System.out.println(obj);
        System.out.println(obj1);
        System.out.println(obj2);

    }
}
