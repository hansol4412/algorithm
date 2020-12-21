package algorithm;
import java.util.Scanner;
import java.util.Arrays;
public class Number16 {

	public static void main(String[] args) {
		// 16. Anagram (구글 인터뷰 문제)
		// 아나그램이란 두 문자열이 알파벳의 나열 순서는 다르지만 그 구성이 일치하면 두 단어는 아나그램이라고 한다
		// 아나그램 판별시 대소문자는 구별된다.
		Scanner stdIn = new Scanner(System.in);
		System.out.print("첫번째 문자열을 입력하세요:");
		String a = stdIn.nextLine();
		int[] ac = new int[52];
		System.out.print("두번째 문자열을 입력하세요:");
		String b = stdIn.nextLine();
		int[] bc = new int[52];
		for (int i = 0; i < a.length(); i++) {
			int num = (a.charAt(i)-'A');
		    if(num>=32) {
		    	num=num-6;
		    }
		    ac[num]++;
		}
		for (int i = 0; i < b.length(); i++) {
			int num = (b.charAt(i)-'A');
			if(num>=32) {
		    	num=num-6;
		    }
		    bc[num]++;
		}
		
		
			if(Arrays.equals(ac, bc)) System.out.println("YES");
			else System.out.println("NO");
	
	}

}
