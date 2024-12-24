public class Frac <T extends Number>{
    private double doubleValue;
    private boolean isCached;

    public double getCachedValue (Fraction<T> fraction){
        if(!isCached){
            doubleValue = fraction.calculateDoubleValue();
            isCached = true;
        }
        return doubleValue;
    }
    public void resetCache() {
        isCached = false;
    }
}
