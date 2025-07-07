package Arrays;

import java.util.*;

public class Question8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int sum = 0;
		boolean skip = false;

		for (int num : arr) {
			if (num == 6) {
				skip = true;
			} else if (num == 7 && skip) {
				skip = false;
			} else if (!skip) {
				sum += num;
			}
		}

		System.out.println("Sum of elements: " + sum);
	}

}
