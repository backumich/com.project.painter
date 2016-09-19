package figures;

public class Circle extends Oval {

    public double setRadius(double diameter) {
        this.height = diameter;
        this.width = diameter;
        return diameter;
    }

    public double getDiameter() {
        return height;
    }


    public static class Builder {
        Circle instance;

        public Builder() {
            instance = new Circle();
        }

        public Builder setPoint(double pointX, double pointY) {
            instance.pointX = pointX;
            instance.pointY = pointY;
            return this;
        }

        public Builder setDiameter(double diameter) {
            instance.width = diameter;
            instance.height = diameter;
            return this;
        }


        public Circle getInstance() {
            return instance;
        }
    }
}
