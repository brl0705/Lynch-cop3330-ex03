package org.example;

import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {
        Scanner quote = new Scanner(System.in);
        System.out.println("What is the quote?");
        System.out.println("\n");
        System.out.println("Who said it?");
        Scanner person = new Scanner(System.in);



        String q = quote.nextLine();
        String p = person.nextLine();
        System.out.println(p + " says, " + q);
    }
}
