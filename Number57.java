package algorithm;
import java.util.Scanner;
public class Number57 {
	public static void DFS(int n) {
		if(n<=1) {
			System.out.print(n);
		}
		else {
			DFS(n/2);
			System.out.print(n%2);
			
		}
	}
	public static void main(String[] args) {
		// 57. 재귀함수  이진수 출력
		// 10진수 N이 입력되면 재귀함수를 사용하여 2진수로 변환해 출력하는 프로그램을 작성하시오.
		Scanner stdIn = new Scanner(System.in);
		System.out.print("10진수의 값의 입력하시오.:");
		int n = stdIn.nextInt();
		DFS(n);
	}

}
