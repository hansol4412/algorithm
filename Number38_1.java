package algorithm;
import java.util.Scanner;
public class Number38_1 {

	public static void main(String[] args) {
		// 38_1. Inversion Sequence
		/* 1부터 N까지 수를 한 번씩만 사용하여 이루어진 수열이 있을 때, 1부터 N까지 각각의 수 앞에 놓여 있는 수 중에서
		  자신보다 큰 수 들의 개수를 수열로 표햔하는 것을 inversion sequence라고 한다. */
		// 수열의 inversion sequence가 주어졌을 때, 원래의 수열을 출력하는 프로그램을 작성하세요.
		Scanner stdIn = new Scanner(System.in);    
		System.out.print("입력할 수의 갯수를 입력하세요:");
		int n = stdIn.nextInt();
		int[] a = new int[n+1];
		int[] b = new int[n+1];
		for(int i=1; i<=n; i++) {
			a[i] = stdIn.nextInt();
		}
		int pos;
		for(int i=n; i>=1; i--) {
			pos=i;
			for(int j=1; j<=a[i]; j++) {
				b[pos]=b[pos+1];
				pos++;
			}
			b[pos]=i;
		}
		
		for(int i=1; i<=n; i++) {
			System.out.print(b[i]+" ");
		}
		
		

	}

}
