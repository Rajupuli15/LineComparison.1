package com.bridgelabz;

import java.util.Scanner;
public class LineComparison {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("For Line 1: Enter the coordinates (x1,y1)");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        System.out.println("For Line 1: Enter the coordinates (x2,y2)");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        System.out.println("For Line 2: Enter the coordinates (x3,y3)");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();

        System.out.println("For Line 2: Enter the coordinates (x4,y4)");
        int x4 = sc.nextInt();
        int y4 = sc.nextInt();

        int res1 = (int) Math.pow((x2-x1), 2);
        int res2 = (int) Math.pow((y2-y1), 2);
        int res3 = (int) Math.pow((x4-x3), 2);
        int res4 = (int) Math.pow((y4-y3), 2);

        double Len1 =  Math.sqrt(res1+res2);
        double Len2 =  Math.sqrt(res3+res4);
        System.out.println("Length of Line1 and Line2 "+ Len1 +" & "+ Len2);

        int value = Double.compare(Len1,Len2);
        if (value == 0)
            System.out.println("Lines are equal");
        else if (value == 1)
            System.out.println("Line1 is greater than Line2");
        else
            System.out.println("Line1 is less than Line2");
    }
}

