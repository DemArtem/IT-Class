package HomeWorks.HomeWork24_01_17;

public class Book {
    private Color color;

    public Book(Color color) {

        this.color = color;
    }

    public void setColor(Color color) {

        this.color = color;
    }

    public void getColor(Color color) {

        this.color = color;
    }

    @Override
    public String toString() {
        return "Book{" +
                "color=" + color +
                '}';
    }

    public enum Color {
        BLACK, RED, GREEN, BLUE, YELLOW, WHITE, GRAY;
    }
}