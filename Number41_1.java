package algorithm;
import java.util.Scanner;
public class Number41_1 {

	public static void main(String[] args) {
		// 41_1. 연속된 자연수의 합
		// 양의 정수가 입력되면 2개 이상의 연속된 자연수의 합으로 정수 N을 표현하는 방법의 가짓수를 출력하는 프로그램을 작성합니다.
			Scanner stdIn = new Scanner(System.in);
			System.out.print("양의 정수를 입력하세요:");
			int n = stdIn.nextInt();
			int temp = n;
			int cnt=0;
			int a=2;
			n--; 
				while(n>0) {
					n=n-a;
					if(n%a==0) {
						for(int i=1; i<a; i++) {
							System.out.print((n/a)+i +" + ");
						}
						System.out.println((n/a)+a + " = " +temp);
						cnt++;
					}
					a++;
				}

				System.out.println(cnt+"개");

	}

}
