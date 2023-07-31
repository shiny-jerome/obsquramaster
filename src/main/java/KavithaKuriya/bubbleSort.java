package KavithaKuriya;

import java.util.Arrays;

public class bubbleSort {

	public static void main(String[] args) {
		int []a= {3,2,9,1,5,6};
		// Perform bubble sort
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                	int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        // Display the sorted array
        System.out.println("Sorted array: " + Arrays.toString(a));
    }
}

