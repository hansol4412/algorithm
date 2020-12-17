package algorithm;
import java.util.Scanner;
public class Number14 {
	public static int reverse(int x) {
		int a;
		int t=0;
		while(x>0) {
			a=x%10;
			t=t*10+a;
			x=x/10;
		}
		return t;
	}
	
	public static boolean isPrime(int x) {
		if(x==1) return false;
		boolean flag= true;
				for(int j =2; j<x; j++) {
					if(x%j==0) {
						flag= false;
						break;
					}
				}
				return flag;
	}
	public static void main(String[] args) {
		// 14. 뒤집은 소수
		// N개의 자연수가 입력되면 각 자연수를 뒤집은 수가 소수이면 그 수를 출력하는 프로그램을 작성하시오.
		// 뒤집은 메소드인 int reverse(int x)와 소수를 확인하는 메소드 boolean isPrime(int x)를 작성하시오.
		
		Scanner stdIn = new Scanner(System.in);
		System.out.print("입력할 수의 갯수를 입력하세요:");
		int n = stdIn.nextInt();
		int a[] = new int[n];
		for(int i=0; i<n; i++) {
			a[i]= stdIn.nextInt();
		}
		int b[] = new int[n];
		for(int j=0; j<n; j++) {
			b[j] = reverse(a[j]);
			if(isPrime(b[j])) {
				System.out.println(b[j]);
			}
		}
		
	}

}
