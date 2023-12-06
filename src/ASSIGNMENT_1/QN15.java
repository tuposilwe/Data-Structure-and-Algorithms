package ASSIGNMENT_1;
import java.util.Scanner;
public class QN15 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter a sentence: ");
        String sentence= scanner.nextLine();

        int longestWordLenght=0;
        String[] words=sentence.split(" ");
        for(String word : words){
            int length=word.length();
            if(length>longestWordLenght){
                longestWordLenght=length;
            }
        }
        System.out.println("lenght of the longest word: "+longestWordLenght);
    }

}