package com.bridgelabz;

import java.util.Scanner;

public class CalculateLength {
    public void compareLines() {

        System.out.println("Calculate length between two points");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x1 : ");
        int x1 = scanner.nextInt();
        System.out.println("Enter y1 : ");
        int y1 = scanner.nextInt();
        System.out.println("Enter x2 : ");
        int x2 = scanner.nextInt();
        System.out.println("Enter y2 : ");
        int y2 = scanner.nextInt();
        int length = (int) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("Length of first line is : " + length);

        System.out.println("Calculate length between another two points");
        System.out.println("Enter x3 : ");
        int x3 = scanner.nextInt();
        System.out.println("Enter z3 : ");
        int z3 = scanner.nextInt();
        System.out.println("Enter x4 : ");
        int x4 = scanner.nextInt();
        System.out.println("Enter z4 : ");
        int z4 = scanner.nextInt();
        int length1 = (int) Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(z4 - z3, 2));
        System.out.println("Length of second line is : " + length1);


        if (length == length1) {
            System.out.println("Both lines are equal !");
        } else if (length > length1) {
            System.out.println("Line first are greater second line !");
        } else {
            System.out.println("Line first are less than second line !");
        }

    }

    public static void main(String[] args) {
        CalculateLength calculatelength = new CalculateLength();

        calculatelength.compareLines();

    }
}



