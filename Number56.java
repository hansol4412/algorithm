package algorithm;
import java.util.Scanner;

public class Number56 {
	
	public static void DFS(int n){
		if(n<=1) {
			System.out.print("1 ");
		}
		else {
			System.out.print(n+" ");
			DFS(n-1);
		}
	}
	
	public static void main(String[] args) {
		// 56. 재귀함수 분석
		// 자연수 N이 주어지면 재귀함수를 사용하여 1부터 N까지 출력하는 프로그램을 작성하시오.
		Scanner stdIn = new Scanner(System.in);
		System.out.print("n의 값의 입력하시오.:");
		int n = stdIn.nextInt();
		DFS(n);
	}

}
