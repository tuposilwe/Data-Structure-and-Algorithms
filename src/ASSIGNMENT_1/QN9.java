package ASSIGNMENT_1;
import java.util.Scanner;
//Write a program to calculate the average temperature of a city for the past week
public class QN9 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double sum=0;
        int days=7;
        for (int i=1;i<=days;i++){
            System.out.printf("enter temperature for day: "+i+": ");
            double temp=scanner.nextDouble();
            sum+=temp;
        }
        double averageTemp=sum/days;

        System.out.printf("the average temperature of a city for the past week "+averageTemp+" degrees Celsius");
    }
}















































