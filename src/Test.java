/**
 * 2.instance-within a class but outside the methos.
 * 3.static-within a class but outside the method, cannot be local.
 */

public class Test {

    int z=30; //instance varibale
    static int c=20; //static variable

    public static void main(String args[]){
    int a=10; //local variable
        a=20;
        System.out.println(a);

        System.out.println("Main Method static variable"+c);
        Test t = new Test();
        t.display();

    }
    void display(){
        int a=20; //local variable

        System.out.println(a);

        System.out.println("instatnce variable"+z);

        System.out.println("Static vaiable access non-static"+c);

    }
}
