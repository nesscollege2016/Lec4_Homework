package edu.tomer.ness;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //define the scanner once in each program
        Scanner scanner = new Scanner(System.in);

        //input a number:
        System.out.println("Enter an n digit number:");
        int n = scanner.nextInt();
        int m = n;

        int divider = 1; //
        while (n != 0){
            System.out.print(n % 10 + ", ");
            n = n / 10;
            divider  = divider * 10;
        }
        divider /= 10;


        System.out.println("--------------------------------");

        while (divider != 0){
            System.out.print(m / divider +", ");
            m = m % divider;
            divider = divider / 10;
        }



    }
}
