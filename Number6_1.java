package algorithm;
import java.util.Scanner;
public class Number6_1 {

	public static void main(String[] args) {
		// 6. 숫자만 추출
		/* 문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수를 만듭니다
			만들어진 자연수와 그 자연수의 약수의 갯수를 출력하시오 */
		Scanner stdIn = new Scanner(System.in);
		System.out.print("문자열을 입력하시오:");
		String str = stdIn.next();
		String intStr = "";
		for (int i = 0; i < str.length(); i++) {
		    char ch = str.charAt(i);
		    if (48 <= ch && ch <= 57) {
		        intStr += ch;
		    }
		}
		int res = Integer.parseInt(intStr);
		int cnt = 0;
		System.out.println("추출한 자연수는 "+res+"입니다");
		for(int c=1; c<=res;c++) {
			if(res%c==0) cnt++;
		}
		System.out.println("추출한 자연수의 약수의 갯수는 "+ cnt +"입니다.");	
	}

}
