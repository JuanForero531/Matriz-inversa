package presenter;

import javax.swing.*;
import java.util.ArrayList;
import model.MatrixModel;
import view.MatrixView;

public class MatrixPresenter {
    private MatrixModel model;
    private MatrixView view;

    public MatrixPresenter(int matrixSize) {
        model = new MatrixModel(matrixSize);
        view = new MatrixView(matrixSize, this);
    }

    public void transposeMatrix() {
        for (int i = 0; i < model.getMatrixSize(); i++) {
            for (int j = 0; j < model.getMatrixSize(); j++) {
                int value = Integer.parseInt(view.getMatrixValue(i, j));
                model.setMatrixValue(i, j, value);
            }
        }
        ArrayList<ArrayList<Integer>> transposeMatrix = model.getTransposeMatrix();
        view.displayTranspose(transposeMatrix);
    }

    public void showView() {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                view.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        int matrixSize = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño de la matriz "));
        MatrixPresenter presenter = new MatrixPresenter(matrixSize);
        presenter.showView();
    }
}