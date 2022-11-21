package GFG;

public class TwoOddOccuring {
    public static void twoOddOccuring1(int [] arr){ //gfg Naive
            int res;
            for(int i=0;i<arr.length;i++) {
                res=0;
                for(int j=0;j<arr.length;j++){
                    if(arr[i]==arr[j]){
                        res++;
                    }
                }
                if(res%2!=0){
                    System.out.println(arr[i]);
                }
            }
        }

        public static void twoOddOccuringNumber2(int [] arr){
        int res1=0,res2=0, xor=0;
        for(int i=0;i<arr.length;i++){
            xor=xor^arr[i];
        }
        int sb= xor & (~(xor-1));
        for(int j=0;j<arr.length;j++){
            if((sb&arr[j])!=0){
                res1=res1^arr[j];
            }
            else{
                res2= res2^arr[j];
            }
        }
            System.out.println(res1 +" "+res2);
        }
    public static void main(String [] args){
        int [] arr= {3,4,3,4,5,4,4,6,7,7};

        twoOddOccuring1(arr);

        twoOddOccuringNumber2(arr);

    }
}
