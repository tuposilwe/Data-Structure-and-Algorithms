package ASSIGNMENT_1;

public class QN13 {
    public static void main(String[] args) {
        int sum=0;
        for(int i=1;i<=100;i++){
            if(i%2==1){//check if i is odd
                sum+=i;//add i to the sum
            }
        }
        System.out.println("the sum of odd numbers between 1 and 100: "+sum);
    }
}
