package com.bsmm.steps;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string in uppercase: ");
        String input = scanner.nextLine().toUpperCase();

        System.out.println(String.format("The process takes %d seconds.\n\n", getTotalSteps(input, getData())));
    }

    public static LinkedList getData() {
        LinkedList chars = new LinkedList();

        for (int i = 65; i <= 90; i++) {
            chars.add((char) i);
        }
        return chars;
    }

    public static long getTotalSteps(String input, LinkedList chars) {
        long total = 0;
        Node current = chars.getRoot();

        int length = input.length();
        if (length < 1 || length > Math.pow(10, 5)) {
            throw new RuntimeException("String size is not allowed.");
        }

        for (int i = 0; i < length; i++) {
            char c = input.charAt(i);
            total += chars.countMinimumSteps(c, current);
            current = chars.getCurrent(c);
        }
        return total;
    }
}