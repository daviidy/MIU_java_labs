import java.util.function.*;

public class _Function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int increment = func.andThen(func2).apply(1);
		int multiply = biFunc.apply(2, 3);
		
		cons.accept(10);
		bicons.accept(2, 3);
		System.out.println(pred.test("sfdndkjg"));
		System.out.println(getUrl.get());
	}
	
	static Function<Integer, Integer> func = num -> num + 1;
	
	static Function<Integer, Integer> func2 = num -> num * 10;
	
	static BiFunction<Integer, Integer, Integer> biFunc = (num1, num2) -> (num1 + 1) * num2;
	
	static Consumer<Integer> cons = input -> System.out.println(input * 10);
	
	static BiConsumer<Integer, Integer> bicons = (input1, input2) -> System.out.println(input1 * input2);
	
	static Predicate<String> pred = input -> input.length() == 10;
	
	static Supplier<String> getUrl = () -> "url of dave";
	
	static int increment(int number) {
		return number + 1;
	}
}
