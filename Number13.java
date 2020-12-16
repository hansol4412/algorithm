package algorithm;
import java.util.Scanner;
public class Number13 {

	public static void main(String[] args) {
		// 13. 가장 많이 사용된 자릿수
		// N자리의 자연수가 입력되면 자연수의 자릿수 중 가장 많이 사용된 숫자를 출력하는 프로그램을 작성하시오.
		// 답이 여러 개일 경우 그 중에서 가장 큰 수를 출력하시오. 
		
		Scanner stdIn = new Scanner(System.in);
		int[] a = new int[10];
		System.out.print("숫자를 입력하시오:");
		String str = stdIn.nextLine();
		
		
		for (int i = 0; i < str.length(); i++) {
			int num = (str.charAt(i)-'0');
		    a[num]++;
		}
		
		
		int max = 0;
		int numMax = 0;
		for(int j= 0; j<=9; j++ )
		{
			if(a[j]>max) {
				max=a[j];
				numMax=j;
			}
			else if(a[j]==max) {
				if(numMax<j) numMax=j;
			}
		}
		
		System.out.println("가장 많이 사용된 수는 "+numMax+"입니다.");
		
	}

}
