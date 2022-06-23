package com.codekul.thiskeyword;

public class Bike {
    int bikeNo;
    String bikeName;

    public Bike() {
        this(101, "Activa");
        System.out.println("default constructor");
    }

    public Bike(int bikeNo, String bikeName) {
        System.out.println("parametrised constructor");
        this.bikeNo = bikeNo;
        this.bikeName = bikeName;
    }

    public void display() {
        System.out.println("Bike details");

        System.out.println("Bike No" + bikeNo);
        System.out.println("Bike Name" + bikeName);
    }
}

    class BikeImpl{
        public static void main(String[] args) {
            Bike bike= new Bike();
            bike.display();

        }
    }

