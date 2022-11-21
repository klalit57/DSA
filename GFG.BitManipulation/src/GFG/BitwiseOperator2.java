package GFG;

public class BitwiseOperator2 {
    public static void main(String [] args){
        int x=1;
        int y=5;
        System.out.println(~x +","+~y); //Not operator
        /*
           x=1= 0000...0001 in binary (left most 0 represent positive
          ~x= = 1111...1110 not operator (2^32-1-1=2^32-2= -2 in decimal)

          in computer lest most 1 represent negative integer
          say -x= 2^32-x

          if x=11111.....1111 = 2^32-1 in decimal
          range of integer= -2^31-1  to 2^31-1 (left most bit represent positive or negative
        */

    }

}
