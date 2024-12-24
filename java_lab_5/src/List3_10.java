import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class List3_10 {
    public static <T> List<T> listT(List<T> list) {
        if (list == null || list.isEmpty()) {
            return new ArrayList<>();
        }
        Set<T> seen = new LinkedHashSet<>(); // для отслеживания уже встреченных элементов
        List<T> res = new ArrayList<>(); // для уникальных элементов
        for (T i : list) {
            if (seen.add(i)) {
                res.add(i);
            }
        }
        return res;
    }
}
