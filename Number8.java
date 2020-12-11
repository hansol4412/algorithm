package algorithm;
import java.util.Scanner;
public class Number8 {

	public static void main(String[] args) {
		// 8. 올바른 괄호
		// 괄호가 입력되면 올바른 괄호이면 'yes' 올바르지 않으면 'no'를 출력합니다.
		
		Scanner stdIn = new Scanner(System.in);
		System.out.print("문자열을 입력하시오:");
		String str = stdIn.nextLine();
		int correct=0;
		for (int i = 0; i < str.length(); i++) {
		    char ch = str.charAt(i);
		    if(ch=='(') correct++;
		    if(ch==')') correct--;
		}
		if(correct==0) System.out.println("YES");
		else System.out.println("NO");
		
	}
}
