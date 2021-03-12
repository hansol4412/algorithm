package algorithm;
import java.util.Scanner;
public class Number76_3 {
	public static int C(int n, int r, int[][] dy) {
		if(dy[n][r]>0) return dy[n][r];
		if(n==r || r==0) return 1;
		else return dy[n][r] = C(n-1, r, dy) + C(n-1, r-1, dy);
	}

	public static void main(String[] args) {
		//76_3. 이항계수
		/*이항계수는 N계의 원소를 가지는 집합에서 R개의 원소를 뽑아 부분집합을 만드는 경우의 수
		공식은 nCr로 표현한다. */
		//메모리제이션
		Scanner stdIn = new Scanner(System.in);
		System.out.print("N을 입력하세요:");
		int n = stdIn.nextInt();
		System.out.print("R을 입력하세요:");
		int r = stdIn.nextInt();
		int[][] dy = new int[20][20];
		System.out.println(n+"C"+r+" = "+ C(n,r,dy));

	}

}
