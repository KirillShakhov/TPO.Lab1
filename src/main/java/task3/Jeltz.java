package task3;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Jeltz extends Creature{
    String fullName;

    public Jeltz(){
        setName("Джельц");
        setFullName("Простетный Вогон Джельц");
        setColor(Color.GREEN);
    }


    @Override
    public void move(Place place) {
        super.move(place);
        System.out.println("Перетащил тело в " + place.getName());
    }


    public void yell(Creature creature){
        setMood(getMood().boost());
        creature.setMood(creature.getMood().lower());
        System.out.println(getFullName() + " наорал и стало легче");
    }

    public void plopIntoChair(){
        getCurrentLocation().getItems().stream()
                .filter(item -> item instanceof Armchair)
                .findFirst().ifPresentOrElse(
                        item -> ((Armchair) item).flopDown(this),
                        () -> System.out.println("Не нашел кресло")
                );
    }
}
