package algorithm;
import java.util.Scanner;
public class Number17 {

	public static void main(String[] args) {
		// 17. 선생님 퀴즈
		/* 학생이 n명 있습니다. 선생님은 각 학생들에게 숫자가 적힌 카드를 주고, 학생들은 1부터 자기 카드까지 합을 구합니다.
		 학생들이 입력한 합이 맞으면 YES 틀리면 NO를 출력하시오 */
		Scanner stdIn = new Scanner(System.in);
		System.out.print("학생의 수를 입력하시오:");
		int n = stdIn.nextInt();
		for(int i = 1; i<=n; i++) {
			System.out.print("선생님이 준 숫자를 입력하오:");
			int teacher = stdIn.nextInt();
			int sum=0;
			for(int j=1; j<=teacher; j++) {
				sum = sum+j;
			}
			System.out.print("학생이 구한 답을 입력하시오:");
			int student = stdIn.nextInt();
			
			if(sum==student)System.out.println("YES");
			else System.out.println("No");
			
		}

	}

}
