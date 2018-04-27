package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String acolour;

        ArrayList<String> colours = new ArrayList<>();

        for (int i = 1; i <= 3; i++) {
            System.out.println("what is your favorite colour?");
            acolour = scan.nextLine();

            colours.add(acolour);
        }

        System.out.println("Printing with normal for loop");
       for(int i=0; i<colours.size() ; i++){
           System.out.println("those colours:"+ colours.get(i));
       }

        System.out.println("Printing for enhanced loop");
        for(String thecolour:colours) {
    System.out.println("those Colours: " + thecolour);

    }

    }
}