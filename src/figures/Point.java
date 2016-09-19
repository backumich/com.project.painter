package figures;

public final class Point {
    final private double pointX;
    final private double pointY;

    private Point(double pointX, double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    public double getPointX() {
        return pointX;
    }

    public double getPointY() {
        return pointY;
    }


}
