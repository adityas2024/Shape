public class driver {
    public static void main(String[] args) {
        Shape aShape = new Shape();
        System.out.println(aShape);
        System.out.println(aShape.getColor());
        System.out.println(aShape.isFilled());
        aShape.setColor("yellow");
        aShape.setFilled(false);
        System.out.println(aShape);
        Shape bShape = new Shape("red", true);
        System.out.println(bShape);
    }
}