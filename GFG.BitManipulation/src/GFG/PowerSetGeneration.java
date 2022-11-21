package GFG;
import java.lang.*;
import java.util.*;
import java.io.*;


public class PowerSetGeneration {
    public static void powerSetGeneration(String str){
        int n=str.length();
        int setSize=(int)Math.pow(2,n);
        for(int counter=0;counter<setSize;counter++){
            for(int j=0;j<n;j++){
                if((counter & (1<<j))!=0){
                    System.out.print(str.charAt(j)+" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String [] args){
        String str="abc";
        powerSetGeneration(str);

    }
}
