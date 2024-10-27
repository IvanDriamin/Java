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
        this.surname = surname;
        this.personal_name = personal_name;
        this.middle_name = middle_name;
        this.height = height;
    }

    public String getMan_with_name() {
        String a = Integer.toString(height);
        return "Человек с Именем " + surname + " " + personal_name + " " + middle_name + " и ростом " + a;
    }

    public void setMan_with_name(String s, String p, String m, int h) {
        this.surname = s;
        if (p != null) {
            this.personal_name = p;
        }
        if (m != null) {
            this.middle_name = m;
        }
        this.height = h;
    }
}
