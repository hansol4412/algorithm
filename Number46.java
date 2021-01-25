package algorithm;
import java.util.Scanner;
public class Number46 {

	public static void main(String[] args) {
		// 46. 멀티 태스킹
		/* 멀티태스킹이 가능한 컴퓨터는 1번 작업부터 순서대로 1초씩 작업한다.
		 * 작업 갯수 N개와 그에 따른 작업 시간을 입력한 후 M초 후 정전이 왔다. 복구 후 어떤 작업을 해야하는 지 출력하시오.
		     더 이상 작업해야 할 작업이 없으면 -1을 출력하시오. */
		Scanner stdIn = new Scanner(System.in);    
		System.out.print("작업의 갯수를 입력하세요:");
		int n = stdIn.nextInt();
		int[] a = new int[n+1];
		int sum=0;
		for(int i=1; i<=n; i++) {
			System.out.print("a["+i+"]:");
			a[i] = stdIn.nextInt();
			sum+=a[i];
		}
		System.out.print("몇 초 후에 정전이 일어나는가?:");
		int m = stdIn.nextInt();
		int cnt=0;
		if(m>=sum) {
			System.out.println("-1");
		}
		
		//정전 나기 전 작업
		int p=0;
		while(true) {
			p++;
			if(p>n) p=1;
			if(a[p]==0) continue;
			a[p]--;
			
			cnt++;
			if(cnt==m) break;
		}
		
		//정전 난 후 작업 찾기
		while(true) {
			p++;
			if(p>n)p=1;
			if(a[p]!=0) {
				System.out.println(p);
				break;
			}
		}
		
		
		
		
	}

}
	