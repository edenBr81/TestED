package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String mycolour;
        boolean done = false;
        String answer;
        ArrayList<String> colours = new ArrayList<>();

        int eden = 0;

        do {

            System.out.println("what is your favourite colour?");
            mycolour = scan.nextLine();
            colours.add(mycolour);

//            System.out.println("Do you want ask another person?");
//            answer = scan.nextLine();
//
//            if (answer.equalsIgnoreCase("no") || answer.equalsIgnoreCase("n"))
//                done = true;

            eden++;
        } while (eden<4);
        for (String thecolour : colours) {
            System.out.println("Your Favorite Colours: " + thecolour);
        }

    }
}