package Lab2HerbeiKI301;

public class Leg {
    private String color;
    private double length;

    public Leg(String color, double length) {
        this.color = color;
        this.length = length;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Leg{ " +
                "color = '" + color + '\'' +
                ", length = " + length +
                '}';
    }
}


