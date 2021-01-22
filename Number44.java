package algorithm;
import java.util.Scanner;
import java.util.Arrays;
public class Number44 {
	static int n;
	public static int count(int mid, int[] a) {
		int pos = a[0];
		int cnt = 1;
		for(int i=1; i<n; i++) {
			if(a[i]-pos>=mid) {
				cnt++;
				pos=a[i];
			}
		}
		return cnt;
	}
	public static void main(String[] args) {
		// 44. 마구간 정하기 (이분검색 응용)
		/* N개의 마구간과 M마리의 말이 있습니다. 마구간 마다 한마리의 말을 넣어 배치했을 때 가장 가까운 두 말의 거리가
		   최대가 되는 값을 출력하시오*/
		int result=0;
		Scanner stdIn = new Scanner(System.in);    
		System.out.print("마구간의 갯수를 입력하시오.:");
		n = stdIn.nextInt();
		System.out.print("말의 갯수를 입력하시오.:");
		int m = stdIn.nextInt();
		int[] a = new int[n];
		for(int i=0; i<n; i++) {
			System.out.print("a["+i+"]:");
			a[i] = stdIn.nextInt();
		}
		Arrays.sort(a);
		
		int left=0;
		int right=a[n-1];
		while(left<=right) {
			int mid=(left+right)/2;
			if(count(mid, a)>=m) {
				result=mid;
				left=mid+1;
			}
			else {
				right=mid-1;
			}
		}
		
		System.out.println(result);
	}

}
