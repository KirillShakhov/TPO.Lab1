package task3;

public enum Mood {
    ANNOYED,
    NOT_SO_MUCH_ANNOYED,
    CALM;

    public Mood lower(){
        switch(this){
            case ANNOYED, NOT_SO_MUCH_ANNOYED -> {
                return ANNOYED;
            }
            case CALM -> {
                return NOT_SO_MUCH_ANNOYED;
            }
        }
        return ANNOYED;
    }
    public Mood boost(){
        switch(this){
            case ANNOYED -> {
                return NOT_SO_MUCH_ANNOYED;
            }
            case NOT_SO_MUCH_ANNOYED, CALM -> {
                return CALM;
            }
        }
        return CALM;
    }
}
