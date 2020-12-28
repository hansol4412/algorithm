package algorithm;
import java.util.Scanner;
public class Number23 {

	public static void main(String[] args) {
		// 23. 연속 부분 증가수열
		//n개의 숫자가 나열된 수열이 주어집니다. 이 수열 중 연속적으로 증가하는 부분 수열 최대 길이를 구해 출력하시오.
		// 값이 같을 때는 증가하는 것으로 생각한다.
		Scanner stdIn = new Scanner(System.in);
		System.out.print("몇 개의 숫자를 입력할 것인가:");
		int n = stdIn.nextInt();
		int[] a = new int[n];
		for(int i =0; i<n; i++) {
			System.out.print("a["+i+"]:");
			a[i]= stdIn.nextInt();
		}
		int cnt=0;
		int max=0;
		int cmax=0;
		for(int i =0; i<n; i++) {
			if(a[i]>=max) {
				max=a[i];
				cnt++;
				if(cmax<cnt) cmax=cnt;
				
			}
			else {
				max=a[i];
				cnt =1;
			}
		}
		
		System.out.println("증가 수열의 최대 길이는 "+cmax);
		
	}

}
