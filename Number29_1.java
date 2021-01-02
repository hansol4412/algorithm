package algorithm;
import java.util.Scanner;
public class Number29_1 {

	public static void main(String[] args) {
		//29-1.3`6`9게임
		// n에 숫자를 입력했을 때 3의 배수 이거나 숫자에 3이 들어가면 박수를 치는데, 박수를 총 몇번 치는가
		Scanner stdIn = new Scanner(System.in);
		System.out.print("수를 입력하시오:");
		int n = stdIn.nextInt();
		int cnt=0;
		
		for(int i=1; i<=n; i++) { 
			int tmp=i;
			while(tmp>0) {
				if(tmp%3==0 || tmp%10==3) cnt++;
				tmp=tmp/10;
			}
		}
		
		System.out.println(cnt);
	}

}
