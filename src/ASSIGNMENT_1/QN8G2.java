package ASSIGNMENT_1;

public class QN8G2 {
    public static int countPairs(int[] arr) {
        int evenCount = 0, oddCount = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        int pairs = evenCount * (evenCount - 1) / 2 + oddCount * (oddCount - 1) / 2;
        return pairs;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int pairs = countPairs(arr);
        System.out.println("Number of pairs with even sum and non-zero sum: " + pairs);
    }
}
