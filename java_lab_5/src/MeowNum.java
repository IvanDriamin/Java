import java.util.List;

public class MeowNum {
    public static void makeAllMeow(List<? extends Meow> meowables) {
        for (Meow i : meowables) {
            i.meow();
        }
    }
}
