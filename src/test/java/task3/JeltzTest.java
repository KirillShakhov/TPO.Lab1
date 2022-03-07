package task3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class JeltzTest {
    @Test
    @DisplayName("Check init Jeltz")
    void checkInit() {
        Jeltz jeltz = new Jeltz();
        assertEquals("Простетный Вогон Джельц", jeltz.getName());
        assertEquals(Colors.GREEN, jeltz.getColor());
        assertEquals(100.0, jeltz.getWeight());
        assertNull(jeltz.getCurrentLocation());
        Place place = new Place("Place");
        jeltz = new Jeltz("Creature", Colors.BLACK, 200.0, place);
        assertEquals("Creature", jeltz.getName());
        assertEquals(Colors.BLACK, jeltz.getColor());
        assertEquals(200.0, jeltz.getWeight());
        assertEquals(place, jeltz.getCurrentLocation());
    }

    @Test
    @DisplayName("Check move Jeltz")
    void checkMove() {
        Jeltz jeltz = new Jeltz();
        assertNull(jeltz.getCurrentLocation());
        Place place = new Place("Командный мостик");
        Place place2 = new Place("Ангар");
        jeltz.move(place);
        assertEquals(place, jeltz.getCurrentLocation());
        jeltz.move(place2);
        assertEquals(place2, jeltz.getCurrentLocation());
    }

    @Test
    @DisplayName("Check yell Jeltz")
    void checkYell() {
        Jeltz jeltz = new Jeltz();
        Creature creature = new Creature("Creature", Colors.BLACK, 100.0, null);

        assertEquals(Mood.ANNOYED, jeltz.getMood());
        assertEquals(Mood.CALM, creature.getMood());

        jeltz.yell(creature);
        assertEquals(Mood.NOT_SO_MUCH_ANNOYED, jeltz.getMood());
        assertEquals(Mood.NOT_SO_MUCH_ANNOYED, creature.getMood());

        jeltz.yell(creature);
        assertEquals(Mood.CALM, jeltz.getMood());
        assertEquals(Mood.ANNOYED, creature.getMood());

        jeltz.yell(creature);
        assertEquals(Mood.CALM, jeltz.getMood());
        assertEquals(Mood.ANNOYED, creature.getMood());

        jeltz.yell(null);
    }

    @Test
    @DisplayName("Check plopIntoChair Jeltz")
    void checkPlopIntoChair() {
        Jeltz jeltz = new Jeltz();
        Place place = new Place("Командный мостик");
        jeltz.plopIntoChair();

        jeltz.move(place);
        Armchair armchair = new Armchair(Colors.BLACK);
        assertEquals(100.0, armchair.getEndurance());

        jeltz.plopIntoChair();

        place.addItem(armchair);

        jeltz.move(place);

        assertEquals(place, jeltz.getCurrentLocation());
        assertEquals(100.0, armchair.getEndurance());

        jeltz.plopIntoChair();

        assertEquals(jeltz, armchair.getCreatureOnArmchair());
        assertEquals(90.0, armchair.getEndurance());
    }
}
