package com.codekul.thiskeyword;

public class Car {
    int carNo;
    String carName;
    double price;

    Car(int carNo,String carName,int price){
        this.carNo=carNo;
        this.carName=carName;
        this.price= price;

    }

    void display(){
        System.out.println("Car details");

        System.out.println("Car no: "+carNo+"\nCar Name: "+carName+"\nprice:"+price);

    }
}

class CarImpl{
    public static void main(String[] args) {
        Car car =new Car(101,"ferrari",9000000);
        car.display();
    }
}
