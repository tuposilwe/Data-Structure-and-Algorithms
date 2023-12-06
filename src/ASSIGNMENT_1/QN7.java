package ASSIGNMENT_1;
//Write a program that finds the largest number in an array.
//The array is {5.8, 10, 2, 20, 15}.
public class QN7 {
    public static void main(String[] args) {
  double[] arr={5.8,10,2,20,15};
  double largest=arr[0];//assume first element is largest
        for (int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.println("the largest number in the array is: "+largest);

    }
}
