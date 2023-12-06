package GROUP;

public class Integers {
    public static void main(String[] args) {
        int[] array = {2, 5, 8, 3, 6, 1,9,7,4};

        int pairCount = countPairs(array);
        System.out.println("Number of pairs: " + pairCount);
    }

    public static int countPairs(int[] array) {
        int pairCount = 0;

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int sum = array[i] + array[j];
                if (sum % 2 == 0 && sum != 0) {
                    pairCount++;
                }
            }
        }

        return pairCount;
    }
}
