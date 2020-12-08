package algorithm;
import java.util.Scanner;

public class Number5 {

	public static void main(String[] args) {
		// 5. 나이계산
		// 주민등록증의 번호가 주어지면 주민등록증의 주인의 나이와 성별을 판단해 출력하는 프로그램을 작성하시오.
		Scanner stdIn = new Scanner(System.in);
		int[] num = new int[13];
		int age;
		int year;
		System.out.print("주민등록번호를 입력하세요:");
		for(int i = 0; i< num.length; i++) {
			num[i] = stdIn.nextInt();			
		}
		
		//나이
		if( num[6]==1 || num[6]==2 ) {
			age = 1900 + num[0]*10 + num[1];
		}
		else {
			age = 2000 + num[0]*10 + num[1];
		}
		year = 2020 - age +1;
		System.out.println("당신의 나이는 "+year+"입니다.");
		
		//성별
		if( num[6]==2 || num[6]==4 ) System.out.println("당신은 여자입니다");
		else System.out.println("당신은 남자입니다");
	
	}

}
