package pl.factorial;

import java.util.Scanner;

public class Main {

    static int factorial(int n)
    {
        if (n == 0)
            return 1;
        else
            return (n * factorial(n - 1));
    }

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int i, fact = 1;
        System.out.println("Enter number to calculate factorial:");
        int number = n.nextInt();
       fact = factorial(number);

        System.out.println("Factorial of " + number + " is: " + fact);
    }
}
