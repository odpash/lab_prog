package com.company;

import java.lang.Math.*;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // Step # 1
        int a[] = new int[(23 - 5) / 2 + 1];
        int idx = -1;
        for (int i = 23; i > 4; i -= 2) {
            idx += 1;
            a[idx] = i;
        }
        // Step # 2
        double x[] = new double[11];
        for (int i = 0; i < 11; i++) {
            x[i] = -14 + Math.random() * 25;
        }

        // Step # 3
        double sp[][] = new double[10][11];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < 11; j++) {
                if (a[i] == 9) {
                    sp[i][j] = Math.cbrt(Math.pow(2 * (Math.pow((3 / x[j]), (x[j])) + 1), Math.pow((2 / 3 * (1 - x[j])), 3)));
                } else if (a[i] == 5 || a[i] == 11 || a[i] == 15 || a[i] == 17 || a[i] == 19) {
                    sp[i][j] = Math.cos(Math.cos(Math.pow(x[j] / (x[j] + 1), 2)));
                } else {
                    sp[i][j] = Math.pow(Math.log(Math.sqrt(Math.pow(Math.tan(x[j]), 2))), 3);
                }
            }
        }
        System.out.println("Output:");
        System.out.println("Col/Row |   Col 1  |   Col 2  |   Col 3  |   Col 4  |   Col 5  |   Col 6  |   Col 7  |   Col 8  |   Col 9  |  Col 10  |  Col 11  |");
        for (int i = 0; i < 10; i++) {
            String to_print = "";
            if (i > 8) {to_print = " Row " + (i + 1) + " |";}
            else {to_print = " Row " + (i + 1) + "  |";}
            for (int j = 0; j < 11; j++) {
                String result_digit = String.format("%.5f", sp[i][j]);
                to_print += String.join("", Collections.nCopies(10 - result_digit.length(), " ")) + result_digit + "|";
                }
            System.out.println(to_print);
        }
    }
}
