package algorithm;
import java.util.Scanner;
public class Number18 {

	public static void main(String[] args) {
		// 18. 층간소음
		/*아파트의 한 세대의 측정치가 m값을 넘으면 세대 호수와 작은 경보음이 관리실 모니터에 울린다
		 한 세대의 n초 동안의 실시간 측정치가 주어지면 최대 연속으로 경보음이 울린 시간을 구하이소.
		 경보음이 없으면 -1이 출력된다.
		 */
		Scanner stdIn = new Scanner(System.in);
		System.out.print("몇 초 동안 측성을 할 것인가(n초):");
		int n= stdIn.nextInt();
		int[] a = new int[n];
		System.out.print("경보음 측정치(m):");
		int m = stdIn.nextInt();
		int cnt=0;
		int max=0;
		for(int i = 0; i<n; i++) {
			a[i] = stdIn.nextInt();
			if(a[i]>m) {
				cnt++;
				if(cnt>max) {
					max=cnt;
				}
			}
			else {
				cnt =0;
			}
		}
		
		if(max>0)System.out.println(max);
		else System.out.println(-1);
		
		
		

	}

}
