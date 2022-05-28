package uber;

public class Rectangle {
    private double width = 1;
    private double length = 1;

    public Rectangle() {
        this.width = 1;
        this.length = 1;
    }
    public Rectangle(double width, double length) {
        if(length >= 0.0 || length <= 0.0) {
            this.length = length;
        }

        if(width >= 0.0 || width <= 0.0) {
            this.width = width;
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width < 0.0 || width > 20.0) {
            throw new RuntimeException("Illegal Argument passed! Use a number between 0.0 and 20.0");
        }

        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if(length < 0.0 || length > 20.0) {
            throw new RuntimeException("Illegal Argument passed! Use a number between 0.0 and 20.0");
        }

        this.length = length;
    }
}
