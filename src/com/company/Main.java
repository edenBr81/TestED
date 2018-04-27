package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String acolour;

     ArrayList<String> colour=new ArrayList();


        System.out.println("What is your favorite colour?");
        acolour=scan.nextLine();
        colour.add(acolour);

        System.out.println("what is your favorite colour?");
        acolour=scan.nextLine();
        colour.add(acolour);

        System.out.println("what is your favorite colour?");
        acolour=scan.nextLine();
        colour.add(acolour);

        System.out.println("what is your favorite colour?");
        acolour=scan.nextLine();
        colour.add(acolour);

      for(String eachcolour:colour){
          System.out.println("colours "+eachcolour);
      }

    }
}
