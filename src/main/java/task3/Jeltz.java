package task3;


public class Jeltz extends Creature{

    public Jeltz(){
        super("Простетный Вогон Джельц", Colors.GREEN, 100.0, null);
        setMood(Mood.ANNOYED);
    }

    public Jeltz(String name, Colors color, Double weight, Place currentLocation) {
        super(name, color, weight, currentLocation);
    }

    @Override
    public void move(Place place) {
        if (place != null) {
            super.move(place);
            System.out.println("Перетащил тело в локацию " + place.getName());
        }
    }


    public void yell(Creature creature){
        if (creature != null) {
            setMood(getMood().boost());
            creature.setMood(creature.getMood().lower());
            System.out.println(getName() + " наорал и стало легче");
        }
    }

    public void plopIntoChair(){
        if (getCurrentLocation() != null) {
            getCurrentLocation().getItems().stream()
                    .filter(item -> item instanceof Armchair)
                    .findFirst().ifPresentOrElse(
                            item -> ((Armchair) item).flopDown(this),
                            () -> System.out.println("Не нашел кресло")
                    );
        }
    }
}
