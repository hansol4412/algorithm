package algorithm;
import java.util.Scanner;
public class Number77_3 {
	public static int [] unf = new int[100];
	public static int find(int v) {
		if(unf[v]==v) return v;
		else return unf[v]=find(unf[v]);
	}
	public static void union(int a, int b) {
		a = find(a);
		b = find(b);
		if(a != b) unf[a]=b;
	}
	public static void main(String[] args) {
		// 77_3. 친구인가
		/* 현수네 반 학생은 N명이고, 모든 학생은 1부터 N까지 번호가 부여되어 있다. 
		 * 현수에게는 각각 두 명의 학생의 친구관꼐가 번호로 표현된 숫자쌍이 주어진다. 
		 * 만약 (1,2) (2,3) (3,4)의 숫자 쌍이 주어지면 1번 학생과2번 학생이 친구이고, 2번 학생와 3번 학생이
		 * 친구이고, 3번 학생과 4번학생이 친구이다. 이는 연결되어 1번 학생과 4번 학생이 친구가 될 수 있다
		 * 학생의 친구관계를 나타내는 숫자 쌍이 주어지면 득정 두 명이 친구인지 판벼라는 프로그램을 작성하시오.
		 * 친구관계가 맞으면 YES, 아니면 NO를 출력한다. */
		// Union & Find 자료구조
		Scanner stdIn = new Scanner(System.in);
		System.out.print("학생수를 입력하세요:");
		int n = stdIn.nextInt();
		System.out.print("몇 쌍의 친구인지 입력하세요:");
		int r = stdIn.nextInt();
		for(int i =1; i<=n; i++) {
			unf[i]=i;
		}
		for(int i =1; i<=r; i++) {
			int a = stdIn.nextInt();
			int b = stdIn.nextInt();
			union(a,b);
		}
		System.out.print("친구 사이를 알고 싶은 번호를 2개 입력하세요:");
		int f1 = stdIn.nextInt();
		int f2 = stdIn.nextInt();
		f1=find(f1);
		f2=find(f2);
		if(f1==f2)System.out.println("YES");
		else System.out.println("No");

	}

}
