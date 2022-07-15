package io;

import java.util.Scanner;

public class ScanData {

    public ScanData() {

        Scanner data = new Scanner(System.in);
        System.out.println("Enter string,int, double: ");

        String stringData = data.nextLine();
        int intData = data.nextInt();
        double doubleData = data.nextDouble();

        System.out.println("string: " + stringData);
        System.out.println("int: " + intData);
        System.out.println("double: " + doubleData);
    }
}
