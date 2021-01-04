package algorithm;
import java.util.Scanner;
public class Number28 {

	public static void main(String[] args) {
		//28. N!에서 0의 개수
		//자연수 N이 입력되면 N! 값에서 일의 자리부터 연속적으로 '0'이 몇 개 있는지 구하는 프로그램을 작성하시오.
		Scanner stdIn = new Scanner(System.in);
		System.out.print("수를 입력하시오:");
		int n = stdIn.nextInt();
		int cnt2=0;
		int cnt5=0;
		for(int i =2; i<=n; i++) {
			int temp =i; 
			int j = 2;
			while(true) {
				if(temp%j==0) {
					if(j==2) cnt2++;
					else if(j==5) cnt5++;
					temp=temp/j;
					}
				else j++;
				
				if(temp==1) break;
			}
			
		}
		
		if(cnt2>=cnt5)System.out.println(n+"!에서 연속되는 0의 갯수는 "+cnt5+"이다.");
		else System.out.println(n+"!에서 연속되는 0의 갯수는 "+cnt5+"이다.");
				
			
	}

}
