package tech.bts.precourse.exercises;

import java.util.*;
import static tech.bts.precourse.ExercisesUtil.assertEquals;

/**
 * Loop exercises (while, for)
 */
public class LoopExercises {

	public static void main(String[] args) {

		// NOTE:
		// If you want to make it a bit more difficult,
		// solve each exercise with a function that returns a value or a list of values.
		// Also add tests for them. See the following function:
		performTests();



		// 1. Write a loop that prints the numbers from 1 to 5


		// 2. Write a loop that prints the numbers from `start` to `end`
		int start = 0;
		int end = 7;


		// 3. Write a loop that prints the even numbers from 1 to 10 (i.e. 2, 4, 6, 8, 10)


		// 4. Write a loop that prints the odd numbers from 1 to 10 (i.e. 1, 3, 5, 7, 9)


		// 5. Write a loop that calculates the sum of the numbers from 1 to 10 (i.e. 1 + 2 + 3 + 4 + ... + 10 )


		// 6. Write a loop that calculates the sum of the even numbers from 1 to 10 (i.e. 2 + 4 + ... + 10 )


		// 7. Using a loop, calculate the power of 2^20 (i.e 2 * 2 * 2 * ... * 2, 20 times)


		// 8. Calculate the factorial of 10 (ie. 1 * 2 * 3 * 4 * ... * 10)
		//    https://en.wikipedia.org/wiki/Factorial


		// 9. Loop from 1 to 100 and print only the numbers that are multiple of 5.
		//    You can use the `remainder` operator: if n % 5 == 0 it means that n is multiple of 5.
		//    More difficult: don't use the `remainder` operator.


		// 10. Calculate the 10th fibonacci number
		//     The first fibonacci number is 0
		//     The second fibonacci number is 1
		//     From the third fibonacci number, it is calculated by adding the previous 2 numbers.
		//     So the third is 0+1=1, the fourth is 1+1=2, the fifth is 1+2=3, the sixth is 2+3=5, and so on.
		//     https://en.wikipedia.org/wiki/Fibonacci_number
	}





	// ----- Advanced ----- //


	/**
	 * 2. Write a loop that prints the numbers from `start` to `end`
	 *
	 * Note:
	 * This exercise is already solved with a function.
	 * Instead of printing the numbers, we return a list of those numbers.
	 */
	private static List<Integer> numbersFromStartToEnd(int start, int end) {

		List<Integer> result = new ArrayList<>();

		for (int i = start; i <= end; i++) {
			result.add(i);
		}

		return result;
	}


	/** Performs the tests for the functions */
	private static void performTests() {

		assertEquals( numbersFromStartToEnd(1, 5), Arrays.asList(1, 2, 3, 4, 5) );
		assertEquals( numbersFromStartToEnd(-3, 2), Arrays.asList(-3, -2, -1, 0, 1, 2) );

		// TODO: add tests for your functions here
	}
}
