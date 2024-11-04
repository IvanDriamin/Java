public class Man_with_name {
    private String surname, personal_name, middle_name;
    private int height;

    public Man_with_name() {
        this.surname = "";
        this.personal_name = "";
        this.middle_name = "";
        this.height = 0;
    }

    public Man_with_name(String surname, String personal_name, String middle_name, int height) {
        if (surname != "") {
            this.surname = surname;
        }
        this.personal_name = personal_name;
        if (middle_name != "") {
            this.middle_name = middle_name;
        }
        this.height = height;
    }

    public String toString() {
        String a = Integer.toString(height);
        String s = "Человек с Именем ";
        if (surname != null) {
            s = s + surname + " ";
        }
        s = s + personal_name;
        if (middle_name != null) {
            s = s + " " + middle_name;
        }
        s = s + " и ростом " + a;
        return s;
    }

}
