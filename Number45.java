package algorithm;
import java.util.Scanner;
public class Number45 {

	public static void main(String[] args) {
		// 45. 공주 구하기
		/* N명의 왕자가 시계 방향으로 동그랗게 앉고 1번 왕자부터 1부터 시작하먀 번호를 외친다.
		     한 왕자가 특정 숫자 M을 외치면 그 왕자는 공주를 구하러 가는데서 제외된다. 마지막까지 살아 남은 왕자의 번호를 출력하라 */
		Scanner stdIn = new Scanner(System.in);    
		System.out.print("왕자 수를 입력하시오:");
		 int n = stdIn.nextInt();
		System.out.print("특정 수를 입력하시오.:");
		int m = stdIn.nextInt();
		int[] a = new int[n+1];
		
		int point = 1;
		int cnt =0;
		int last =0;
		
		while(true) {
			
			if(a[point]==0) {
				cnt++;
				if(cnt==m) {
					a[point]=1;
					cnt=0;
					last++;
				}
			}
			point++;
			
			if(point>n) {
				point = 1;
			}
			if(last>=n-1) {
				break;
			}
		}
		
		
		
		for(int i=1; i<=n; i++) {
			if(a[i]==0) {
				System.out.println(i);
			}
		}
	}

}
