package algorithm;
import java.util.Scanner;
public class Number24 {

	public static void main(String[] args) {
		// 24. Jolly Jumpers
		// N개의 정수로 이루어진 수열에 대해 서로 인접하는 수의 차가 1에서 N-1까지  값을 모두 가지면 YES, 아니면 NO
		Scanner stdIn = new Scanner(System.in);
		System.out.print("몇 개의 숫자를 입력할 것인가:");
		int n = stdIn.nextInt();
		int[] a = new int[n];
		for(int i =0; i<n; i++) {
			System.out.print("a["+i+"]:");
			a[i]= stdIn.nextInt();
		}
		int[] b = new int[n]; 
		/* 만약 n이 5라면 b[1]부터 b[4]까지 필요, int[] b = new int[n-1]이면  int[] b = new int[4]이고
		  b[3]까지 생성되지 않아 오류발생 */
		int minus;
		int yn =1;
		for(int j=0; j<n-1; j++) {
			minus=Math.abs(a[j]-a[j+1]);	
			System.out.println(minus);
			if(minus>0 && minus<n && b[minus]==0) b[minus]=1;
			else {
				yn = 0;
				break;
			}
		}
		
		if(yn==1) System.out.println("YES");
		else System.out.println("NO");
		

	}

}
