@Default2_2(value = AC2.class)
public class AC2 {

    private String name;

    @Default2_2(value=Integer.class)
    private int id;

    @Invoke2_1
    public void Inv() {
        System.out.println("Hello world");
    }

    public void set2 (String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String Def() {
        return id + " " + name;
    }
//
//    public void Str() {
//        @ToString2_3()
//
//    }
//
//    public void Val() {
//        @Validate2_4()
//    }
//
//    public void Two() {
//        @Two2_5(first = "int", second = 5)
//                //String first;
//                //int second;
//    }
//
//    @Cache2_6
//    public void Cach() {
//
//    }
}
