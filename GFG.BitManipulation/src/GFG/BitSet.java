package GFG;

public class BitSet {
    public static void isBitSet(int n , int k){
        if((n&(1<<k-1))!=0) {
            System.out.println("set");
        }else{
            System.out.println("Not set");
        }

    }
    public static void isBitSet2(int n , int k){
        if(((n>>(k-1))&1)!=0) {
            System.out.println("set");
        }else{
            System.out.println("Not set");
        }
    }
    public static void main(String [] args){
        isBitSet(5,1);
        isBitSet(8,2);
        isBitSet(0,3);
        isBitSet(10,5);

        isBitSet2(5,1);
        isBitSet2(8,2);
        isBitSet2(0,3);
        isBitSet2(10,5);



    }
}
