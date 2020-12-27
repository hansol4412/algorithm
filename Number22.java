package algorithm;
import java.util.Scanner;
public class Number22 {

	public static void main(String[] args) {
		// 22. 온도의 최대값
		// N일의 온도를 측정해서 연속적인 K일의 합을 구해 최대 합의 값을 출력하시오
		// n=10, k=2 : 10일의 온도를 측정해서 연속적인 2일의 합을 구해 합이 가장 큰 것을 출력하시오.
		Scanner stdIn = new Scanner(System.in);
		System.out.print("몇일 동안 온도를 측정할 것인가:");
		int n = stdIn.nextInt();
		System.out.print("몇칠 동안 온도의 합을 구할 것인가:");
		int k = stdIn.nextInt();
		int[] a = new int[n];
		for(int i =0; i<n; i++) {
			System.out.print(i+1+"일:");
			a[i]= stdIn.nextInt();
		}
		
		int max=-100;
		for(int i =0 ; i<=n-k; i++) {
			int sum=0;
			for(int j=i; j<i+k; j++) {
				sum+=a[j];
				
			}
			if(sum>max) max = sum;
		}
		System.out.println("온도의 최대 값은:"+max);
		

	}

}
