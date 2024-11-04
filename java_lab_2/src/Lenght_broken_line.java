import java.util.Arrays;

public class Lenght_broken_line {
    private String[] point_arr;

    public Lenght_broken_line() {
        this.point_arr = null;
    }

    public Lenght_broken_line(String[] point_arr) {
        this.point_arr = point_arr;
    }

    public String getLenght_broken_line() {
        return "Линия " + Arrays.toString(point_arr);
    }

    public void setLenght_broken_line(String[] p) {
        if (p == null) {
            p = new String[]{"{0;0}", "{2;1}", "{4;0}"};
        }
        this.point_arr = p;
    }
}
