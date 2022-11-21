package GFG;

public class BitwiseOperator1 {

    public static void main(String [] args){
        int x=3,y=6;
        System.out.println(x&y); //AND OPERATOR
        System.out.println(x|y); //OR OPERATOR
        System.out.println(x^y); //XOR Operator

        /* x=00...011
           y=00000110
         x&y=00000010=2 in decimal

           x=00...011
           y=00000110
         x|y=00000111=7 in decimal

           x=00...011
           y=00000110
         x^y=00000101=5 in decimal
         */


    }
}
