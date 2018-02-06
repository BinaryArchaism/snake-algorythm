/**
 * @author Dmitrii "BinaryArchaism" Dmitriev
 */

public class Main {
    public static void main(String[] args) {
        int N = 5; // Размер матрицы
        int matrix[][] = new int[N][N];

        // Переменная k счетчик и число, которое заносится в матрицу
        int k = 1;
        int f = 0;
        if (N%2!=0) f = 1;

        for (int i = 0; i < (N + 1) / 2; ++i) {
            for (int j = i; j < N - i - 1; ++j) {
                matrix[i][j] = k;
                ++k;
            }
            for (int j = i; j < N - i - 1; ++j) {
                matrix[j][N - i - 1] = k;
                ++k;
            }
            for (int j = N-i-1; j > i; --j) {
                matrix[N-1-i][j] = k;
                ++k;
            }
            for (int j = N-1-i; j > i; --j) {
                matrix[j][i] = k;
                ++k;
            }
        }
        if (f == 1)
        matrix[(N+1)/2 - 1][(N+1)/2 - 1] = N*N;

        for (int i = 0; i < N; ++i) {
            for (int j = 0; j < N; ++j) {
                System.out.print(matrix[i][j] + " | ");
            }
            System.out.println();
        }
    }
}
