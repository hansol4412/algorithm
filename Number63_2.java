package algorithm;
import java.util.Scanner;
public class Number63_2 {

	public static void main(String[] args) {
		// 63_2. 인접행렬  (가중치 그래프)
		Scanner stdIn = new Scanner(System.in);
		System.out.print("정점의 수를 입력하세요:");
		int n = stdIn.nextInt();
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
		
		for(int k=1; k<=n; k++) {
			for(int j=1; j<=n; j++) {
				System.out.print(a[k][j]+ "");
			}
			System.out.println();
			}
		

	}

	}


