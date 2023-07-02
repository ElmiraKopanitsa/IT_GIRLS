package kz.kopanitsa.lesson.week6.model;

import java.util.Scanner;

public class Factorial {
    Scanner sc = new Scanner(System.in);

    public int getFactorial() {
        System.out.print("\nВведите целое число, чтобы найти факториал: ");
        int number = sc.nextInt();
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
