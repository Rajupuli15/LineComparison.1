package com.bridgelabz;

import java.util.Scanner;
public class LineComparison {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the coordinates (x1.y1)");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        System.out.println("Enter the coordinates (x2,y2)");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        int res1 = (int) Math.pow((x2-x1), 2);
        int res2 = (int) Math.pow((y2-y1), 2);

        double length = Math.sqrt(res1+res2);

        System.out.println("Length of line:"+ length);
    }
}

