package GFG;

public class VariationQuestion {
    public static int missingNumber(int [] arr){
        int res1=0;
        int res2=0;
        int [] temp= new int[arr.length+1];
        for(int i=0;i<temp.length;i++){
            temp[i]=i+1;
        }
        for(int j=0;j<arr.length;j++){
            res1=res1^arr[j];
        }
        for(int k=0;k<temp.length;k++){
            res2=res2^temp[k];
        }
        return res1^res2;
    }
    public static void main(String [] args){

        int [] arr={1,5,3,2};

        System.out.println(missingNumber(arr));

    }
}
