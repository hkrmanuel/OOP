import java.util.Arrays;

/**
 * @author Elijah K. A. Boateng
 * @date 1/02/2024
 * @see Arrays toString method from the java documentation
 * @reference <a href="https://www.geeksforgeeks.org/bubble-sort/">Geeks for Geeks</a>
 */
public class Swapped {
    public static void main(String[] args) {
        // write test here
        int[] testArray = {1, 4, 3, 2, 5, 6};

        // printing the output of the bubble sort of test array as a string so that we can see the values and not an address
        System.out.println(Arrays.toString(bubbleSort(testArray)));

    }

    /**
     * The function sorts an int array using bubble sort algorithm
     *      traverse from left and compare adjacent elements and the higher one is placed at right side.
     *      in this way, the largest element is moved to the rightmost end at first.
     *      this process is then continued to find the second largest and place it and so on until the data is sorted.
     *
     * @param numbers an int array that needs to be sorted
     * @return sorted int array
     */
    public static int[] bubbleSort(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            // check if there was a swap - a way to check if all smaller values come before bigger ones
            boolean swapped = false;

            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    // the swap happens
                    int temp = numbers[j];
                    numbers[j] = numbers[j +  1];
                    numbers[j + 1] = temp;

                    // set swapped to true
                    swapped = true;
                }
            }

            // if after running the loop that's supposed to swap, we don't get any swaps, the means the array is sorted
            if (!swapped) break;
        }

        return numbers;
    }
}
 {
    
}
