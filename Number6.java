package algorithm;
import java.util.Scanner;
public class Number6 {

	public static void main(String[] args) {
		// 6. 숫자만 추출
		/* 문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수를 만듭니다
		   만들어진 자연수와 그 자연수의 약수의 갯수를 출력하시오 */
		
		Scanner stdIn = new Scanner(System.in);
		char[] a = new char[10];
		int res = 0;
		int cnt = 0;
		System.out.print("문자와 숫자가 섞인 10개의 문자를 입력하세요:");
		for(int i = 0; i<a.length; i++) {
			a[i] = stdIn.next().charAt(0);
		}
		for(int j = 0; j <a.length; j++ ) {
			if(a[j]>=48 && a[j]<=57) {
				res = res*10+ (a[j]-48);
			}
		}
		System.out.println("추출한 자연수는 "+res+"입니다");
		for(int c=1; c<=res;c++) {
			if(res%c==0) cnt++;
		}
		System.out.println("추출한 자연수의 약수의 갯수는 "+ cnt +"입니다.");
		

	}

}
