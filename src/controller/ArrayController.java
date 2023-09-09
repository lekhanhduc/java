package controller;
import java.util.Scanner;

import model.ArrayModel;
import view.ArrayView;

public class ArrayController {
    private ArrayModel model;
    private ArrayView view;

    public ArrayController(ArrayModel model, ArrayView view) {
        this.model = model;
        this.view = view;
    }

    public void run() {
        while (true) {
            double decimalNumber = view.inputDecimal();
            if (decimalNumber == 3) {
                break;
            }
            
            int arraySize = (int) decimalNumber;
            model.generateRandomArray(arraySize, 1, 100);
            view.displayArray(model.getArray());

            int choice = view.getMenuChoice();
            if (choice == 1) {
                model.bubbleSort();
            } else if (choice == 2) {
                model.quickSort();
            }
            if (choice != 3) {
                view.displaySortedArray(model.getArray());

          
        }
    }
}
}

