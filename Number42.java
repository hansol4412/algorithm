package algorithm;
import java.util.Scanner;
import java.util.Arrays;
public class Number42 {

	public static void main(String[] args) {
		// 42. 이분검색
		/* 임의의 N개의 숫자가 압력으로 주어지고, N개의 수를 오름차순으로 정렬한 다음 N개의 수 중
		   한 개의 수인 key가 주어지면 이분검색으로 key가 정렬된 상태에서 몇번째 있는지 구하는 프로그램을 작성하시오 */
		Scanner stdIn = new Scanner(System.in);    
		System.out.print("배열의 크기를 입력하세요.:");
		int n = stdIn.nextInt();
		System.out.print("찾으려는 key를 입력하세요.:");
		int key = stdIn.nextInt();
		int[] a = new int[n];
		for(int i=0; i<n; i++) {
			System.out.print("a["+i+"]:");
			a[i] = stdIn.nextInt();
		}
		Arrays.sort(a);
		
		int left =0;
		int right =n-1;
		while(left<=right) {
		int mid = (left+right)/2;
		if(a[mid]==key) {
			System.out.println("찾는 값은 a[" + mid +"]에 있습니다.");
			break;
		}
		else if(a[mid]<key) left=mid+1;
		else right= mid-1;
		}
	}

}
