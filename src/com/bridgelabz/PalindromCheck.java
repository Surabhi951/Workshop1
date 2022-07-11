package com.bridgelabz;

import java.util.Scanner;

public class PalindromCheck {
    public static void main(String[] args){
        int n, c,r;
        int s=0;
        System.out.print("Enter the Number");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        c = n;

        while (n > 0){
            r = n%10;
            s = (s*10)+r;
            n = n/10;
        }
        if(c == s){
            System.out.print("palindrom number");
        }
        else{
            System.out.print("not a palindrom number");
        }
    }
}
