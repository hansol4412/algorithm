package algorithm;
import java.util.Scanner;
public class Number25 {

	public static void main(String[] args) {
		//25. 석차 구하기
		// N명의 학생의 수학 점수가 입력되면 각 학생의 석차를 출력하는 프로그램을 작성하시오
		Scanner stdIn = new Scanner(System.in);
		System.out.print("몇 명의 점수를 입력할 것인가:");
		int n = stdIn.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		
		for(int i =0; i<n; i++) {
			System.out.print("a["+i+"]:");
			a[i]= stdIn.nextInt();
			b[i]=1;
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(a[i]<a[j]) b[i]++; 
			}
		}
		
		for(int i=0; i<n; i++) {
			System.out.println(a[i]+"점은  "+b[i]+"등");
		}
		
		
		
	}

}
