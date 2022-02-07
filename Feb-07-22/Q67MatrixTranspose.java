public class Q67MatrixTranspose {
    public static void main(String[] args) {
        int[][] A = { { 1, 2, 5 }, { 3, 4, 9 } };
        int r = A.length, c = A[0].length;
        int[][] T = new int[c][r];
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                T[i][j] = A[j][i] ;
                System.out.print(T[i][j] + " ");
            }
            System.out.println();
        }
    }
}
