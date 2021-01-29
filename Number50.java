package algorithm;
import java.util.Scanner;
public class Number50 {

	public static void main(String[] args) {
		//50. 영지 선택
		/* 왕은 현수에게 땅을 하사하기로 했다. 전체 땅에는 오렌지 나무의 갯수가 적혀있는데 현수는 오렌지 나무를 좋아한다.
		 따라서 하사 받을 땅의 가로와 세로가 정해지면 오렌지 나무가 최대가 되는 땅을 선택하여 오렌지 나무의 갯수를 출력하라.*/
		Scanner stdIn = new Scanner(System.in);  
		System.out.print("전체 토지의 세로:");
		int tc = stdIn.nextInt();
		System.out.print("전체 토지의 가로:");
		int tr = stdIn.nextInt();
		int[][] a = new int[tc][tr];
		for(int i =0; i<tc; i++) {
			for(int j =0; j<tr; j++) {
				a[i][j]=stdIn.nextInt();
			}
		}
		
		System.out.print("하사 받을 토지의 세로:");
		int hc = stdIn.nextInt();
		System.out.print("하사 받을 토지의 가로:");
		int hr = stdIn.nextInt();
		
		int max=0;
		int sum;
		
		for(int i =0; i<=tc-hc; i++) {
			for(int j =0; j<=tr-hr; j++) {
				sum=0;
				for(int c =i; c<=i+hc-1; c++) {
					for(int r=j; r<=j+hr-1; r++) {
						sum+=a[c][r];
					}
					
				}
				if(sum>max) max=sum;
			}
		}
	
		System.out.println("하사 받을 땅의 오렌지 나무 갯수는? "+max);
		
		
	}

}
