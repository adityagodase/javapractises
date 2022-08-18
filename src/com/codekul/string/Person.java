package com.codekul.string;

public class Person {
  private  int pId;
    private String name;
    private int mNo;

    public Person(int pId, String name, int mNo) {
        this.pId = pId;
        this.name = name;
        this.mNo = mNo;
    }

    @Override
    public String toString() {
        return "Person{" +
                "pId=" + pId +
                ", name='" + name + '\'' +
                ", mNo=" + mNo +
                '}';
    }
}

class PersonImpl{
    public static void main(String[] args) {
        Person p =new Person(1,"Aditya",2222);
        System.out.println(p);
    }
}
