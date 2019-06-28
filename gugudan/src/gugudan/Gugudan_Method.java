package gugudan;
public class Gugudan_Method {
	public static int[] calculate(int times) {
		int[] result = new int[9];
		for(int i=0; i < result.length; i++) {
			result[i] = times * (i + 1);
		}
		return result;
	}
	
	public static void print(int[] result) {
		for(int i=0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
	
	public static void main(String[] args) {
		for(int i = 2; i < 10; i++) {
			int[] result = calculate(i);
		 	print(result);
		}  
		
		//계산 결과를 배열에 저장
		int[] result = calculate(2);			
		//계산 결과를 화면에 출력
		print(result);
		//3단 구현
		result = calculate(3);
		print(result);
		//4단 구현_변수를 다르
		int[] result2 = calculate(4);
		print(result2);
		
		//일반적인 반복
		int[] result3 = new int[9];
		for(int i=0; i < result3.length; i++) {
			//계산 결과를 배열에 저장
			result3[i] = 5 * (i + 1);
		}
			//계산 결과를 화면에 출력
		for(int i=0; i < result3.length; i++) {
			System.out.println(result3[i]);
		}
		}
	}
	

