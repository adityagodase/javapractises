package controlflowstatements;

public class ForLoopEx {
    public static void main(String[] args) {
        //simple loop
        for(int i=0;i<3;i++){
            System.out.println("print: "+i);
        }
        System.out.println(".................................................");
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.println(i+" "+j);
            }
        }
        System.out.println("...............................................");
        for(int i=5;i>0;i--){
            for(int j=5;j>0;j--){
                System.out.println(i+" "+j);
            }
        }
        System.out.println("...............................................");
        //enhanced for loop

        int a[] = {5,10,15,20,25};

        for(int no : a){
            System.out.println("The no:"+no);
        }
    }
}
