package task3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PlaceTest {
    @Test
    @DisplayName("Check place name")
    void checkPlaceName() {
        Place place = new Place("Командный мостик");
        assertEquals("Командный мостик", place.getName());
        place.setName("Ангар");
        assertEquals("Ангар", place.getName());
    }

    @Test
    @DisplayName("Check place items")
    void checkPlaceItem() {
        List<Item> list = new ArrayList<>();
        list.add(() -> "Item1");
        list.add(() -> "Item2");
        list.add(() -> "Item3");
        list.add(() -> "Item4");
        list.add(() -> "Item5");


        Place place = new Place("", list);
        for(Item item : list){
            assertTrue(place.getItems().contains(item));
        }

        place = new Place("");
        for(Item item : list){
            place.addItem(item);
            assertTrue(place.getItems().contains(item));
        }
    }
}
