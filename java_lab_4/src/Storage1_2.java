public class Storage1_2<T> {
    private T v;
    private T alternative;

    public Storage1_2() {
        this.v = null;
        this.alternative = null;
    }

    public Storage1_2(T v, T alternative) {
        this.v = v;
        this.alternative = alternative;
    }

    public Storage1_2 get() {
        return this;
    }

    public String toString() {
        if (v == null) {
            return "В хронилище есть " + alternative;
        }
        return "В хронилище есть " + v;
    }
}
