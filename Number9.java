package algorithm;
import java.util.Scanner;
public class Number9 {

	public static void main(String[] args) {
		//9. 모두의 약수
		// 자연수 N이 입력되면 1부터 N까지의 각 숫자열의 약수의 갯수를 출력하는 프로그램을 출력하세요.
		Scanner stdIn = new Scanner(System.in);
		System.out.print("수를 입력하시오:");
		int n = stdIn.nextInt();
		int[] a = new int[100];
		for(int i =1; i<=n; i++) {
			for(int j=1; j<=n;j++) {
				if(i%j==0) a[i]++;
			}
		}
		
		for(int t = 1; t<=n; t++) {
			System.out.println(t+"의 약수의 갯수 " +a[t]);
		}

	}

}
