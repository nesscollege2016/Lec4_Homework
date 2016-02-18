package edu.tomer.ness;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int found = 0;

        for (int i = 0; found < 5; i++) {
             if (i%2 == 1 && i%13 == 1){
                 found++;
                 System.out.print(i + ", ");
             }
        }
    }
}
