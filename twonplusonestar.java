//n=3
//*
//**
//***
//**
//*

import java.util.*;

public class twonplusonestar {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        pat(n);
    }
    static void pat(int n){
        int k=2*n-1;
        for (int i = 0; i < k; i++) {
            int c=0;
            if(i<n)
                c=i;
            else
                c=k-i-1;
            for (int j = 0; j <=c; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
