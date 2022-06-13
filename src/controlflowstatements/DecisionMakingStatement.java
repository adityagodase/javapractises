package controlflowstatements;

public class DecisionMakingStatement {
    public static  void main(String args[]){
        String city="pune";
        //simple if statement
        if(city=="pune")
            System.out.println("u r from pune");
        else
            System.out.println("u r from mumbai");

        if(city=="mumbai")
            System.out.println("u r from mumbai");
            else if(city=="Goa")
                System.out.println("u r from goa");
                else
                System.out.println("u r form pune");


        String country ="India";
        if(country=="India") {
            System.out.println("Goa is in Inadia");

            if (city == "Goa") {
                System.out.println("Goa is in India");
            } else {
                if (city == "pune") {
                    System.out.println("pune is in india");
                }
            }
        }
    }
}
