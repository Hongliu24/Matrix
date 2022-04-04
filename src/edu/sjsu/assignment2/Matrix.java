package edu.sjsu.assignment2;

import java.sql.SQLOutput;

public class Matrix {
    private final int [][] array;

    public Matrix(int[][] array){
        this.array = array;
    }
    public int[][] getMatrix(){
        return this.array;
    }

    public Matrix multiply(Matrix other){
        int m = array.length;
        int n = array[0].length;
        int p = other.array[0].length;

        int [][] result = new int[m][p];


        for(int i = 0; i < m; i++){
            for(int j = 0; j < p; j++){
                for(int k = 0; k < n; k++){
                    result[i][j] += array[i][k] * other.array[k][j];
                }
            }
        }
        return new Matrix(result);
    }

    public static void main(String[] args) {
        int[][] array1 = new int[][]{{2, 4}, {3, 4}};
        int[][] array2 = new int[][]{{1, 2}, {1, 3}};
        Matrix matrix1 = new Matrix(array1);
        Matrix matrix2 = new Matrix(array2);
        Matrix resultMatrix = matrix1.multiply(matrix2);
        int[][] resultArray = resultMatrix.getMatrix();
        for (int i = 0; i < resultArray.length; i++){
            for(int j = 0; j < resultArray[0].length; j++){
            System.out.println(resultArray[i][j]);
    }
            System.out.println("");
        }}


}
