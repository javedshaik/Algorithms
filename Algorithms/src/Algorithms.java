
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.util.Arrays;
import java.util.Scanner;

public class Algorithms {
	public static void main(String[] args) {

		Scanner fileIn = null;
		String fileName = "data.txt";
		int i = 0;

		int[] arr = new int[10];

		try {
			fileIn = new Scanner(new FileInputStream(fileName));

		} catch (FileNotFoundException e) {
			System.out.println("Error " + fileName + " not found");
		}

		while (fileIn.hasNext()) {
			arr[i] = fileIn.nextInt();
			i++;
		}
		bubbleSort(arr);
		insertionSort(arr);
	}

	public static void bubbleSort(int[] arr) {
		int j;
		boolean flag = true;
		int temp;

		while (flag) {
			flag = false;
			for (j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = true;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void insertionSort(int[] arr) {
		int temp=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j > 0; j--) {
				if (arr[j] < arr[j - 1]) {
					temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
