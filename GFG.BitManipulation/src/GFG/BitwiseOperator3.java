package GFG;

public class BitwiseOperator3 {
    public static void main(String [] args){
        int x=1;   //00000.....00001
        int n=1;   // 1 position
        System.out.println(x<<n);
        System.out.println(x<<2);//left shift operation
        //res= 00000...00010 = 2 in decimal
        // res= x* 2^n

        int y=5;
        int s=2;

        System.out.println(x>>n);
        System.out.println(y>>s);//left shift operation
        //res= 00000...00000 = 0 in decimal
        // res= x/ 2^n base of this number

        int a=-2;
        int p=1;

        System.out.println(a>>p); // unsigned right shift
        System.out.println(a>>>p);
    }
}
