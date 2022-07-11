package com.bridgelabz;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {

        int N;
        double nthharmonicValue = 1;
        System.out.print("Enter nth harmonic number:");
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        System.out.printf("The %d harmonic series:",N);
        System.out.println("1");
        for(int i=2; i<=N; i++){
            System.out.println("+1/" +i);
            nthharmonicValue += (double) 1/i;
        }
        System.out.printf("The %d harmonic value H%d:",N,N);
        System.out.println(nthharmonicValue);
    }
}
