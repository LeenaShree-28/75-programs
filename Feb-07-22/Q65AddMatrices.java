public class Q65AddMatrices {
    public static void main(String[] args) {
        int[][] A = { { 1, 2, 6 }, { 3, 4, 5 } };
        int[][] B = { { 4, 2, 1 }, { 2, 1, 8 } };
        int r = A.length, c = A[0].length;
        int[][] C = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                C[i][j] = A[i][j] + B[i][j];
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}
