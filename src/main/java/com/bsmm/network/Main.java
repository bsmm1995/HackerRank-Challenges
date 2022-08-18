package com.bsmm.network;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the valid IP: ");
        String ip = scanner.nextLine().trim();

        System.out.print("Enter the valid MASK: ");
        String mask = scanner.nextLine().trim();

        System.out.print("The network address is: " + getNetworkAddress(ip, mask));
    }

    public static String getNetworkAddress(String ip, String mask) {
        String[] ipParts = ip.split("\\.");
        String[] maskParts = mask.split("\\.");
        StringBuilder networkAddress = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            String ipTmp = leftPadding(toBinaryString(ipParts[i]));
            String maskTmp = leftPadding(toBinaryString(maskParts[i]));
            StringBuilder part = new StringBuilder();
            for (int j = 0; j < 8; j++) {
                part.append(ipTmp.charAt(j) == maskTmp.charAt(j) && ipTmp.charAt(j) == '1' ? "1" : "0");
            }
            networkAddress.append(Integer.parseInt(part.toString(), 2)).append(i < 3 ? "." : "");
        }
        return networkAddress.toString();
    }

    private static String toBinaryString(String part) {
        return Integer.toBinaryString(Integer.parseInt(part));
    }

    private static String leftPadding(String input) {
        return String.format("%8s", input).replace(' ', '0');
    }
}