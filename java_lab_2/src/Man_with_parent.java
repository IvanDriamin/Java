public class Man_with_parent {
    private String surname, personal_name, middle_name;
    private int height;
    private Man_with_parent parent;

    public Man_with_parent() {
        this.surname = "";
        this.personal_name = "";
        this.middle_name = "";
        this.height = 0;
        this.parent = null;
    }

    public Man_with_parent(String surname, String personal_name, String middle_name, int height, Man_with_parent parent) {
        this.surname = surname;
        this.personal_name = personal_name;
        this.middle_name = middle_name;
        this.height = height;
        this.parent = parent;
    }

    public String toString() {
        String a = Integer.toString(height);
        String s = "Человек с Именем ";
        if (parent != null) {
            if (parent.surname != null) {
                s = s + parent.surname + " ";
            }
            s = s + personal_name;
            if (parent.personal_name != null) {
                s = s + " " + parent.personal_name + "ович";
            }
        } else {
            if (surname != null) {
                s = s + surname + " ";
            }
            s = s + personal_name;
            if (middle_name != null) {
                s = s + " " + middle_name;
            }
        }
        s = s + " и ростом " + a;
        return s;
    }
}
