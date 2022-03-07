package task3;

public enum Mood {
    ANNOYED,
    NOT_SO_MUCH_ANNOYED,
    CALM;

    public Mood lower(){
        if (this == Mood.ANNOYED || this == Mood.NOT_SO_MUCH_ANNOYED) {
            return ANNOYED;
        }
        return NOT_SO_MUCH_ANNOYED;
    }
    public Mood boost(){
        if (this == Mood.NOT_SO_MUCH_ANNOYED || this == Mood.CALM) {
            return CALM;
        }
        return NOT_SO_MUCH_ANNOYED;
    }
}
