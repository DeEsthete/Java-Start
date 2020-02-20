package matrix.ex;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите n: ");
        int n = scanner.nextInt();
        MatrixWrapper matrix = new MatrixWrapper(n, n, -n, n);
        System.out.println("Начальная матрица:");
        System.out.println(matrix);
        matrix.transpose();
        System.out.println("Матрица после транспонировки:");
        System.out.println(matrix);
        System.out.println("Норма матрицы");
        System.out.println(matrix.getMatrixNormal());
        System.out.println("Определитель матрицы");
        System.out.println(matrix.getMatrixDeterminate());
    }
}