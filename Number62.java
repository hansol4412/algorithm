package algorithm;
import java.util.Scanner;
public class Number62 {
	static int[] a;
	static int[] temp;
	public static void sort(int left, int right) {
		int mid;
		int p1, p2, p3;
		if(left<right) {
			mid = ( left + right )/2;
			sort(left, mid);
			sort(mid+1, right);
			p1=left;
			p2=mid+1;
			p3=left;
			
			while(p1<=mid && p2<=right) {
				if(a[p1]<=a[p2]) {
					temp[p3++] = a[p1++];
				}
				else {
					temp[p3++] = a[p2++];
				}
			}
			while(p1<=mid) {
				temp[p3++] = a[p1++];
			}
			while(p2<=right) {
				temp[p3++] = a[p2++];
			}
			for(int i=left; i<=right; i++) {
				a[i]=temp[i];
			}
			
		}
		
	}
	public static void main(String[] args) {
		// 62. 병합 정렬
		// N개의 숫자가 입력되면 오름차순으로 병합 정렬하여 출력하는 프로그램을 작성하시오.
		Scanner stdIn = new Scanner(System.in);
		System.out.print("정렬할 원소의 갯수를 입력하세요:");
		 int n = stdIn.nextInt();
		a = new int[n];
		temp = new int[n];
		for(int i =0; i<n; i++) {
			a[i] = stdIn.nextInt();
		}
		sort(0,n-1);
		for(int i =0; i<n; i++) {
			System.out.print(a[i]+" ");
		}

	}

}
