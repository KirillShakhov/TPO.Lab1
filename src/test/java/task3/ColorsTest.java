package task3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ColorsTest {
    @Test
    @DisplayName("Check colors")
    void checkColors() {
        assertAll(
                () -> assertEquals("Зеленый", Colors.GREEN.toString()),
                () -> assertEquals("Черный", Colors.BLACK.toString()),
                () -> assertEquals("Белый", Colors.WHITE.toString())
        );
    }
}
