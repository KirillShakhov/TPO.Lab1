package task1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TgTest {

    @ParameterizedTest(name = "tg({0})")
    @DisplayName("Check PI dots")
    @ValueSource(doubles = {0, Math.PI/6, Math.PI/4, Math.PI/3, -Math.PI/6, -Math.PI/4, -Math.PI/3, Math.PI})
    void checkPiDots(double param) {
        assertAll(
                () -> assertEquals(Math.tan(param), Tg.solve(param), 0.015)
        );
    }

    @ParameterizedTest(name = "tg({0}) = NaN")
    @DisplayName("Check PI dots")
    @ValueSource(doubles = {Math.PI/2, -Math.PI/2})
    void checkPiDotsNaN(double param) {
        assertAll(
                () -> assertEquals(Double.NaN, Tg.solve(param))
        );
    }



    @ParameterizedTest(name = "tg({0}) = {1}")
    @DisplayName("Check between dots")
    @CsvFileSource(resources = "/table.csv", numLinesToSkip = 1, delimiter = ';')
    void checkBetweenDotsMinusPiAndPi(double x, double y) {
        assertAll(
                () -> assertEquals(y, Tg.solve(x), 0.0001)
        );
    }
}
