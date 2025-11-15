package Assignment3.example;import org.junit.jupiter.api.Test;import static org.junit.jupiter.api.Assertions.assertEquals;

public class TemperatureConverterTest {

    private static final double DELTA = 0.001; // Tolerance for double comparisons

    // --- Tests for celsiusToFahrenheit ---
    @Test
    void testCelsiusToFahrenheit_FreezingPoint() {
        TemperatureConverter converter = new TemperatureConverter();
        // 0°C = 32°F
        assertEquals(32.0, converter.celsiusToFahrenheit(0.0), DELTA);
    }

    @Test
    void testCelsiusToFahrenheit_BoilingPoint() {
        TemperatureConverter converter = new TemperatureConverter();
        // 100°C = 212°F
        assertEquals(212.0, converter.celsiusToFahrenheit(100.0), DELTA);
    }

    // --- Tests for fahrenheitToCelsius ---
    @Test
    void testFahrenheitToCelsius_FreezingPoint() {
        TemperatureConverter converter = new TemperatureConverter();
        // 32°F = 0°C
        assertEquals(0.0, converter.fahrenheitToCelsius(32.0), DELTA);
    }

    @Test
    void testFahrenheitToCelsius_BoilingPoint() {
        TemperatureConverter converter = new TemperatureConverter();
        // 212°F = 100°C
        assertEquals(100.0, converter.fahrenheitToCelsius(212.0), DELTA);
    }

    // --- Tests for celsiusToKelvin ---
    @Test
    void testCelsiusToKelvin_FreezingPoint() {
        TemperatureConverter converter = new TemperatureConverter();
        // 0°C = 273.15K
        assertEquals(273.15, converter.celsiusToKelvin(0.0), DELTA);
    }

    @Test
    void testCelsiusToKelvin_AbsoluteZero() {
        TemperatureConverter converter = new TemperatureConverter();
        // -273.15°C = 0K
        assertEquals(0.0, converter.celsiusToKelvin(-273.15), DELTA);
    }
}
