package prj02.main;

import java.util.function.Predicate;

public class Test {
	public static void main(String[] args) {

		int[] numbers = { 0, 5, 10, 15, 20, 25, 30 };

		Predicate<Integer> p1 = i -> i > 10;

		Predicate<Integer> p2 = i -> i % 2 == 0;

		System.out.println("The Numbers Greater Than 10:");
		showResult(p1, numbers);

		System.out.println("The Even Numbers Are:");
		showResult(p2, numbers);

		System.out.println("The Numbers Not Greater Than 10:");
		showResult(p1.negate(), numbers);

		System.out.println("The Numbers Greater Than 10 And Even Are:");
		showResult(p1.and(p2), numbers);

		System.out.println("The Numbers Greater Than 10 OR Even:");
		showResult(p1.or(p2), numbers);
	}

	// In this case I use Predicate cause the idea is this method works with different conditions so that its behavior is dynamic.
	public static void showResult(Predicate<Integer> p, int[] numbers) {
		for (int n : numbers) {
			if (p.test(n))
				System.out.println(n);
		}
	}
	
//	Conclusion:
//	Whenever the case that based on something (like a list of numbers as in this case) I should return something given a condition then it's better to use Predicate as one of the parameters.
//	See why in Test2 class.

}