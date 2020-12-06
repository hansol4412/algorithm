package algorithm;
import java.util.Scanner;

public class Number3 {

	public static void main(String[] args) {
		// 진약수의 합
		// 자연수 N이 주어지면 자연수 N의 진약수의 합을 수식과 함께 출력하는 프로그램을 작성하세요.
		Scanner stdIn = new Scanner(System.in);
		System.out.print("자연수 n을 입력하세요:");
		int n = stdIn.nextInt();
		System.out.print("1");
		int sum =1;
		for(int i = 2; i<n; i++) {
			if(n%i==0) {
				sum+=i;
				System.out.print(" + "+i);
			}
		}
		System.out.print(" = "+sum);

	}

}
