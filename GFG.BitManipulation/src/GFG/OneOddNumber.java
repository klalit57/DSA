package GFG;

public class OneOddNumber {
    public static int oneOddNumber1(int []arr){ //Naive Solution
        int res=0;
        for(int i=0;i<arr.length;i++) {
            res=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    res++;
                }
            }
            if(res%2!=0){
                return arr[i];
            }
        }
        return res;
    }

    public static int oneOddNumber2(int [] arr){
        int res=0;
        for(int i=0;i<arr.length;i++){
            res=res^arr[i];
        }
        return res;
    }
    public static void main(String [] args){
        int [] arr = {4,3,4,4,4,5,5};

        System.out.println(oneOddNumber1(arr));

        System.out.println(oneOddNumber2(arr));

    }
}
