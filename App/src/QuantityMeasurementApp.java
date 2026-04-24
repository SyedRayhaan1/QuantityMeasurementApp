public class QuantityMeasurementApp {

    public static class Length {

        private final double value;
        private final LengthUnit unit;

        public enum LengthUnit {
            FEET(12.0),
            INCHES(1.0),
            YARDS(36.0),
            CENTIMETERS(0.393701);

            private final double factor;

            LengthUnit(double factor) {
                this.factor = factor;
            }

            public double getFactor() {
                return factor;
            }
        }

        public Length(double value, LengthUnit unit) {
            if (!Double.isFinite(value) || unit == null) throw new IllegalArgumentException();
            this.value = value;
            this.unit = unit;
        }

        private double toInches() {
            return value * unit.getFactor();
        }

        public Length convertTo(LengthUnit targetUnit) {
            if (targetUnit == null) throw new IllegalArgumentException();
            double inches = toInches();
            double converted = inches / targetUnit.getFactor();
            return new Length(Math.round(converted * 100.0) / 100.0, targetUnit);
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Length other = (Length) obj;
            return Double.compare(this.toInches(), other.toInches()) == 0;
        }
    }

    public static boolean demonstrateLengthEquality(Length l1, Length l2) {
        return l1.equals(l2);
    }

    public static Length demonstrateLengthConversion(double value, Length.LengthUnit from, Length.LengthUnit to) {
        return new Length(value, from).convertTo(to);
    }

    public static Length demonstrateLengthConversion(Length length, Length.LengthUnit to) {
        return length.convertTo(to);
    }

    public static void main(String[] args) {
        Length result = demonstrateLengthConversion(3.0, Length.LengthUnit.FEET, Length.LengthUnit.INCHES);
        System.out.println(result.equals(new Length(36.0, Length.LengthUnit.INCHES)));
    }
}