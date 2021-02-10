package algorithm;
import java.util.Scanner;
public class Number58_2 {

	public static void DFS(int n, int x) {
		if(x>n) return;
		else {
			DFS(n,x*2);
			System.out.print(x);
			DFS(n,x*2+1);
		}
	}

	public static void main(String[] args) {
		// 58_2. 이진트리 깊이우선트리(DFS)
		// 중위순회 출력
		System.out.print("노드의 갯수를 입력하세요:");
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int x = n;
		DFS(n,1);
	}

}
