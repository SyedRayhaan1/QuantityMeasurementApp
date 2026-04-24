import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuantityMeasurementAppTest {

    @Test
    public void convertFeetToInches() {
        QuantityMeasurementApp.Length result =
                QuantityMeasurementApp.demonstrateLengthConversion(1.0,
                        QuantityMeasurementApp.Length.LengthUnit.FEET,
                        QuantityMeasurementApp.Length.LengthUnit.INCHES);

        assertTrue(result.equals(new QuantityMeasurementApp.Length(12.0,
                QuantityMeasurementApp.Length.LengthUnit.INCHES)));
    }

    @Test
    public void convertYardsToFeet() {
        QuantityMeasurementApp.Length result =
                QuantityMeasurementApp.demonstrateLengthConversion(2.0,
                        QuantityMeasurementApp.Length.LengthUnit.YARDS,
                        QuantityMeasurementApp.Length.LengthUnit.FEET);

        assertTrue(result.equals(new QuantityMeasurementApp.Length(6.0,
                QuantityMeasurementApp.Length.LengthUnit.FEET)));
    }

    @Test
    public void convertCmToInches() {
        QuantityMeasurementApp.Length result =
                QuantityMeasurementApp.demonstrateLengthConversion(2.54,
                        QuantityMeasurementApp.Length.LengthUnit.CENTIMETERS,
                        QuantityMeasurementApp.Length.LengthUnit.INCHES);

        assertTrue(result.equals(new QuantityMeasurementApp.Length(1.0,
                QuantityMeasurementApp.Length.LengthUnit.INCHES)));
    }

    @Test
    public void sameUnitConversion() {
        QuantityMeasurementApp.Length result =
                QuantityMeasurementApp.demonstrateLengthConversion(5.0,
                        QuantityMeasurementApp.Length.LengthUnit.FEET,
                        QuantityMeasurementApp.Length.LengthUnit.FEET);

        assertTrue(result.equals(new QuantityMeasurementApp.Length(5.0,
                QuantityMeasurementApp.Length.LengthUnit.FEET)));
    }

    @Test
    public void negativeValueConversion() {
        QuantityMeasurementApp.Length result =
                QuantityMeasurementApp.demonstrateLengthConversion(-1.0,
                        QuantityMeasurementApp.Length.LengthUnit.FEET,
                        QuantityMeasurementApp.Length.LengthUnit.INCHES);

        assertTrue(result.equals(new QuantityMeasurementApp.Length(-12.0,
                QuantityMeasurementApp.Length.LengthUnit.INCHES)));
    }

    @Test
    public void nullUnitThrows() {
        assertThrows(IllegalArgumentException.class, () ->
                new QuantityMeasurementApp.Length(1.0, null));
    }

    @Test
    public void sameReference() {
        QuantityMeasurementApp.Length l =
                new QuantityMeasurementApp.Length(1.0,
                        QuantityMeasurementApp.Length.LengthUnit.FEET);

        assertTrue(l.equals(l));
    }
}