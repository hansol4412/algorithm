package algorithm;
import java.util.Scanner;
public class Number58_2 {

	public static void DFS(int n, int x) {
		if(x>n) return;
		else {
			DFS(n,x*2);
			System.out.print(x);
			DFS(n,x*2+1);
		}
	}

	public static void main(String[] args) {
		// 58_2. ����Ʈ�� ���̿켱Ʈ��(DFS)
		// ������ȸ ���
		System.out.print("����� ������ �Է��ϼ���:");
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int x = n;
		DFS(n,1);
	}

}