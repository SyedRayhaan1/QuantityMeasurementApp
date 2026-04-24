import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuantityMeasurementAppTest {

    @Test
    public void testYardToFeet() {
        QuantityMeasurementApp.Length l1 = new QuantityMeasurementApp.Length(1.0, QuantityMeasurementApp.Length.LengthUnit.YARDS);
        QuantityMeasurementApp.Length l2 = new QuantityMeasurementApp.Length(3.0, QuantityMeasurementApp.Length.LengthUnit.FEET);
        assertTrue(l1.equals(l2));
    }

    @Test
    public void testYardToInches() {
        QuantityMeasurementApp.Length l1 = new QuantityMeasurementApp.Length(1.0, QuantityMeasurementApp.Length.LengthUnit.YARDS);
        QuantityMeasurementApp.Length l2 = new QuantityMeasurementApp.Length(36.0, QuantityMeasurementApp.Length.LengthUnit.INCHES);
        assertTrue(l1.equals(l2));
    }

    @Test
    public void testCentimeterToInches() {
        QuantityMeasurementApp.Length l1 = new QuantityMeasurementApp.Length(1.0, QuantityMeasurementApp.Length.LengthUnit.CENTIMETERS);
        QuantityMeasurementApp.Length l2 = new QuantityMeasurementApp.Length(0.393701, QuantityMeasurementApp.Length.LengthUnit.INCHES);
        assertTrue(l1.equals(l2));
    }

    @Test
    public void testDifferentUnitsNotEqual() {
        QuantityMeasurementApp.Length l1 = new QuantityMeasurementApp.Length(1.0, QuantityMeasurementApp.Length.LengthUnit.CENTIMETERS);
        QuantityMeasurementApp.Length l2 = new QuantityMeasurementApp.Length(1.0, QuantityMeasurementApp.Length.LengthUnit.FEET);
        assertFalse(l1.equals(l2));
    }

    @Test
    public void testSameReference() {
        QuantityMeasurementApp.Length l1 = new QuantityMeasurementApp.Length(2.0, QuantityMeasurementApp.Length.LengthUnit.YARDS);
        assertTrue(l1.equals(l1));
    }

    @Test
    public void testNullComparison() {
        QuantityMeasurementApp.Length l1 = new QuantityMeasurementApp.Length(2.0, QuantityMeasurementApp.Length.LengthUnit.YARDS);
        assertFalse(l1.equals(null));
    }

    @Test
    public void testMultiUnitTransitive() {
        QuantityMeasurementApp.Length a = new QuantityMeasurementApp.Length(1.0, QuantityMeasurementApp.Length.LengthUnit.YARDS);
        QuantityMeasurementApp.Length b = new QuantityMeasurementApp.Length(3.0, QuantityMeasurementApp.Length.LengthUnit.FEET);
        QuantityMeasurementApp.Length c = new QuantityMeasurementApp.Length(36.0, QuantityMeasurementApp.Length.LengthUnit.INCHES);
        assertTrue(a.equals(b) && b.equals(c) && a.equals(c));
    }
}