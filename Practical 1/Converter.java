//take input in minutes and convert to years, months, day

import java.util.Scanner;

class Converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("MOKSHITA RANA");
        System.out.println("24CSU308");
        System.out.print("Enter minutes: ");
        long minutes = scanner.nextLong();

        long totalDays = minutes / 1440;

        long years = totalDays / 365;
        long remainingDaysAfterYears = totalDays % 365;

        long months = remainingDaysAfterYears / 30;
        long days = remainingDaysAfterYears % 30;

        System.out.println(years + " years");
        System.out.println(months + " months");
        System.out.println(days + " days");

        scanner.close();
    }
}