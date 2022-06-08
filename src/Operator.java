public class Operator {
    public static void main(String[] args) {
      int a=30;
      boolean  flag =false;
        System.out.println(a++);//30
        System.out.println(--a);//30
        System.out.println(++a);//31
        System.out.println(a--);//31

        System.out.println(~a);//(-a)-1=(-30)-1=-31

        System.out.println(!flag);

        int x=10;
        int y=20;
        int z=30;

        System.out.println(x+y);
        System.out.println(y-x);
        System.out.println(x*y);
        System.out.println(z/x);
        System.out.println(z%x);

        //shift operator
      System.out.println(x<<2);//10*2^2=10*4=40
      System.out.println(x<<3);//10*2^3=10*8=80
      System.out.println(x>>2);//10/2^2=10/4=2
      System.out.println(x>>3);//10/2^3=10/8=1

      //Logical & Bitwise operator
      System.out.println(x<y && y>z);
      System.out.println(x<y & y>z);
      System.out.println(z<y || y>x);
      System.out.println(z<y | y>x);

      //Ternary
      System.out.println(x>y ? "x is max":"y is max");


    }
}
