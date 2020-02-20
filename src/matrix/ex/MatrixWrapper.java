package matrix.ex;

import java.util.Arrays;
import java.util.Random;

public class MatrixWrapper {
    private int[][] matrix;
    private int x;
    private int y;

    public MatrixWrapper(int x, int y) {
        create(x, y);
    }

    public MatrixWrapper(int x, int y, int startValue, int endValue) {
        create(x, y);
        fill(startValue, endValue);
    }

    public void create(int x, int y) {
        if (x != y) {
            throw new IllegalArgumentException("matrix has not square");
        }

        this.x = x;
        this.y = y;
        matrix = new int[x][y];
    }

    public void fill(int startValue, int endValue) {
        if (startValue >= endValue) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        if (matrix == null) {
            throw new IllegalArgumentException("matrix is null");
        }

        Random random = new Random();
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                matrix[i][j] = random.nextInt((endValue - startValue) + 1) + startValue;
            }
        }
    }

    public void transpose() {
        for (int i = 0; i < x; i++) {
            for (int j = i + 1; j < y; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public double getMatrixNormal() {
        double result = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                result += Math.pow(matrix[i][j], 2);
            }
        }
        result = Math.sqrt(result);
        return result;
    }

    public long getMatrixDeterminate() {
        long result = 0;
        int n = this.x;
        int x = this.x;
        int y = this.y;

        for (int k = 0; k < n; k++) {
            for (int i = 0; i < x; i++) {
                long temp = 0;

                for (int j = 0; j < y; j++) {
                    temp += matrix[i][j];
                }

                temp *= x;

                if (x % 2 == 0) {
                    temp = -temp;
                }

                result += temp;
            }

            x--;
            y--;
        }
        return result;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int[] aMatrix : matrix) {
            for (int anAMatrix : aMatrix) {
                result.append(anAMatrix).append(" ");
            }
            result.append("\n");
        }
        return result.toString();
    }
}