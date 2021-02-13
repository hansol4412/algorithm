package algorithm;
import java.util.Scanner;
public class Number60 {
	static int n;
	static int total;
	static int flag=0;
	public static void DFS(int[] a, int L, int sum) {
		if(sum>total/2) return;
		if(flag==1) return;
		if(L>n) {
			if(sum==total-sum) flag=1;
		}
		else {
			DFS(a,L+1, sum+a[L]);
			DFS(a,L+1,sum);
		}
		
	}
	public static void main(String[] args) {
		//60. 합이 같은 부분집합 (DFS)
		/* N개의 원소로 구성된 자연수 집합이 주어지면, 이 집합을 두 개의 부분집합으로 나누었을 때
		 두 부분집합의 원소의 합이 서로 같은 경우가 존재하면 YES를 출력하고, 그렇지 않으면 NO을 출력하는 프로그램을 작성하시오.*/
		Scanner stdIn = new Scanner(System.in);
		System.out.print("원소의 수를 입력하시오:");
		n = stdIn.nextInt();
		total=0;
		int a[] = new int[n+1];
		for(int i =1; i<=n; i++) {
			System.out.print(i+"번째 원소를 입력하시오:");
			a[i]=stdIn.nextInt();
			total += a[i];
		}
		DFS(a,1,0);
		if(flag==1) System.out.println("YES");
		else System.out.println("NO");
	}

}
