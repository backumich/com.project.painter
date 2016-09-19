package figures;

public class Square extends Rectangular {

    @Override
    public double setHeight(double height) {
        this.height = height;
        this.width = height;
        return height;
    }

    @Override
    public double setWidth(double width) {
        this.width = width;
        this.height = width;
        return width;
    }

    public static class Builder {
        Square instance;

        public Builder() {
            instance = new Square();
        }

        public Builder setPoint(double pointX, double pointY) {
            instance.pointX = pointX;
            instance.pointY = pointY;
            return this;
        }

        public Builder setWidth(double width) {
            instance.width = width;
            instance.height = width;
            return this;
        }

        public Builder setHeight(double height) {
            instance.height = height;
            instance.width = height;
            return this;
        }

        public Square getInstance() {
            return instance;
        }
    }

}
