import java.util.Arrays;

public class Broken_line {
private String[] point_arr;

    public Broken_line() {
        this.point_arr = null;
    }

    public Broken_line(String[] point_arr) {
        this.point_arr = point_arr;
    }

    public String toString() {
        return "Линия " + Arrays.toString(point_arr);
    }

    public void setBroken_line(String[] p) {
        this.point_arr = p;
    }
}
