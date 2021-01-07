package algorithm;
import java.util.Scanner;
public class Number34 {

	public static void main(String[] args) {
		// 34. 버블정렬
		// N개의 숫자가 입력되면 오름차순으로 정렬하는 프로그램을 작성하시오.
		Scanner stdIn = new Scanner(System.in); 
		System.out.print("입력할 수의 갯수를 입력하세요:");
		int n = stdIn.nextInt();
		int[] a = new int[n];
		for(int i=0; i<n; i++) {
			a[i] = stdIn.nextInt();
		}
		
		for(int j=0; j<n-1; j++) {
			for(int i=0; i<n-j-1; i++) {
				if(a[i]>a[i+1]) {
					int temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
				}
			}
		}
		
		for(int i=0; i<n; i++) {
			System.out.print(a[i]+" ");
		}
	
			

	}

}
