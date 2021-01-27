package algorithm;
import java.util.Scanner;
public class Number48 {

	public static void main(String[] args) {
		// 48. 각 행의 평균과 가장 가까운 값
		/* 9X9 격자판에 쓰여진 81개의 자연수가 주어질 쨰, 각 행의 평균을 구하고 그 평균과 가장 가까운 값을 출력하는 프로그램을 작성하세요.
		     평균은 소수점 첫 쩨 자리에서 반올림합니다. 가까운 값이 두 개 이면 그 중 큰 값을 출력하세요.
		 */
		Scanner stdIn = new Scanner(System.in);    
		int a[][] = new int [9][9];
		for(int i=0; i<9; i++) {
			int sum=0;
			for(int j=0; j<9; j++) {
				System.out.println("a["+i+"]["+j+"]:");
				a[i][j]= stdIn.nextInt();
				sum+=a[i][j];
			}
			int avg = (int)Math.round(sum/9.0);
			int min= 100;
			int store = -100;
			for(int j=0; j<9; j++) {
				if(Math.abs(avg-a[i][j])<min) {
					store = a[i][j];
					min = Math.abs(avg-a[i][j]);
				}
				else if(Math.abs(avg-a[i][j])==min) {
					if(a[i][j]>=store) store=a[i][j];
					min = Math.abs(avg-a[i][j]);
				}
			}
			System.out.println("평균: "+avg+" 평균과 가까운 값: "+store);
		}
		
		
	}

}
