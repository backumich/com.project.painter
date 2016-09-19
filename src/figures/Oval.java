package figures;

public class Oval implements Figure {
    public double height;
    public double width;
    public double pointY;
    public double pointX;


    public Oval() {
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

    @Override
    public double setPointX(double pointX) {
        this.pointX = pointX;
        return pointX;
    }

    @Override
    public double getPointX() {
        return pointX;
    }

    @Override
    public double setPointY(double pointY) {
        this.pointY = pointY;
        return pointY;
    }

    @Override
    public double getPointY() {
        return pointY;
    }


    public static class Builder {
        Oval instance;

        public Builder() {
            instance = new Oval();
        }

        public Builder setPoint(double pointX, double pointY) {
            instance.pointX = pointX;
            instance.pointY = pointY;
            return this;
        }

        public Builder setWidth(double width) {
            instance.width = width;
            return this;
        }

        public Builder setHeight(double height) {
            instance.height = height;
            return this;
        }

        public Oval getInstance() {
            return instance;
        }
    }
}
