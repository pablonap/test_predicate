package prj02.main;

// In this class I work as it is in the old way so for each condition I should implement a different method.
// The alternative would have been to create my own functional interface and implement each different condition with an anonymous class.
public class Test2 {
	public static void main(String[] args) {

		int[] numbers = { 0, 5, 10, 15, 20, 25, 30 };

		System.out.println("The Numbers Greater Than 10:");
		showResultGreaterThanTen(numbers);

		System.out.println("The Even Numbers Are:");
		showResultEvenNumber(numbers);

		System.out.println("The Numbers Not Greater Than 10:");
		showResultNotGreaterThanTen(numbers);

		System.out.println("The Numbers Greater Than 10 And Even Are:");
		// ....

		System.out.println("The Numbers Greater Than 10 OR Even:");
		// ....
	}

//	Equivalent to: showResult() method with the different that I should make one implementation for every different condition.
	public static void showResultGreaterThanTen(int[] numbers) {
		for (int n : numbers) {
			if (isGreaterThanTen(n))
				System.out.println(n);
		}
	}

//	Equivalent to: showResult() method with the different that I should make one implementation for every different condition.
	public static void showResultEvenNumber(int[] numbers) {
		for (int n : numbers) {
			if (isEven(n))
				System.out.println(n);
		}
	}

//	Equivalent to: showResult() method with the different that I should make one implementation for every different condition.
	public static void showResultNotGreaterThanTen(int[] numbers) {
		for (int n : numbers) {
			if (isGreaterThanTen(n) == false)
				System.out.println(n);
		}
	}
	
//	Equivalent to: Predicate<Integer> p1 = i -> i > 10;
	private static boolean isGreaterThanTen(Integer n) {

		return n > 10;
	}

//	Equivalent to: Predicate<Integer> p2 = i -> i % 2 == 0;
	private static boolean isEven(Integer n) {
		return n % 2 == 0;
	}

}