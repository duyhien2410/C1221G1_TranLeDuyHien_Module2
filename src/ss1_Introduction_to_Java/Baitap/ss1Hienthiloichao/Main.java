package ss1_Introduction_to_Java.Baitap.ss1Hienthiloichao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên của bạn:");
        String name = scanner.nextLine();
        System.out.println("Hello "+name);
    }
}
