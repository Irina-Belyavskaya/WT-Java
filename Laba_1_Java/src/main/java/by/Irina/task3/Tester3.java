package main.java.by.Irina.task3;

import java.util.Scanner;

public class Tester3 {
    public static void test(){
        double a,b,h;
        System.out.print("Enter a:");
        Scanner in = new Scanner(System.in);
        a = in.nextDouble();

        System.out.print("Enter b:");
        b = in.nextDouble();

        System.out.print("Enter h:");
        h = in.nextDouble();

        var func = new Func(a,b,h);
        func.getResult();

    }
}
