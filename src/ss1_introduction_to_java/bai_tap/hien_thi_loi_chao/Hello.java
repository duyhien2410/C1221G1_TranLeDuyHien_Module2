package ss1_introduction_to_java.bai_tap.hien_thi_loi_chao;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên của bạn: ");
        String name = scanner.nextLine();
        System.out.println("Hello "+name);
    }
}
