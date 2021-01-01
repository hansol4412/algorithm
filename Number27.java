package algorithm;
import java.util.Scanner;
public class Number27 {

	public static void main(String[] args) {
		// 27. N!의 표현법
		// N!는 1부터 N까지의 곱을 의미한다. 예를 들어 N이 5이면 5*4*3*2*1=120이다.
		// 하지만 소수를 이용해 표현하는 방법도 있다   예를 들어 N이 5이면 2^3*3*5이다. N을 입력시 각 소수를 이용한 횟수를 출력하시오.
		Scanner stdIn = new Scanner(System.in);
		System.out.print("수를 입력하시오:");
		int n = stdIn.nextInt();
		int[] a = new int[n+1];
		for(int i =2; i<=n; i++) {
			int temp=i;
			int j =2;
			while(true) {
				if(temp%j==0) {
					a[j]++;
					temp=temp/j;
				}
				else j++;
				if(temp==1) break;
				
			}
		}
		
		System.out.println(n+"!은");
		for(int i=2; i<=n;i++) {
			if(a[i]!=0) {
				System.out.println(i+"는 "+a[i]+"개 사용했다.");
			} 
		}
		
		

	}

}
