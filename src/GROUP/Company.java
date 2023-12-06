package GROUP;

//A company pays its employees time-and-a-half for any hours worked over 40 hours in a
//        week. Write a program that takes the number of hours worked by an employee in a week
//        and their hourly wage, and outputs their total pay for the week.
import java.util.Scanner;
import java.util.Stack;

public class Company {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of hours worked in a week: ");
        int hoursWorked = scanner.nextInt();

        System.out.print("Enter the hourly wage: $");
        double hourlyWage = scanner.nextDouble();

        double totalPay = calculateTotalPay(hoursWorked, hourlyWage);
        System.out.println("Total pay for the week: $" + totalPay);

        scanner.close();
    }

    public static double calculateTotalPay(int hoursWorked, double hourlyWage) {
        double regularPay = 0;
        double overtimePay = 0;

        if (hoursWorked > 40) {
            int overtimeHours = hoursWorked - 40;
            regularPay = 40 * hourlyWage;
            overtimePay = overtimeHours * (hourlyWage * 1.5);
        } else {
            regularPay = hoursWorked * hourlyWage;
        }

        return regularPay + overtimePay;
    }

    public static class Main{
        public static void main(String[] args) {
            Stack<String> stack = new Stack<String>();
            System.out.println(stack.empty());
        }
    }
}

