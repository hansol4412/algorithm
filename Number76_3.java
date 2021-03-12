package algorithm;
import java.util.Scanner;
public class Number76_3 {
	public static int C(int n, int r, int[][] dy) {
		if(dy[n][r]>0) return dy[n][r];
		if(n==r || r==0) return 1;
		else return dy[n][r] = C(n-1, r, dy) + C(n-1, r-1, dy);
	}

	public static void main(String[] args) {
		//76_3. ���װ��
		/*���װ���� N���� ���Ҹ� ������ ���տ��� R���� ���Ҹ� �̾� �κ������� ����� ����� ��
		������ nCr�� ǥ���Ѵ�. */
		//�޸����̼�
		Scanner stdIn = new Scanner(System.in);
		System.out.print("N�� �Է��ϼ���:");
		int n = stdIn.nextInt();
		System.out.print("R�� �Է��ϼ���:");
		int r = stdIn.nextInt();
		int[][] dy = new int[20][20];
		System.out.println(n+"C"+r+" = "+ C(n,r,dy));

	}

}
