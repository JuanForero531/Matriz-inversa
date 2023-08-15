package model;

import java.util.ArrayList;

public class MatrixModel {
    private ArrayList<ArrayList<Integer>> originalMatrix;
    private ArrayList<ArrayList<Integer>> transposeMatrix;

    public MatrixModel(int matrixSize) {
        originalMatrix = new ArrayList<>();
        transposeMatrix = new ArrayList<>();

        for (int i = 0; i < matrixSize; i++) {
            originalMatrix.add(new ArrayList<>());
            transposeMatrix.add(new ArrayList<>());
        }
    }

    public void setMatrixValue(int row, int col, int value) {
        originalMatrix.get(row).add(value);
    }
     public int getMatrixSize() {
        return originalMatrix.size();
    }

    public ArrayList<ArrayList<Integer>> getTransposeMatrix() {
        for (int i = 0; i < originalMatrix.size(); i++) {
            for (int j = 0; j < originalMatrix.size(); j++) {
                transposeMatrix.get(j).add(originalMatrix.get(i).get(j));
            }
        }
        return transposeMatrix;
    }
}