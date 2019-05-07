package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String blankString="";
        System.out.println("Enter a word");
        String userinput = keyboard.nextLine();

        for (int i =userinput.length()-1;i>=0;i--){

            blankString=blankString+userinput.charAt(i);

        }

        System.out.println(userinput);
        System.out.println(blankString);

    }
}
