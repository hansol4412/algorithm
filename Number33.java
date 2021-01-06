package algorithm;
import java.util.Scanner;
public class Number33 {

	public static void main(String[] args) {
		// 33.3등의 성적은
		// N명의 수학겅적이 주어지면 그 중 3등의 수학성적을 출력하는 프로그램을 작성하세요.
		// 만약 100점이 3명, 99점이 2명, 98점이 5명이면 1등은 3명, 2등은 2명 3등은 3명으로 정해진다. 
		Scanner stdIn = new Scanner(System.in);
		System.out.print("학생의 수를 입력하세요:");
		int n = stdIn.nextInt();
		int[] a = new int[n];
		for(int i=0; i<n; i++) {
			a[i] = stdIn.nextInt();
		}
		for(int i =0; i<n; i++) {
			int idx =i;
			for(int j=i+1; j<n; j++) {
				if(a[idx]<a[j]) idx=j;
		}
			int temp = a[i];
			a[i] = a[idx];
			a[idx]= temp;
		}
		int cnt =1;
		for(int i=1; i<n; i++) {
			if(a[i-1]!=a[i]) cnt++;
			if(cnt==3) {
				System.out.println("3등의 성적은 " +a[i]+"입니다");
				break;
			}
			
		}
	}

}
