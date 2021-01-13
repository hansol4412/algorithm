package algorithm;
import java.util.Scanner;
public class Number39 {

	public static void main(String[] args) {
		// 39. 배열합치기
		// 오름차순으로 정렬이 된 두 배열이 주어지면 두 배열을 오름차순으로 합쳐 출려하는 프로그램을 작성하세요.
	
		Scanner stdIn = new Scanner(System.in);    
		System.out.print("첫번째 배열의 크기를 입력하세요.:");
		int n = stdIn.nextInt();
		int[] a = new int[n];
		for(int i=0; i<n; i++) {
			System.out.print("a["+i+"]:");
			a[i] = stdIn.nextInt();
		}
		System.out.print("두번째 배열의 크기를 입력하세요.:");
		int m = stdIn.nextInt();
		int[] b = new int[m];
		for(int i=0; i<m; i++) {
			System.out.print("b["+i+"]:");
			b[i] = stdIn.nextInt();
		}
		
		int[] c = new int[n+m];
		int p1=0, p2=0, p3=0;
		
		
		while(p1<=n-1 && p2 <=m-1) {
			if(a[p1]<b[p2]) {
				c[p3++] = a[p1];
				p1++;
			}
			else {
				c[p3++] =b[p2];
				p2++;
			}
		}
		
		while(p1<=n-1) c[p3++] =a[p1++];
		while(p2<=m-1) c[p3++] =b[p2++];
		
		for(int i=0; i<n+m; i++) {
			System.out.print(c[i]+" ");
		}
	}

}
