package core;

import java.util.HashMap;
import java.util.Scanner;

public class AmicableNumbers {

    private static int sumFactors(int n) {
	int sum = 0;
	for (int div = 1; div <= n / 2; div++) {
	    if (n % div == 0) {
		sum += div;
	    }
	}
	return sum;
    }

    private static int[][] getMatrix(int limit) {
	int[] array = new int[limit];
	for (int i = 2; i < limit; i++)
	    array[i] = sumFactors(i);

	HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	for (int i = 2; i < limit; i++) {
	    int j = array[i];
	    if (j < i && i == array[j])
		map.put(i, j);
	}

	int[][] matrix = new int[map.size()][2];
	int index = 0;
	for (int key : map.keySet()) {
	    matrix[index][0] = key;
	    matrix[index][1] = map.get(key);
	    index++;
	}
	return matrix;
    }

    public static void main(String[] args) {

	System.out.print("Enter a number:  ");
	Scanner input = new Scanner(System.in);
	int number = input.nextInt(); input.close();
	System.out.print("Amicable numbers are: ");
	int[][] matrix = getMatrix(number);
	for (int i = 0; i < matrix.length; i++)
	    System.out.println(matrix[i][1] + " " + matrix[i][0]);
    }
}
