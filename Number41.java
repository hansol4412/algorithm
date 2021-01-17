package algorithm;
import java.util.Scanner;
public class Number41 {
	public static void main(String[] args) {
		// 41. 연속된 자연수의 합
		// 양의 정수가 입력되면 2개 이상의 연속된 자연수의 합으로 정수 N을 표현하는 방법의 가짓수를 출력하는 프로그램을 작성합니다.
		Scanner stdIn = new Scanner(System.in);
		System.out.print("양의 정수를 입력하세요:");
		int n = stdIn.nextInt();
		int temp = n;
		int cnt=0;
		int b=2;
		
		while(n>0) {
		int sum=0;
		for(int i=1; i<=b; i++) {
			sum+=i;
		}
		if((n-sum)%b ==0){
			int x = (n-sum)/b;
			for(int i=1; i<b; i++) {
				System.out.print(x+i + " + ");
			}
			System.out.println( x+b +" = " + temp);
			cnt++;
		}
		b++;
		
		if((n-sum)/b<=0) break;
		}
		
		System.out.println(cnt+"개");
	}
}
