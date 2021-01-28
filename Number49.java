package algorithm;
import java.util.Scanner;
public class Number49 {

	public static void main(String[] args) {
		// 49. 블록의 최댓값
		// 블록을 정면에서 본 단면과 오른쪽 측면에서 본 단면을 주고 최대 블록갯수을 출력하는 프로그램을 작성하시오.
		
		Scanner stdIn = new Scanner(System.in);    
		System.out.print("N*N의 지역에서 N의 값을 입력하세요.");
		int n = stdIn.nextInt();
		int[][] a = new int[2][n];
		int[][] b = new int[n][n];
		System.out.println("정면의 블록");
		for(int i =0; i<n; i++) {
			a[0][i]=stdIn.nextInt();
		}
		System.out.println("오른쪽 측면의 블록");
		for(int i =0; i<n; i++) {
			a[1][i]=stdIn.nextInt();
		}
		
		for(int i =0; i<n; i++) {
			int temp = a[0][i];
			for(int j=0; j<n; j++) {
				b[j][i] = temp;
			}
		}
		
		
		
		for(int i=0; i<n; i++) {
			int temp2 = a[1][i];
			for(int j=0; j<n; j++) {
				if(temp2<b[n-i-1][j]) {
					b[n-i-1][j]=temp2;
				}
			}
			
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(b[i][j]);
			}
			System.out.println();
		}
		
		int sum=0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				sum+=b[i][j];
			}
		}
		System.out.println("블록의 최대 갯수는? " + sum);
	}

}
