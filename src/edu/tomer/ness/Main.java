package edu.tomer.ness;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //define the scanner once in each program

        int numRows = 3;
        int numCol = 4;

        int i = 0;
        int j = 0;

        while (i < numRows){
            while (j <= i ){
                j++;
                System.out.print("*");
            }
            j = 0;
            System.out.println();
            i++;
        }
    }
}
