import java.util.Objects;

public class Fraction <T extends Number> implements Op<T>{
    private T numerator;
    private T denominator;
    private Frac<T> f;


    public Fraction(T numerator, T denominator) {
        if (denominator.doubleValue() == 0) {
            throw new IllegalArgumentException("Знаменатель не может быть равен нулю!");
        }

        this.numerator = numerator;
        this.denominator = denominator;
        this.f = new Frac<>();
    }

    @Override
    public double getDoubleValue() {
        return f.getCachedValue(this);
    }

    @Override
    public void setNumerator(T numerator) {
        this.numerator = numerator;
        f.resetCache();
    }


    @Override
    public void setDenominator(T denominator) {
        if (denominator.doubleValue() == 0) {
            throw new IllegalArgumentException("Знаменатель не может быть равен нулю!");
        }
        this.denominator = denominator;
        f.resetCache();
    }


    public double calculateDoubleValue(){
        return  numerator.doubleValue() / denominator.doubleValue();
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fraction<?> fraction = (Fraction<?>) o;
        return Objects.equals(numerator, fraction.numerator) && Objects.equals(denominator, fraction.denominator);
    }
}
