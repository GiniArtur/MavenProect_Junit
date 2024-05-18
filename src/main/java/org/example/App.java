package org.example;

import java.util.Scanner;

/**
 * Enter two number to console and deal some operations with it
 */
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа:");
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        System.out.println("Сумма чисел = " + (firstNumber + secondNumber));
        System.out.println("Разность чисел = " + (firstNumber - secondNumber));
        System.out.println("Деление чисел = " + (firstNumber / secondNumber));
        System.out.println("Произведение чисел = " + (firstNumber * secondNumber));
    }


    public  int sum(int a, int b) {
        return a + b;
    }
    public static int difference(int a, int b) {
        return a - b;

    }
    public static int division(int a, int b) {
        return a / b;

    }
    public static int product(int a, int b) {
        return a * b;

    }

}