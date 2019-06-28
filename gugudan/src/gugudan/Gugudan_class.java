package gugudan;

public class Gugudan_class {
	public static void main(String[] args) {
		for(int i = 2; i < 10; i++) {
		int[] result = Gugudan_Method.calculate(i);
			           Gugudan_Method.print(result);	
		}
	}
}
