package task3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArmchairTest {
    @Test
    @DisplayName("Check armchair name")
    void checkName() {
        Armchair armchair = new Armchair(Colors.BLACK);
        assertEquals("Кресло", armchair.getName());
        armchair.setName("Кожаное кресло");
        assertEquals("Кожаное кресло", armchair.getName());
    }

    @Test
    @DisplayName("Check Colors armchair")
    void checkColors() {
        Armchair armchair = new Armchair(Colors.BLACK);
        assertEquals(Colors.BLACK, armchair.getColor());
        armchair.setColor(Colors.WHITE);
        assertEquals(Colors.WHITE, armchair.getColor());
    }

    @Test
    @DisplayName("Check creator on armchair")
    void checkCreatorOnArmchair() {
        Armchair armchair = new Armchair(Colors.BLACK);
        Creature creature = new Creature("Creature", Colors.BLACK, 100.0, null);
        Creature creature2 = new Creature("Creature2", Colors.BLACK, 100.0, null);
        armchair.flopDown(creature);
        assertEquals(creature, armchair.getCreatureOnArmchair());
        armchair.flopDown(creature2);
        assertEquals(creature, armchair.getCreatureOnArmchair());
    }

    @Test
    @DisplayName("Check flop down")
    void checkFlopDown() {
        Armchair armchair = new Armchair(Colors.BLACK);
        Creature creature = new Creature("Creature", Colors.BLACK, 100.0, null);
        assertEquals(100.0, armchair.getEndurance());

        armchair.flopDown(creature);
        assertEquals(90.0, armchair.getEndurance());

        armchair.flopDown(creature);
        assertEquals(80.0, armchair.getEndurance());

        armchair.flopDown(creature);
        assertEquals(70.0, armchair.getEndurance());

        armchair.flopDown(creature);
        assertEquals(60.0, armchair.getEndurance());

        armchair.flopDown(creature);
        assertEquals(50.0, armchair.getEndurance());

        armchair.flopDown(creature);
        assertEquals(0.0, armchair.getEndurance());

        armchair.flopDown(creature);
        assertEquals(0.0, armchair.getEndurance());

        assertNull(armchair.getCreatureOnArmchair());
    }
}
