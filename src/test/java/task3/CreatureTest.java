package task3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class CreatureTest {
    @Test
    @DisplayName("Check init creature")
    void checkInit() {
        Place place = new Place("Place");
        Creature creature = new Creature("Creature", Colors.BLACK, 100.0, place);
        assertEquals("Creature", creature.getName());
        assertEquals(Colors.BLACK, creature.getColor());
        assertEquals(100.0, creature.getWeight());
        assertEquals(place, creature.getCurrentLocation());

    }

    @Test
    @DisplayName("Check move creature")
    void checkMove() {
        Creature creature = new Creature("Creature", Colors.BLACK, 100.0, null);
        assertNull(creature.getCurrentLocation());
        Place place = new Place("Place1");
        Place place2 = new Place("Place2");
        creature.move(place);
        assertEquals(place, creature.getCurrentLocation());
        creature.move(place2);
        assertEquals(place2, creature.getCurrentLocation());
    }
}
