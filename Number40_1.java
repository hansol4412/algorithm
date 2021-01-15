package algorithm;
import java.util.Scanner;
import java.util.Arrays;
public class Number40_1 {

	public static void main(String[] args) {
		// 40_1. 교집합 (투포인트 알고리즘)
		// 두 집합 A, B가 주어지면  두 집합의 교집합을 출력하는 프로그램을 작성하세요.
		// 교집합은 오름차순으로 정렬하시오.
		// 정렬 후 교집합 구하기
		Scanner stdIn = new Scanner(System.in);    
		System.out.print("첫번째 배열의 크기를 입력하세요.:");
		int n = stdIn.nextInt();
		int[] a = new int[n];
		for(int i=0; i<n; i++) {
			System.out.print("a["+i+"]:");
			a[i] = stdIn.nextInt();
		}
		Arrays.sort(a);
		
		
		System.out.print("두번째 배열의 크기를 입력하세요.:");
		int m = stdIn.nextInt();
		int[] b = new int[m];
		for(int i=0; i<m; i++) {
			System.out.print("b["+i+"]:");
			b[i] = stdIn.nextInt();
		}
		Arrays.sort(b);
		
		int[] c = new int[n-m>0?m:n];
		
		int p1=0, p2=0, p3=0;
		
		while(p1<n && p2<m) {
			if(a[p1]==b[p2]) {
				c[p3++] = a[p1++];
				p2++;
			}
			else if(a[p1]<b[p2]){
				p1++;
			}
			else {
				p2++;
			}
		}
		
		for(int i=0; i<p3; i++) {
			System.out.print(c[i]+" ");
		}
		
		
		

	}

}
