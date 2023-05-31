package org.lessons.java;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TrainTicket {
    public static void main(String[] args) {

        //declare the variables
        int km;
        int age;
        double ticketPriceTot;

        //scanner
        Scanner keyBoardReader = new Scanner(System.in);

        System.out.println("inserisci i Km da percorrere: ");
        km = keyBoardReader.nextInt();
        System.out.println("inserisci la tua età: ");
        age = keyBoardReader.nextInt();

        double ticketPrice = km * 0.21;

        //bonus
        DecimalFormat decimalFormat = new DecimalFormat("#.##");

        //condition
        if (age < 18) {
            ticketPriceTot = ticketPrice - (ticketPrice * 0.20);
            String formattedPriceTot = decimalFormat.format(ticketPriceTot);
            System.out.println("Il prezzo del tuo biglietto è di: " + formattedPriceTot + " euro");
        } else if (age > 65) {
            ticketPriceTot = ticketPrice - (ticketPrice * 0.40);
            String formattedPriceTot = decimalFormat.format(ticketPriceTot);
            System.out.println("Il prezzo del tuo biglietto è di: " + formattedPriceTot + " euro");
        } else {
            String formattedPrice = decimalFormat.format(ticketPrice);
            System.out.println("Il prezzo del tuo biglietto è di: " + formattedPrice + " euro");
        }
    }
}
