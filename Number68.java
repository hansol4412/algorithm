package algorithm;
import java.util.Scanner;
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
public class Number68 {
public static int n;
public static int min=100;
public static int DFS(int v, int sum, List<LinkedList<Number68_class>> map, int[] ch) {
		if(v==n) {
			if(min>sum) min=sum;
		}
		else {
			for(int k=0; k<map.get(v).size(); k++) {
				if(map.get(v).get(k).getNumber()>0 && ch[map.get(v).get(k).getFinish()]==0) {
					ch[map.get(v).get(k).getFinish()]=1;
					DFS(map.get(v).get(k).getFinish(), sum+map.get(v).get(k).getNumber(), map,ch);
					ch[map.get(v).get(k).getFinish()]=0;
				}
			}
		}
		return min;
	}
	public static void main(String[] args) {
		// 68. 최소비용 (인접리스트)
		// 가중치 방향 그래프가 주어지면 1번 정점에서 N번 정점까지 가는 최소비용을 출력하는 프로그램을 작성하시오.
		Scanner stdIn = new Scanner(System.in);
		System.out.print("정점의 수를 입력하세요:");
		n = stdIn.nextInt();
		System.out.print("간선의 수를 입력하세요:");
		int m = stdIn.nextInt();
		List<LinkedList<Number68_class>> map = new ArrayList<LinkedList<Number68_class>>();
		int i;
		int o;
		int x;
		for(int k=0; k<=n; k++) {
			map.add(new LinkedList<Number68_class>());
		}
		int [] ch = new int[n+1];
		for(int k=0; k<m; k++) {
			i= stdIn.nextInt();
			o= stdIn.nextInt();
			x= stdIn.nextInt();
			map.get(i).add(new Number68_class(o,x));
		}
		
		ch[1]=1;
		int sum=0;
		System.out.println("1부터 "+n+"까지의 최소경로의 값은 "+DFS(1,0,map,ch)+"이다.");
		
	}

}
