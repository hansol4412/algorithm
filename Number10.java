package algorithm;
import java.util.Scanner;
public class Number10 {
	public static int digit_sum(int n) {
		int sum=0;
		while(n>0) {
			int res = n%10;
			sum+=res;
			n = n/10;
		}
		return sum;
	}

	public static void main(String[] args) {
		// 10. 자릿수의 합
		/* N개의 자연수가 입력도면 각 자연수의 자릿수의 합을 구하고 그 합이 최데인 자연수를 출력하는 프로그램을 작성하시오.
		   자리수의 합이 최대인 자연수가 여러개인 경우 그 중 값이 가장 큰 값을 출력하시오.*/
		// int digit_sum(int x)의 메소드를 사용하여 프로그래밍하시오.
		
		Scanner stdIn = new Scanner(System.in);
		int max=0;
		int sum=0;
		int maxN=0;
		System.out.print("입력할 수의 갯수를 입력하시오:");
		int n = stdIn.nextInt();
		int[] a = new int[n];
		for(int i = 0; i<n; i++) {
			a[i] = stdIn.nextInt();
			sum =  digit_sum(a[i]);	
			
			if(max<sum) {
				max = sum;
				maxN = a[i];
			}
			else if(max==sum) {
				if(maxN < a[i]) maxN=a[i];
			}
		}
		System.out.println(maxN);
	}

}
