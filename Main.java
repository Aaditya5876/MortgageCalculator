package com.myCompany;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        byte PERCENT = 100;
        byte MONTHS_IN_YEAR = 12;
        //ask input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Annual Intrest Rate: ");
        float annualIntrest = scanner.nextFloat();
        float monthlyIntrest = annualIntrest / PERCENT / MONTHS_IN_YEAR;

        System.out.print("Period(years): ");
        byte years = scanner.nextByte();
        int numberOfPayments = years * MONTHS_IN_YEAR;

        //m=p*(1+r)^n/(1+r)^n-1
        double mortage = principal *
                (monthlyIntrest * Math.pow(1 + monthlyIntrest, numberOfPayments)) /
                Math.pow(1+monthlyIntrest, numberOfPayments) - 1;

        System.out.println(mortage);

        String mortageFormated = NumberFormat.getCurrencyInstance().format(mortage);
        System.out.print("MORTAGE: " + mortageFormated);

    }
}
