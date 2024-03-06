public class MainShape {
    public static void main(String[] args) {
        Shape[] shapeTypes = new Shape[5];
        shapeTypes[0] = new Rectangle("black",2,3);
        shapeTypes[1] = new Circle("white",2);
        shapeTypes[2] = new Square("pink",2);
        shapeTypes[3] = new Square("grey",3);
        shapeTypes[4] = new Circle("pink",3.02);
        printTotal(shapeTypes);
    }
    public static void printTotal(Shape[] shapes){
        double totalArea = 0;
        double totalPeri = 0;
        for(Shape i: shapes){
            totalArea = totalArea + i.calculateArea();
            totalPeri = totalPeri + i.calculatePerimeter();
        }
        System.out.println("The total area: " + totalArea);
        System.out.println("the total perimeter: " + totalPeri);
    }
}
