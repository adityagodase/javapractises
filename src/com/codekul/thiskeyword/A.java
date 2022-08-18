package com.codekul.thiskeyword;

/**
 * 2.Used to Invoke current class method
 */
public class A {

    void m(A a){
        System.out.println("m method gets called");
    }

    void n(){
        System.out.println("n method gets called ");
        m(this);
        System.out.println("n method exit");
    }

    public static void main(String[] args) {
        A a =new A();
        a.n();
    }
}
