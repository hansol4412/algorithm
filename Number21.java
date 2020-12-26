package algorithm;
import java.util.Scanner;
public class Number21 {

	public static void main(String[] args) {
		// 21. 카드게임
		/* 0부터 9까지 숫자가 적힌 카드를 가지고 게임을 한다. 두 사람이 카드를 한장 씩 냈을 때 큰 수를 가진 사람이 이긴다.
		  이겼을 때 3점을 주고 졌을 때는 점수를 부여하지 않는다. 비겼을 때는 1점을 부여한다
		 10번의 게임을 하고 두 사람의 총점 계산과 이긴  사람을 출력하시오.*/
		Scanner stdIn = new Scanner(System.in);
		int[] a = new int[10];
		int[] b = new int[10];
		System.out.println("게임을 시작합니다.");
		for(int i= 0; i<10; i++) {
			System.out.print("a["+i+"]:");
			a[i] = stdIn.nextInt();
			System.out.print("b["+i+"]:");
			b[i] = stdIn.nextInt();
		}
		int ant=0;
		int bnt=0;
		for(int j =0; j<10; j++) {
			if(a[j]==b[j]) {
				ant++;
				bnt++;
			}
			else if(a[j]>b[j]) ant += 3;
			else bnt += 3;
		}
		
		System.out.println("A의 총점: "+ant+"  B의 총점: "+bnt);
		if(ant==bnt) System.out.println("둘이 비겼습니다");
		else if(ant>bnt) System.out.println("A가 이겼습니다.");
		else System.out.println("B가 이겼습니다.");
		
	}

}
