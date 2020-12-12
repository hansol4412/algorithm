package algorithm;
import java.util.Scanner;
public class Number9_1 {

	public static void main(String[] args) {
		//9. 모두의 약수
		// 자연수 N이 입력되면 1부터 N까지의 각 숫자열의 약수의 갯수를 출력하는 프로그램을 출력하세요.
		Scanner stdIn = new Scanner(System.in);
		System.out.print("수를 입력하시오:");
		int n = stdIn.nextInt();
		int[] a = new int[100];
		for(int i =1; i<=n; i++) {
			//i의 배수로 돌기 ex)2의 배수이면 2,4,6,8...이 모두 약수의 갯수 하나씩 증가시킨다.
			for(int j=i; j<=n;j=j+i) {
				a[j]++;
			}
		}
		
		for(int t = 1; t<=n; t++) {
			System.out.println(t+"의 약수의 갯수 " +a[t]);
		}

	}

}
