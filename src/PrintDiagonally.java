import java.util.*;

public class PrintDiagonally {
	static ArrayList<Integer> downwardDigonal(int N, int A[][]) {
		ArrayList<Integer> res = new ArrayList<>();
		boolean[][] visited = new boolean[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (!visited[i][j]) {
					res.add(A[i][j]);
					visited[i][j] = true;
					int x = i;
					int y = j;
					while (--y >= 0 && ++x < N) {
						res.add(A[x][y]);
						visited[x][y] = true;
					}
				}
			}
		}
		return res;
	}

	public static void main(String[] args) {
		int N = 3;
		int A[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		ArrayList<Integer> list = downwardDigonal(N, A);
		System.out.println(list);
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(A[i][j] + " ");
			}
			System.out.println();
		}
	}
}
