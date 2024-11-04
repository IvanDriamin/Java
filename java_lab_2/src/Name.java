public class Name {
    private String surname, personal_name, middle_name;
    public Name() {
        this.surname = "";
        this.personal_name = "";
        this.middle_name = "";
    }

    public Name(String surname, String personal_name, String middle_name) {
        if (surname != "") {
            this.surname = surname;
        }
        this.personal_name = personal_name;
        if (middle_name != "") {
            this.middle_name = middle_name;
        }
    }

    public String toString() {
        String s = "";
        if (surname != null) {
            s = s + surname + " ";
        }
        s = s + personal_name;
        if (middle_name != null) {
            s = s + " " + middle_name;
        }
        return s;
    }
}
