import java.util.ArrayList;
import java.util.List;

public class Applay3_1 {
    public static <T, P> List<P> func3_1(List<T> a, App3_1<T, P> app) {
        List<P> res = new ArrayList<>();
        for (T elem : a) {
            res.add(app.apply(elem));
        }
        return res;
    }
}
