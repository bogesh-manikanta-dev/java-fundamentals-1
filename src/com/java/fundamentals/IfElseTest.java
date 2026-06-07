package com.java.fundamentals;
import java.util.Scanner;
public class IfElseTest {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = scanner.nextInt();
        if (number%2==0){
            System.out.println(number + "is even");
        } else {
            System.out.println(number + "is odd");
        }


    }
}
