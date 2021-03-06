package ss7_abstract_class_interface.thuc_hanh.trien_khai_interface_comparable_de_so_sanh_cac_lop_hinh_hoc;

import java.util.Arrays;
import java.util.Comparator;

public class CircleComparatorTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(9);
        circles[1] = new Circle(12,"purple",false);
        circles[2] = new Circle();

        System.out.println("Pre-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }

        Comparator circleComparator = new CircleComparator();
        Arrays.sort(circles, circleComparator);
        System.out.println("After-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
    }
}
