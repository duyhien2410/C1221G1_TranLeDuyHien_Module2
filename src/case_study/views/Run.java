package case_study.views;

import case_study.controllers.FuramaController;

public class Run {
    public static void main(String[] args) {
        FuramaController furamaController = new FuramaController();
        furamaController.displayMainMenu();
    }
}
