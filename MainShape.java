public class MainShape {
    public static void main(String[] args) {
        Shape[] shapeTypes = new Shape[5];
        shapeTypes[0] = new Rectangle("black",2,3);
        shapeTypes[1] = new Circle("white",2);
        shapeTypes[2] = new Square("pink",2,2);
        shapeTypes[3] = new Square("grey",3,3);
        shapeTypes[4] = new Circle("pink",3.02);
        printTotal(shapeTypes);
    }
    public static void printTotal(Shape[] shapes){
        for(Shape s: shapes){
            System.out.println("The area: " + s.calculateArea());
            System.out.println("The perimeter: " + s.calculatePerimeter());
        }
    }
}
