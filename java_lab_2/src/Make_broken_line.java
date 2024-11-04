import java.util.Arrays;

public class Make_broken_line {
    private String[] point_arr;

    public Make_broken_line() {
        this.point_arr = null;
    }

    public Make_broken_line(String[] point_arr) {
        this.point_arr = point_arr;
    }

    public String getMake_broken_line() {
        return "Линия " + Arrays.toString(point_arr);
    }

    public void setMake_broken_line(String[] p) {
        if (p == null) {
            p = new String[]{"{0;0}", "{2;1}", "{4;0}"};
        }
        this.point_arr = p;
    }
}
