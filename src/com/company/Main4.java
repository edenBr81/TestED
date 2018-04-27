package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        ArrayList<String>colours=new ArrayList<>();
        String acolour;
        boolean done=false;


//        while(i<=3)
//
//        {
//            System.out.println("what is Your Favourite Colour?");
//            acolour=scan.nextLine();
//            colours.add(acolour);
//            i++;
//        }



        while(done==false)
        {


            System.out.println("what is Your Favourite Colour?");
            acolour=scan.nextLine();
            colours.add(acolour);

            done=true;

        }


        for(String thecolour:colours) {
            System.out.println("Here are those colours: " + thecolour);
        }


    }
}
