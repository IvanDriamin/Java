@Validate2_4(value = {String.class, String.class})
public class AC3 {

    @ToString2_3
    String country = "UK";

    @ToString2_3(value = ToString2_3.Value.NO)
    String city = "London";

    public String toStr () {
        return city + " " + country;
    }
}
