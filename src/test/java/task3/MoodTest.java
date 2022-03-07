package task3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MoodTest {
    @Test
    @DisplayName("Check lower Mood")
    void checkLowerMood() {
        assertAll(
                () -> assertEquals(Mood.ANNOYED, Mood.ANNOYED.lower()),
                () -> assertEquals(Mood.ANNOYED, Mood.NOT_SO_MUCH_ANNOYED.lower()),
                () -> assertEquals(Mood.NOT_SO_MUCH_ANNOYED, Mood.CALM.lower())
        );
    }

    @Test
    @DisplayName("Check boost Mood")
    void checkBoostMood() {
        assertAll(
                () -> assertEquals(Mood.NOT_SO_MUCH_ANNOYED, Mood.ANNOYED.boost()),
                () -> assertEquals(Mood.CALM, Mood.NOT_SO_MUCH_ANNOYED.boost()),
                () -> assertEquals(Mood.CALM, Mood.CALM.boost())
        );
    }
}
