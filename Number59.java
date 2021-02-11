package algorithm;
import java.util.Scanner;
public class Number59 {
	public static void DFS(int x, int[] a, int n) {
		if(x>n) {
			for(int i =1; i<=n; i++) {
				if(a[i]==1) System.out.print(i+ " ");
			}
			System.out.println();
		}
		else {
			a[x]=1;
			DFS(x+1, a, n);
			a[x]=0;
			DFS(x+1, a, n);
		}
	}
	public static void main(String[] args) {
		// 59. 부분집합 (DFS)
		// 자연수 n이 주어지면 1부터 n까지의 원소를 갖는 집합의 부분집합을 모두 출력하는 프로그램을 작성하시오.
		// 재귀에 이용한 완전탐색을 하며, 이진트리 전위 순회 방식으로 출력한다. 
		System.out.print("n을 입력하세요:");
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int[] a= new int [100];
		DFS(1, a, n);
	}

}
