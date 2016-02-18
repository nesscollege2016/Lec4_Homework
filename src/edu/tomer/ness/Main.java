package edu.tomer.ness;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //define the scanner once in each program
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number for the Factorial:");
        int n = scanner.nextInt();

        int counter = 1;
        int sum = 0;

        while (counter <= n){
            sum += counter;
            counter = counter + 1; //counter++
        }
        System.out.println(n + "! = " +sum);

    }
}
