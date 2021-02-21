package algorithm;
import java.util.Scanner;
public class Number67 {
public static int n;
public static int min=100;
public static int DFS(int s, int sum, int[][] a, int[] ch) {
	if(s==n) {
		if(sum<min)min=sum;
	}
	else {
		for(int i =1; i<=n; i++) {
			if(a[s][i]>0 && ch[i]==0) {
				ch[i]=1;
				DFS(i,sum+a[s][i],a,ch);
				ch[i]=0;
			}
		}
	}
	return min;
}
	public static void main(String[] args) {
		// 67. 최소비용 (인접행렬)
		// 가중치 방향 그래프가 주어지면 1번 정점에서 N번 정점까지 가는 최소비용을 출력하는 프로그램을 작성하시오.
		Scanner stdIn = new Scanner(System.in);
		System.out.print("정점의 수를 입력하세요:");
		n = stdIn.nextInt();
		System.out.print("간선의 수를 입력하세요:");
		int v = stdIn.nextInt();
		int[][] a = new int[n+1][n+1];
		int i;
		int o;
		int x;
		for(int k =0; k<v; k++) {
			i = stdIn.nextInt();
			o = stdIn.nextInt();
			x = stdIn.nextInt();
			a[i][o]=x;
		}
		int[] ch = new int[20];
		ch[1]=1;
		System.out.println("1부터 "+n+"까지의 최소경로의 값은 "+DFS(1,0,a,ch)+"이다");
		
	}

}
