package core;

import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
	int matrix1[][] = new int[3][3];
	int matrix2[][] = new int[3][3];
	int matrix3[][] = new int[3][3];

	Scanner scan = new Scanner(System.in);
	for (int i = 0; i < 3; i++) {
	    for (int j = 0; j < 3; j++) {
		System.out.println("Matrix # 1 [" + i + "][" + j + "]:");
		matrix1[i][j] = scan.nextInt();
	    }
	}
	for (int i = 0; i < 3; i++) {
	    for (int j = 0; j < 3; j++) {
		System.out.println("Matrix # 2 [" + i + "][" + j + "]:");
		matrix2[i][j] = scan.nextInt();
		
	    }
	}
	scan.close();
	// Start coding
	for (int i =0; i < 3; i++){
	    for ( int j = 0; j < 3; j++) {
	for(int k = 0; k < 3; k++) {
	    matrix3[i][j] = matrix3[i][j] + matrix1[i][k] * matrix2[k][j];
	}}}
	// End coding
	System.out.println("Matrix Multiplication: ");
	for (int i = 0; i < 3; i++) {
	    for (int j = 0; j < 3; j++) {
		System.out.print(matrix3[i][j] + " ");
	    }
	    System.out.println();
	}
    }
}