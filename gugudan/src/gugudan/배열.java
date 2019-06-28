package gugudan;
import java.util.Scanner;
public class 배열 {
public static void main(String[] args) {
				
	int[] result = new int[9];
	for(int i=0; i < result.length; i++) {
		//계산 결과를 배열에 저장
		result[i] = 2 * (i + 1);
	}
		//계산 결과를 화면에 출력
	for(int i=0; i < result.length; i++) {
		System.out.println(result[i]);
	}
	
	result = new int[9];
	for(int i=0; i < result.length; i++) {
		//계산 결과를 배열에 저장
		result[i] = 3 * (i + 1);
	}
		//계산 결과를 화면에 출력
	for(int i=0; i < result.length; i++) {
		System.out.println(result[i]);
	}
	
	
	//변수를 다르게 주었을 때
	
	int[] result2 = new int[9];
	for(int i=0; i < result2.length; i++) {
		//계산 결과를 배열에 저장
		result2[i] = 4 * (i + 1);
	}
		//계산 결과를 화면에 출력
	for(int i=0; i < result2.length; i++) {
		System.out.println(result2[i]);
	}
	

	
	}
}


	

