package algorithm;
import java.util.Scanner;

public class Number1 {

	public static void main(String[] args) {
		// 1. 1부터 N까지 M의 배수 합
		// 자연수 N이 입력되면 M의 배수합을 출력하는 프로그램을 작성하시오.
		
		Scanner stdIn = new Scanner(System.in);
		System.out.print("N의 수를 입력하시오:");
		int n = stdIn.nextInt();
		System.out.print("M의 수를 입력하시오:");
		int m = stdIn.nextInt();
		int sum = 0;
		for(int i = 1; i<=n; i++) {
			if(i%m == 0 ) {
				sum+= i;
			}
			
		}
		System.out.println(sum);
		

	}

}
