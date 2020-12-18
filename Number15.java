package algorithm;
import java.util.Scanner;
public class Number15 {

	public static void main(String[] args) {
		// 15. 소수의 개수
		// 자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하시오.
		System.out.print("수를 입력하세요:");
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int cnt=0;
		int flag;
		
		for(int i=2; i<=n; i++) {
			 flag =1;
			 for(int j=2; j*j<=i; j++) {
			//for(int j =2; j<i; j++ ) {
				if(i%j==0) {
					flag=0;
					break;
				}
			}
			if(flag==1) cnt++;
		}
		
		System.out.println(cnt);
	}

}
