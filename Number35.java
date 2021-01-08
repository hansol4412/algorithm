package algorithm;
import java.util.Scanner;
public class Number35 {

	public static void main(String[] args) {
		// 35. Special Sort(구글)
		// N개의 정수가 입력되면 양의 정수와 음의 정수가 섞인 숫자들을 음의 정수는 왼쪽으로 양의 정수는 오른족으로 나눠라
		//입력된 음과 양의 정수의 순서에는 변함이 없어야 한다.
		Scanner stdIn = new Scanner(System.in); 
		System.out.print("입력할 수의 갯수를 입력하세요:");
		int n = stdIn.nextInt();
		int[] a = new int[n];
		for(int i=0; i<n; i++) {
			a[i] = stdIn.nextInt();
		}
		
		for(int j=0; j<n; j++) {
			for(int i=0; i<n-j-1; i++) {
				if(a[i]>0 && a[i+1]<0) {
					int temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
				}
			}
		}
		
		
		for(int i=0; i<n; i++) {
			System.out.print(a[i]+" ");
		}
		}

}
