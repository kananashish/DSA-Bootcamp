//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;
public class simpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p = input.nextInt();
        float r = input.nextFloat();
        int t = input.nextInt();
        float simpleInterest = (p*r*t)/100;
        System.out.print("Simple interest of entered values is: " + simpleInterest);
    }
}
