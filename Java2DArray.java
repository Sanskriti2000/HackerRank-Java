import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Java2DArray{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int a[][]= new int[6][6];
        for(int i=0; i<6; i++){
            for(int j=0; j<6; j++){
             a[i][j] =  in.nextInt();   
            }
        }
        int max = -9*6;
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                int sum=a[i][j]+a[i][j+1]+a[i][j+2];
                sum+=a[i+1][j+1];
                sum+=a[i+2][j]+a[i+2][j+1]+a[i+2][j+2];
                if(sum>max){
                    max=sum;
                }
            }
        }
        System.out.println(max);
    }
}


