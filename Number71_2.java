package algorithm;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
public class Number71_2 {

	public static void main(String[] args) {
		// 71. 송아지 찾기 (BFS : 상태트리탐색) 
		/* 현수는 송아지를 잃어버렸다.송아지에는 위치추적기가 달려있다. 현수의 위치와
		 송아지의 위치가 직성상의 좌표 점으로 주어지면 현수는 현재 위치에서 송아지의
		 위치까지 다음과 같은 방법으로 이동한다.
		 현수는 스카이 콩콩을 타고 가는데 한 번의 점프로 앞으로 1, 뒤로 1, 앞으로 5를
		이동할 수 있다. 최소 몇번의 점프로 현수가 송아지 위치까지 갈 수 있는지
		구하는 프로그램을 작성하시오. */
		// Queue를 이용해 작성하여라.
		Scanner stdIn = new Scanner(System.in);
		System.out.print("현수의 위치를 입력하여라:");
		int s = stdIn.nextInt();
		System.out.print("송아지의 위치를 입력하여라:");
		int e = stdIn.nextInt();
		Queue<Integer> que = new LinkedList<Integer>();
		int[] ch = new int[100];
		int[] dis = {1,-1,5};
		que.offer(s);
		ch[s]=1;
		
		while(!que.isEmpty()) {
			int x = que.peek();
			que.poll();
			for(int i =0; i<3; i++) {
				int pos = x + dis[i];
				if(pos<1 || pos>100) continue;
				if(pos==e) {
					System.out.println("송아지를 찾기 위해 최소"+ch[x]+"번의 점프를 해야한다");
					System.exit(0);
				}
				if(ch[pos]==0) {
					que.offer(pos);
					ch[pos]= ch[x]+1;
				}
			}
		}

	}

}
