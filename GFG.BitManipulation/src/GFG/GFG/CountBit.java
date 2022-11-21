package GFG.GFG;

public class CountBit {
    public static int countBit1(int n){  //MySolution could be wrong
        int count =0;
        for(int k=0;k<=32;k++) {
            if ((n & (1 << k - 1)) != 0) {
                count++;
            }
        }
        return count;
    }
    public static int countBit2(int n){ //GFG method-1 Naive Solution
        int res=0;
        while(n>0){
            if(n%2!=0){
                res++;
            }
            n=n/2;
        }
        return res;
    }

    public static int countBit3(int n){ //GFG method-1 Naive Solution
        int res=0;
        while(n>0){
            if((n&1)!=0){
                res++;
            }
            n=n>>1;
        }
        return res;
    }

    public static int countBit4(int n){  //GFG Method-2 Brian Kerningham's algorithm
        int count=0;
        while(n>0){
            n=n&(n-1);
            count++;
        }
        return count;
    }


    public static void main(String [] args){
        int x=13;
        int y=13;
        int z=13;
        int a=13;

        System.out.println(countBit1(x));
        System.out.println(countBit2(y));
        System.out.println(countBit3(z));
        System.out.println(countBit4(a));

    }
}
