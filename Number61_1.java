package algorithm;
import java.util.Scanner;
public class Number61_1 {
	static int n;
	static int m;
	static int num=0;
	public static int DFS(int L, int total, int[] a, int[] ch) {
		if(L>n) {
			if(total==m) {
				for(int i=1; i<=n; i++) {
					if(ch[i]==1) {
						System.out.print("+"+a[i]+" " );
					}
					if(ch[i]==-1) {
						System.out.print("-"+a[i]+" ");
					}
				}
				num++;
				System.out.println(" = "+total);
			}
		}
		else {
			ch[L]=1;
			DFS(L+1, total+a[L], a, ch);
			ch[L]=0;
			DFS(L+1, total, a, ch);
			ch[L]=-1;
			DFS(L+1, total-a[L], a, ch);
		}
		
		if(num==0) return -1;
		else return num;
	}
	public static void main(String[] args) {
		// 61_1. 특정 수 만들기 (DFS)
		/*  N개의 원소로 구성된 자연수 집합이 주어지면 집합의 원소와 "+" ,"-" 연산을 사용하여 특성 수인 M을 만드는
			경우가 몇가지 있는지 출력하는 프로그램을 작성하세요.
		 	각 원소는 연산에 한번만 사용됩니다. */
		Scanner stdIn = new Scanner(System.in);
		System.out.print("원소의 갯수를 입력하세요:");
		n = stdIn.nextInt();
		System.out.print("만들고 싶은 수를 입력하세요:");
		m = stdIn.nextInt();
		int[] a = new int[n+1];
		int[] ch = new int[n+1];
		for(int i =1; i<=n; i++) {
			a[i] = stdIn.nextInt();
		}
		
		System.out.println("조합의 갯수는 "+DFS(1, 0, a, ch)+"개 입니다.");
		

	}

}
