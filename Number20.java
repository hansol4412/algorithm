package algorithm;
import java.util.Scanner;
public class Number20 {

	public static void main(String[] args) {
		// 20. 가위 바위 보
		// 총 n번의 가위 바위 보 게임을 하여 A가 이기면 A를 출력하고 B가 이기면 B를 출력하고 비기면 D를 출력한다
		// 1:가위  2:바위   3:보
		Scanner stdIn = new Scanner(System.in);
		System.out.print("몇 번의 게임을 실행할 것인가?:");
		int n = stdIn.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		int cna=0;
		int cnb=0;
		for (int i =0; i<n; i++) {
			System.out.print("a["+i+"]:");
			a[i]= stdIn.nextInt();
			System.out.print("b["+i+"]:");
			b[i]= stdIn.nextInt();
			
			if(a[i]==b[i]) System.out.println("D");
			else if(a[i]==2 && b[i]==1) {System.out.println("A"); cna++;}
			else if(a[i]==3 && b[i]==2) {System.out.println("A"); cna++;}
			else if(a[i]==1 && b[i]==3) {System.out.println("A"); cna++;}
			else { System.out.println("B"); cnb++;}
		}
		if(cna>cnb)System.out.println("최종 승자는 A입니다.");
		else if(cna<cnb)System.out.println("최종 승자는 B입니다.");
		else System.out.println("둘은 비겼습니다.");
	}

}
