package Lab2HerbeiKI301;

public class Head {
    private String color;

    public Head(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Head{ " +
                "color = '" + color + '\'' +
                '}';
    }

}

