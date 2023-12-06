package ASSIGNMENT_1;
//Write a program that calculates the average of the numbers in an array.
//The array is {10, 20, 30, 40, 50}.
public class QN6 {
    public static void main(String[] args) {

        int [] numbers={10,20,30,40,50};
        double sum =0;
      
        for(int i=0;i<numbers.length;i++){
            sum+=numbers[i];
        }
       double average=sum/numbers.length;
        System.out.println("the avearge of numbers in the array is: "+average);

    }
}
