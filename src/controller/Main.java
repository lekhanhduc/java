package controller;

import model.ArrayModel;
import view.ArrayView;

public class Main {
 public static void main(String[] args) {
     ArrayModel model = new ArrayModel();
     ArrayView view = new ArrayView();
     ArrayController controller = new ArrayController(model, view);

     controller.run();
 }
}