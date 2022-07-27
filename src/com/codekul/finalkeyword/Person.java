package com.codekul.finalkeyword;

public class Person {
    int empId;
    String name;
    final String PAN_NO = "AMPST000125L";

    final String ADHAR_NO;
    static final String BIRTH_DATE;
    final String MOBILE_NO;

    final String S_NAME;
    String CITY;
    public Person(String adhar_no, String mobile_no) {
        ADHAR_NO = adhar_no;

        MOBILE_NO = mobile_no;
    }
    {
        S_NAME="2525";
    }

    public void display(){
        System.out.println("adhar"+ADHAR_NO+"mobile no"+MOBILE_NO);
        System.out.println("city:"+CITY);
    }
    static {
        BIRTH_DATE="22/12/98";
    }

    final void setValue(String city){
       CITY = city;
    }
}

final class Emp{
    String empName ="Aditya";

    public void show(){
        empName="123";
        System.out.println("Emplyee name:"+empName);
    }
}
class PersonImpl{
    public static void main(String[] args) {
        Person person =new Person("32524898945","123456789");
        person.display();
        person.setValue("Pune");
        person.display();

        Emp e = new Emp();
        e.show();
    }
}
