package ss7_abstract_class_interface.thuc_hanh.trien_khai_interface_comparable_de_so_sanh_cac_lop_hinh_hoc;

import java.util.Comparator;

public class CircleComparator implements Comparator<Circle> {

    @Override
    public int compare(Circle o1, Circle o2) {
        return (int) (o2.getRadius()-o1.getRadius());
    }
}
