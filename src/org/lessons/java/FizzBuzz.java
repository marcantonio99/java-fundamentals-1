package org.lessons.java;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        //scanner
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il numero di numeri da stampare (da 1 a 1000): ");
        int n = scanner.nextInt();

        //bonus condition
        if (n <= 0 || n > 1000){
            System.out.println("Il numero inserito non è valido!");
            return;
        }

        //conditions and loop
        for (int i = 1; i <= n; i++){
            if (i % 3 == 0 && i % 5 ==0){
                System.out.println("FizzBuzz");
            }else if (i % 3 == 0){
                System.out.println("Fizz");
            }else if (i % 5 == 0){
                System.out.println("Buzz");
            }else {
                System.out.println(i + " ");
            }
        }
    }
}
