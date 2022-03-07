package task3;


public enum Colors {
    BLACK("Черный"),
    WHITE("Белый"),
    GREEN("Зеленый");

    private final String name;
    Colors(final String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}