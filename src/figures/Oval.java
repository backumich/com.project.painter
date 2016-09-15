package figures;

public class Oval implements Figure {
    public double height;
    public double width;

    public Oval(double pointX, double pointY, double height, double width){
        this.width = width;
        this.height = height;
        Point point = new Point(pointX,pointY);
    }
    @Override
    public double setHeight(double height) {
        this.height = height;
        return height;
    }

    @Override
    public double getHeight() {
        return height;
    }

    @Override
    public double setWidth(double width) {
        this.width = width;
        return width;
    }

    @Override
    public double getWidth() {
        return width;
    }
}
