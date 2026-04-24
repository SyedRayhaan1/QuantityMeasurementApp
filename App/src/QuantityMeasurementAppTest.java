import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuantityMeasurementAppTest {

    @Test
    public void testFeetToFeet_SameValue() {
        QuantityMeasurementApp.Length l1 = new QuantityMeasurementApp.Length(1.0, QuantityMeasurementApp.Length.LengthUnit.FEET);
        QuantityMeasurementApp.Length l2 = new QuantityMeasurementApp.Length(1.0, QuantityMeasurementApp.Length.LengthUnit.FEET);
        assertTrue(l1.equals(l2));
    }

    @Test
    public void testInchesToInches_SameValue() {
        QuantityMeasurementApp.Length l1 = new QuantityMeasurementApp.Length(1.0, QuantityMeasurementApp.Length.LengthUnit.INCHES);
        QuantityMeasurementApp.Length l2 = new QuantityMeasurementApp.Length(1.0, QuantityMeasurementApp.Length.LengthUnit.INCHES);
        assertTrue(l1.equals(l2));
    }

    @Test
    public void testFeetToInches_Equal() {
        QuantityMeasurementApp.Length l1 = new QuantityMeasurementApp.Length(1.0, QuantityMeasurementApp.Length.LengthUnit.FEET);
        QuantityMeasurementApp.Length l2 = new QuantityMeasurementApp.Length(12.0, QuantityMeasurementApp.Length.LengthUnit.INCHES);
        assertTrue(l1.equals(l2));
    }

    @Test
    public void testInchesToFeet_Equal() {
        QuantityMeasurementApp.Length l1 = new QuantityMeasurementApp.Length(12.0, QuantityMeasurementApp.Length.LengthUnit.INCHES);
        QuantityMeasurementApp.Length l2 = new QuantityMeasurementApp.Length(1.0, QuantityMeasurementApp.Length.LengthUnit.FEET);
        assertTrue(l1.equals(l2));
    }

    @Test
    public void testDifferentValues() {
        QuantityMeasurementApp.Length l1 = new QuantityMeasurementApp.Length(1.0, QuantityMeasurementApp.Length.LengthUnit.FEET);
        QuantityMeasurementApp.Length l2 = new QuantityMeasurementApp.Length(2.0, QuantityMeasurementApp.Length.LengthUnit.FEET);
        assertFalse(l1.equals(l2));
    }

    @Test
    public void testNullComparison() {
        QuantityMeasurementApp.Length l1 = new QuantityMeasurementApp.Length(1.0, QuantityMeasurementApp.Length.LengthUnit.FEET);
        assertFalse(l1.equals(null));
    }

    @Test
    public void testSameReference() {
        QuantityMeasurementApp.Length l1 = new QuantityMeasurementApp.Length(1.0, QuantityMeasurementApp.Length.LengthUnit.FEET);
        assertTrue(l1.equals(l1));
    }
}