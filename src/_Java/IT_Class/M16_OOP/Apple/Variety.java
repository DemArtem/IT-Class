package _Java.IT_Class.M16_OOP.Apple;

public enum Variety {
    GALA("red", "sweet"), FUJI("green", "sourer"), GOLDEN("gold", "sweet-sourer");

    private String color;
    private String taste;

    private Variety(String color, String taste) {
        this.color = color;
        this.taste = taste;
    }

    @Override
    public String toString() {
        return "Variety{" +
                "name='" + name() + '\'' +
                ", color='" + color + '\'' +
                ", taste='" + taste + '\'' +
                '}';
    }
}