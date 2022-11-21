package GFG;

public class IsPowerOfTwo {
    public static boolean isPowerOfTwo1(int x){  //Mycode
        if(x==0){
            return false;
        }
        while(x!=1){
            if(x%2==0){
                x=x/2;
            }else{
                return false;
            }
        }
        return true;
    }

    public static boolean isPowerOfTwo2(int x){  //GFG Naive
        if(x==0){
            return false;
        }
        while(x!=1){
            if(x%2!=0){
                return false;
            }
            x=x/2;
        }
        return true;
    }

    /*public static boolean isPowerOfTwo3(int x){  //GFG efficient (BriaN curnigham operation
        int count=0;
        for(int i=0;i<32;i++){
            if(x&(1<i)!=0
        }
    }*/

    public static boolean isPowerOfTwo4(int x){  //GFG efficient
        if(x==0){
            return false;
        }
        return ((x&x-1)==0);
    }
    public static void main(String [] args){

        System.out.println(isPowerOfTwo1(63));

        System.out.println(isPowerOfTwo2(64));

        System.out.println(isPowerOfTwo4(64));
    }
}
