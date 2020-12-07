package algorithm;
import java.util.Scanner;

public class Number4 {

	public static void main(String[] args) {
		// 4. 나이차이
		// n명의 나이가 있습니다. 이 n명의 사람 중 가장 나이 차이가 많이 나는 경우는 몇 살 일까요? 최대 나이 차이를 출력하는 프로그램을 작성하시오
		Scanner stdIn = new Scanner(System.in);
		int n;
		int max = 0;
		int min = 100;
		int age;
		System.out.print("사람 수를 입력하시오:");
		n = stdIn.nextInt();
		for(int i = 1; i<=n; i++) {
			System.out.print("나이를 입력하시오:");
			age = stdIn.nextInt();
			if(age>max) max= age;
			if(age<min) min = age;
		}
		System.out.println("나이 차이의 최대는 "+ (max-min) +"입니다");
		

	}

}
