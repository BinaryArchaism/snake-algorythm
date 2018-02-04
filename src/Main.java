/**
 * @author Dmitrii "BinaryArchaism" Dmitriev
 */

public class Main {
    public static void main(String[] args) {
        int N = 7; // Размер матрицы
        int matrix[][] = new int[N][N];

        // Переменная k счетчик и число, которое заносится в матрицу
        int k = 0;
        for (int i = 0; i < N; ++i) {
            matrix[0][i] = k;
            ++k;
        }

        int down = 1;
        int left = 6;
        int up = 0;
        int right = 1;



        while (k <= N*N) {
            for (int i = down; i < N; ++i) {
                matrix[i][N - down] = k;
                ++k;
            } ++down;
            for (int i = N-down; i >= 0; --i) {
                matrix[left][N-1 - i] = k;
                ++k;
            } --left;
            for (int i = N-1 - up; i >= 0; --i) {
                matrix[i][up] = k;
                ++k;
            } ++up;
            for (int i = right; i < N - down; ++i) {
                matrix[right][i] = k;
                ++k;
            } ++right;
        }

        for (int i = 0; i < N; ++i) {
            for (int j = 0; j < N; ++j) {
                System.out.print(matrix[i][j] + " | ");
            }
            System.out.println();
        }
    }
}
