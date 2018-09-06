package tech.bts.precourse;

public class ExercisesUtil {

	/**
	 * Checks that the two values are equal and throws an error if not
	 */
	public static void assertEquals(Object actual, Object expected) {

		if (!actual.equals(expected)) {
			throw new RuntimeException(
					"Values are not equal!" + "\n"
							+ "Actual: " + actual + "\n"
							+ "Expected: " + expected + "\n"
			);
		}
	}
}
