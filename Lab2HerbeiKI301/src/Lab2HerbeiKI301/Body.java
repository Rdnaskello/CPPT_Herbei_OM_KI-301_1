package Lab2HerbeiKI301;

public class Body {
    private String color;
    private String size;

    public Body(String color, String size) {
        this.color = color;
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Body{ " +
                "color = '" + color + '\'' +
                ", size = '" + size + '\'' +
                '}';
    }

}
