package com.company;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Sean McCormack
 */
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        System.out.print("What is the quote? ");
        String quote = scan.nextLine();
        System.out.print("Who said it? ");
        String person = scan.nextLine();
        System.out.println(person + " says, \""+quote+"\"");

    }
}
