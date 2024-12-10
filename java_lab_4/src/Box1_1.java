import java.util.List;

public class Box1_1 <T> {
    private T ob;

    public Box1_1() {
        this.ob = null;
    }

    public Box1_1(T ob) {
        this.ob = ob;
    }

    public void delFromBox() {
        this.ob = null;
    }

    public String add(T x) {
        if (ob == null) {
            this.ob = x;
            return "успешно размещено в коробке";
        }
        return "ошибка: коробка заполнена";
    }

    public String isFull() {
        if (ob == null) {
            return "В коробке пусто";
        }
        return "Коробка заполнена";
    }

    public void setBox(T ob) {
        this.ob = ob;
    }

    public T getBox() {
        return ob;
    }

    public String toString() {
        return "Коробка, внутри которой " + ob;
    }
}
