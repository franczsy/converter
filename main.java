package main;

import java.util.Scanner;

public class main{

    public static int parseInput(String input, int base) {
        return Integer.parseInt(input, base);
    }

    public static String convert(int value, int targetBase) {
        return Integer.toString(value, targetBase).toUpperCase();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        System.out.println("binary  2, \"");
        System.out.println("octal 8 \"");
        System.out.println("decimal 10 \"");
        System.out.println("Hexadecimal 16 \"");
        System.out.println("");
        System.out.println("Enter the base of the input number : ");
        int inputBase = scanner.nextInt();
        System.out.print("Enter the number: ");
        String inputNumber = scanner.next();

        try {
            int number = parseInput(inputNumber, inputBase);
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("Converted Values:");
            System.out.println("Binary: " + convert(number, 2));
            System.out.println("Octal: " + convert(number, 8));
            System.out.println("Decimal: " + convert(number, 10));
            System.out.println("Hexadecimal: " + convert(number, 16));
        } catch (NumberFormatException e) {
            System.out.println("Invalid number for the specified base.");
        }
    }
}
