package ASSIGNMENT_1;

//Write a program that calculates the factorial of 5.99
public class QN4 {
    public static void main(String[] args) {
        double n=5.99;
    long roundedN=(long)Math.ceil(n);
    long factorial=1;
    for(long i=2;i<=roundedN;i++){
        factorial*=i;
    }
        System.out.println("factorial of "+n+" rounded up to "+roundedN+" is "+factorial);
    }

}








