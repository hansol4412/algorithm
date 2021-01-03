package algorithm;
import java.util.Scanner;
public class Number31_1 {

	public static void main(String[] args) {
		// 31. 탄화수소 질량
		// 탄소(C)와 수소(H)로 이루어진 탄화수소에서 탄소는 한 개가 12g, 수소는 한 개가 1g이다. 탄화수소식에서 질량을 구하라
		// cf) C1H4의 식은 CH4라고 입력하고 계산한다.
		 Scanner stdIn = new Scanner(System.in);
		 int[] ch = new int[10];
		 int c = 0;
		 int h = 0; 
		 int position = 0;
		 System.out.print("식을 입력하시오:");
		 String str = stdIn.nextLine();
		 for (int i = 0; i < str.length(); i++) {
			 	ch[i] = str.charAt(i);
			}
		 if(ch[1]=='H') {
			 c=1;
			 position = 1;
		 }
		 else {
			 for(int i=1; ch[i]!='H'; i++) {
				 c=10*c + (ch[i]-'0');
				 position=i+1;
			 }
			 
		 }
		 
		 if(ch[position+1]==0) h=1;
		 else {
			 for(int i = position+1; ch[i]!=0; i++) {
				 h=10*h+ (ch[i]-'0');
			 }
		 }
		 System.out.println("C의 갯수: "+c);
		 System.out.println("H의 갯수: "+h);
		 int sum = c*12+h;
		 System.out.println("탄화수소 질량은 "+sum+"g이다.");
		 
	 
	}

}
