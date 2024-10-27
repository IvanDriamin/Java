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

    public String getMan_with_parent() {
        String a = Integer.toString(height);
        if (parent != null) {
            return "Человек с Именем " + surname + " " + personal_name + " " + parent.personal_name + "ович" + " и ростом " + a + " является сыном " + parent.surname + "а " + parent.personal_name + "а";
        }
        return "Человек с Именем " + surname + " " + personal_name + " " + middle_name + " и ростом " + a;
    }

    public void setMan_with_parent(String s, String p, String m, int h, Man_with_parent par) {
        this.surname = s;
        this.personal_name = p;
        if (m != null) {
            this.middle_name = m;
        }
        this.height = h;
        if (par != null) {
            this.parent = par;
        }
    }
}
