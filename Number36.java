package algorithm;
import java.util.Scanner;
public class Number36 {

	public static void main(String[] args) {
		// 36. 삽입정렬
		// N개의 숫자가 입력되면 오름차순으로 정렬하는 프로그램을 작성하시오.
		Scanner stdIn = new Scanner(System.in); 
		System.out.print("입력할 수의 갯수를 입력하세요:");
		int n = stdIn.nextInt();
		int[] a = new int[n];
		for(int i=0; i<n; i++) {
			a[i] = stdIn.nextInt();
		}
		
		
		for(int i=1; i<n; i++) {
			int temp =a[i];
			int j; 
			for(j=i-1; j>=0; j--) {
				if(a[j]>temp) a[j+1]=a[j];
				else break;
			}
			a[j+1]= temp;
		}

		for(int i=0; i<n; i++) {
			System.out.print(a[i]+" ");
		}
	}
}
