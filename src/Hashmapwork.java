import java.util.HashMap;
public class Hashmapwork {
    public static void main(String[] args) {

        HashMap<String, String> Countrycapital = new HashMap<String, String>();
        Countrycapital.put("Nepal", " ktm");
        Countrycapital.put("India", "New delhi");
        Countrycapital.put("Japan", "Tokyo");

        for (String name : Countrycapital.keySet()) {
            System.out.println(name + " Capital city is : " + Countrycapital.get(name));

        }
    }
}
