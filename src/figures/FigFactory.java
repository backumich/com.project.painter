package figures;

public class FigFactory {

    public static final String CIRCLE = "Circle";
    public static final String OVAL = "Oval";
    public static final String SQUARE = "Square";
    public static final String RECTANGULAR = "Rectangular";


    public static Figure getInstance(String figName, double pointX, double pointY, double height, double wight) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Figure toReturn;

        if (CIRCLE.equalsIgnoreCase(figName)) {
            toReturn = new Circle.Builder().setDiameter(height).setPoint(pointX, pointY).getInstance();
        } else if (RECTANGULAR.equalsIgnoreCase(figName)) {
            toReturn = new Rectangular.Builder().setHeight(height).setWidth(wight).setPoint(pointX, pointY).getInstance();
        } else if (OVAL.equalsIgnoreCase(figName)) {
            toReturn = new Oval.Builder().setHeight(height).setWidth(wight).setPoint(pointX, pointY).getInstance();
        } else if (SQUARE.equalsIgnoreCase(figName)) {
            toReturn = new Square.Builder().setHeight(height).setPoint(pointX, pointY).getInstance();
        } else {
            throw new IllegalArgumentException("No such implementation");
        }

        return toReturn;
    }
}