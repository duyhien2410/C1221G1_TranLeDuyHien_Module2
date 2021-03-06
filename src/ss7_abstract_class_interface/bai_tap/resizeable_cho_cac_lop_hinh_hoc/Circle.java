package ss7_abstract_class_interface.bai_tap.resizeable_cho_cac_lop_hinh_hoc;

public class Circle extends Shape implements Resizeable {
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + ", which is a subclass of "
                + super.toString()
                + ", Area="
                + getArea();
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public void resize(double percent) {
        this.radius *= (percent / 200);
    }

}
