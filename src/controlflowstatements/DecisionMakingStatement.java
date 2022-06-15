package controlflowstatements;

public class DecisionMakingStatement {


//    public void compare(int a, int b int c){
//
//        if (a > b) {
//            System.out.println("a is greater");
//        }
//        else if(b>c){
//            System.out.println("b is greater");
//        }
//        else{
//            System.out.println("c is greater");
//        }
//    }

    public static void main(String args[]) {
        String city = "pune";
        //simple if statement
        if (city == "pune")
            System.out.println("u r from pune");
        else
            System.out.println("u r from mumbai");

        if (city == "mumbai")
            System.out.println("u r from mumbai");
        else if (city == "Goa")
            System.out.println("u r from goa");
        else
            System.out.println("u r form pune");


        String country = "India";
        if (country == "India") {
            System.out.println("Goa is in Inadia");

            if (city == "Goa") {
                System.out.println("Goa is in India");
            } else {
                if (city == "pune") {
                    System.out.println("pune is in india");
                }
            }
        }

        int ch = 2;

        switch (ch) {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            default:
                System.out.println("not number");


        }
    }
}
