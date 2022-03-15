package case_study.controllers;

import java.util.Scanner;

public class FuramaController {
    public void displayMainMenu(){
        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        do {
            System.out.println("Menu:" +
                    "1.\tEmployee Management\n" +
                    "2.\tCustomer Management\n" +
                    "3.\tFacility Management \n" +
                    "4.\tFacility Management\n" +
                    "5.\tPromotion Management\n" +
                    "6.\tExit\n");
            System.out.print("Input selection:");
            int choose1 = Integer.parseInt(sc.nextLine());
            switch (choose1){
                case 1:
                    System.out.println("Employee Management: " +
                            "1.\tDisplay list employees\n" +
                            "2.\tAdd new employee\n" +
                            "3.\tEdit employee\n" +
                            "4.\tReturn main menu\n");
                    System.out.print("Input selection:");
                    int choose2 = Integer.parseInt(sc.nextLine());
                    break;
                case 2:
                    System.out.println("Customer Management:" +
                            "1.\tDisplay list customers\n" +
                            "2.\tAdd new customer\n" +
                            "3.\tEdit customer\n" +
                            "4.\tReturn main menu\n");
                    System.out.println("Input selection:");
                    int choose3 = Integer.parseInt(sc.nextLine());
                    break;
                case 3:
                    System.out.println("Facility Management: "+
                            "1\tDisplay list facility\n" +
                            "2\tAdd new facility\n" +
                            "3\tDisplay list facility maintenance\n" +
                            "4\tReturn main menu\n");
                    System.out.println("Input selection:");
                    int choose4 = Integer.parseInt(sc.nextLine());
                    break;
                case 4:
                    System.out.println("Facility Management:" +
                            "1.\tAdd new booking\n" +
                            "2.\tDisplay list booking\n" +
                            "3.\tCreate new constracts\n" +
                            "4.\tDisplay list contracts\n" +
                            "5.\tEdit contracts\n" +
                            "6.\tReturn main menu\n");
                    System.out.println("Input selection:");
                    int choose5 = Integer.parseInt(sc.nextLine());
                    break;
                case 5:
                    System.out.println("Promotion Management:" +
                            "1.\tDisplay list customers use service\n" +
                            "2.\tDisplay list customers get voucher\n" +
                            "3.\tReturn main menu\n");
                    System.out.println("Input selection:");
                    int choose6 = Integer.parseInt(sc.nextLine());
                    break;
                case 6:
                    System.exit(0);
                    break;
            }
        } while (flag);

    }
}