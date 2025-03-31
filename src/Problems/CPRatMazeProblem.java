package Problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CPRatMazeProblem {
	public static List<String> findPath(int[][] mat) {
		List<String> result = new ArrayList<>();
		int n = mat.length;
		if (mat[0][0] == 0 || mat[n - 1][n - 1] == 0) {
			return result;
		}

		boolean[][] visited = new boolean[n][n];
		findPaths(mat, 0, 0, "", visited, result);
		Collections.sort(result); // Ensure lexicographical order
		return result;
	}

	private static void findPaths(int[][] mat, int row, int col, String path, boolean[][] visited,
			List<String> result) {
		int n = mat.length;

		if (row == n - 1 && col == n - 1) { // Destination reached
			result.add(path);
			return;
		}

		visited[row][col] = true;

		// Possible movements: D, L, R, U (lexicographically sorted order: D, L, R, U)
		int[] dRow = { 1, 0, 0, -1 };
		int[] dCol = { 0, -1, 1, 0 };
		char[] moves = { 'D', 'L', 'R', 'U' };

		for (int i = 0; i < 4; i++) {
			int newRow = row + dRow[i];
			int newCol = col + dCol[i];

			if (isSafe(mat, newRow, newCol, visited)) {
				findPaths(mat, newRow, newCol, path + moves[i], visited, result);
			}
		}

		visited[row][col] = false; // Backtrack
	}

	private static boolean isSafe(int[][] mat, int row, int col, boolean[][] visited) {
		int n = mat.length;
		return row >= 0 && col >= 0 && row < n && col < n && mat[row][col] == 1 && !visited[row][col];
	}

	public static void main(String[] args) {
		int[][] mat1 = { { 1, 0, 0, 0 }, { 1, 1, 0, 1 }, { 1, 1, 0, 0 }, { 0, 1, 1, 1 } };
		int[][] mat2 = { { 1, 0 }, { 1, 0 } };
		int[][] mat3 = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };

		System.out.println(findPath(mat1)); // Output: ["DDRDRR", "DRDDRR"]
		System.out.println(findPath(mat2)); // Output: []
		System.out.println(findPath(mat3)); // Output: ["DDRR", "RRDD"]
	}
}