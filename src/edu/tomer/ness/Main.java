package edu.tomer.ness;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //define the scanner once in each program
        Scanner scanner = new Scanner(System.in);

        //input a number:
        System.out.println("How many fibonacci numbers?:");
        int n = scanner.nextInt();

        int fib1 = 0;
        int fib2 = 1;
        int counter = 2;
        System.out.println(fib1);
        System.out.println(fib2);
        //1  2  3  4  5  6  7
        //0, 1, 1, 2, 3, 5, 8

        //n = 6
        while (counter < n){
            int temp = fib2; //temp = 2
            fib2 = fib1 + fib2; // fib2 = 3
            fib1 = temp;// fib1 = 2
            System.out.println(fib2);
            counter++;
        }

    }
}
