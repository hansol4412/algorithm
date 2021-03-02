package algorithm;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
public class Number69 {

	public static void main(String[] args) {
		// 69. 이진트리 넓이 우선탐색(BFS)
		// 배열을 이용하여 큐 자료구조 나타내기
		Scanner stdIn = new Scanner(System.in);
		System.out.print("노드의 수를 입력하세요:");
		int n = stdIn.nextInt();
		List<LinkedList<Integer>> map = new LinkedList<LinkedList<Integer>>();
		int[] ch = new int[20];
		int i;
		int o;
		for(int k=0; k<=n; k++) {
			map.add(new LinkedList<Integer>());
		}
		for(int k=1; k<n; k++) {
			i = stdIn.nextInt();
			o = stdIn.nextInt();
			map.get(i).add(o);
		}
		int front =-1;
		int back=-1;
		int[] Queue = new int[n+1];
		Queue[++back]=1; //시작점 넣기
		ch[1]=1;
		while(back>front) {
			int x = Queue[++front];
			System.out.print(x+" ");
			for(int k = 0; k<map.get(x).size(); k++) {
				if(ch[map.get(x).get(k)]==0) {
					ch[map.get(x).get(k)]=1;
					Queue[++back] = map.get(x).get(k);
				}
			}
		}
		
	}

}
