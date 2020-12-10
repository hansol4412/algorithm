package algorithm;
import java.util.Scanner;
public class Number7 {

	public static void main(String[] args) {
		// 7. 영어단어 복구
		// 에러로 표시되는 영어단어를 원래의 표현대로 공백을 제거하고 소문자화 시켜 출력하는 프로그램을 작성하시오.
		Scanner stdIn = new Scanner(System.in);
		System.out.print("문자열을 입력하시오:");
		String str = stdIn.nextLine();
		String charStr = "";
		
		for (int i = 0; i < str.length(); i++) {
		    char ch = str.charAt(i);
		   if(ch!=32 && ch>=65 && ch <=90 ) {
			   int a = (ch+32);
			   charStr += (char)a;
		   }
		}
		System.out.println(charStr);
	}
}
