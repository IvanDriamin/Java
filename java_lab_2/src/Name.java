public class Name {
    private String surname, personal_name, middle_name;

    public Name() {
        this.surname = "";
        this.personal_name = null;
        this.middle_name = null;
    }

    public Name(String surname, String personal_name, String middle_name) {
        this.surname = surname;
        this.personal_name = personal_name;
        this.middle_name = middle_name;
    }

    public String getName() {
        return surname + " " + personal_name + " " + middle_name;
    }

    public void setName(String s, String p, String m) {
        this.surname = s;
        if (p != null) {
            this.personal_name = p;
        }
        if (m != null) {
            this.middle_name = m;
        }
    }
}
