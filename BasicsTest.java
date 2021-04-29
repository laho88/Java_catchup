package com.javafundamentals.laho;
import java.util.Arrays;

public class BasicsTest {

	public static void main(String[] args) {

		BasicsTest solve = new BasicsTest();

		solve.printToTwoFiveFive();

		solve.printOddNumbers();

		solve.printSums();

	    int[] arr1 = {1, 3, 5, 7, 9, 13};
	    solve.iterateArray(arr1);

	    solve.findMax(arr1);

	    solve.findAvg(arr1);

	    solve.oddArray();

	    System.out.println(solve.greaterThan(arr1, 3));

	    solve.square(arr1);

	    int[] arr2 = {3, -5, 5, 2, -6, 4};
	    solve.eliminateNegative(arr2);

	    System.out.println(Arrays.toString(solve.maxMinAvg(arr1)));

	    solve.shiftArray(arr1);
	}

}