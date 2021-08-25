package day103;

import java.util.Scanner;
import java.util.*;

public class scanner {
    public static void main(String[] args){
        int[] a=new int[5];
        a[0] = 1;
        a[1] = 23;
        a[2]= 2;
        a[3] = 454;
        a[4] = 3333;

    /*for(int i=0;i<a.length;i++) {
            a[i]=(int)(Math.random() * 100);
        }*/
        System.out.println();
        for(int j=0;j<a.length-1;j++){
            for(int i=0;i<a.length-1-j;i++){
                int x=0;
                if(a[i]>a[i+1]) {
                    x = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = x;
                }
            }
        }
        for(int num:a){
            System.out.print(num+" ");
        }
    }
}
