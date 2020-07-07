package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// System.out.print("Enter your name:");
        System.out.print("Enter your name:");
        Scanner inp= new Scanner(System.in);
        String name;
        name = inp.nextLine();
     // System.out.print(name);
        System.out.println(name);
        System.out.print("Enter your age:");
        String age = inp.nextLine();
        System.out.println(age);


        System.out.print("Enter your grade:");
        String grade = inp.nextLine();
        System.out.println(grade);


        System.out.print("Enter your height in inches:");
        String height = inp.nextLine();
        System.out.println(height);


        System.out.print("Enter your weight:");
        String weight = inp.nextLine();
        System.out.println(weight);


        System.out.print("Hello my name is(name). I am (age) years old and in (grade)th grade. I also am (height) inches tall and weigh(weight)pounds");



    }
}
