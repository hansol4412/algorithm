package algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Number43 {
	static int n;
	static int[] a;
	
	public static int count(int mid) {
		int cnt=1; 
		int sum=0;
		for(int i =0; i<n; i++) {
			if(sum+a[i]>mid) {
				cnt++;
				sum=a[i];
			}
			else {
				sum+=a[i];
			}
		}
		return cnt;
	}
	
	public static void main(String[] args) {
		// 43. 뮤직비디오 (이분검색 응용)
		/* 음반에 N개의 곡이 들어가는 데 순서가 그대로 유지된 채로 DVD에 녹화하려고 한다. 
		   제작상의 이유로 M개의 DVD를 사용해서 음반을 제작하려한다. 중간에 곡이 짤려서 2개에 DVD로 나눠서 녹음되면 안된다.
		  이때 한개의 DVD의 최소 크기 (최소 시간)을 출력하시오.		 */
		Scanner stdIn = new Scanner(System.in);    
		System.out.print("노래의 갯수를 입력하시오.:");
		n = stdIn.nextInt();
		System.out.print("사용하는 DVD의 갯수를 입력하시오.:");
		int m = stdIn.nextInt();
		a = new int[n];
		int sum=0;
		int max=0;
		for(int i=0; i<n; i++) {
			System.out.print("a["+i+"]:");
			a[i] = stdIn.nextInt();
			sum+=a[i];
			if(max<a[i])max=a[i];
		}
		
		int left=1;
		int right = sum;
		int result=0;
		while(left<=right) {
			int mid = (left+right)/2;
			if(count(mid)<=m && mid>=max) {
				result=mid;
				right= mid-1;
			}
			else {
				left=mid+1;
			}
		}
		
		System.out.println(result);
		
	}

}
