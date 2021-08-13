import org.json.JSONException;
import org.json.JSONObject;

public class Test {
    public static void main(String[] args) throws JSONException {
        JSONObject o = new JSONObject();
        o.put("s", "v");
        o.put("s1", 1);
        o.put("s2", false);
        System.out.println(o.toString());

    }


}
