package ASSIGNMENT_1;

import java.util.Arrays;

public class Q14 {
    public static void main(String[] args) {
 String input="4 2 8 9 1 5 67 98";
 String[] numbers=input.split(" ");
 int[] array =new int[numbers.length];

 for(int i=0;i < numbers.length;i++ ){
     array[i]=Integer.parseInt(numbers[i]);
 }
        Arrays.sort((array));
 int secondLargest=array[array.length -2];
        System.out.println("the second largest number in the array is: "+secondLargest);

    }
}




















        /*String input="10 20 30 40 50";//input arrray as string

        //converting
        String[] strArray=input.split("");
        int[] intArray=new int[strArray.length];
        for(int i=0;i< strArray.length;i++){
            intArray[i]=Integer.parseInt(strArray[i]);
            */
