package com.company.lab;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        {
            BalancedBrackets check = new BalancedBrackets();
            Scanner example1 = new Scanner(Main.class.getResourceAsStream("one_expression.txt"));
            Scanner example2 = new Scanner(Main.class.getResourceAsStream("three_expressions.txt"));
            System.out.println("First file:");
            String expr1 = example1.nextLine();
            check.check(expr1);
            System.out.println("Second file");
            for (int i = 0; i < 3; i++) {
                String expr2 = example2.nextLine();
                check.check(expr2);

            }
        }
    }

}

