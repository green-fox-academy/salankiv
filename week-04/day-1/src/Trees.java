import java.util.HashMap;
import java.util.Map;

public class Trees {
	public static void main(String[] args) {
		Map<String, String> oak = new HashMap<>();
		oak.put("type", "oak");
		oak.put("leaf color", "green");
		oak.put("age", "24");
		oak.put("sex", "male");

		Map<String, String> maple = new HashMap<>();
		maple.put("type", "maple");
		maple.put("leaf color", "light-green");
		maple.put("age", "5");
		maple.put("sex", "female");

		Map<String, String> pine = new HashMap<>();
		pine.put("type", "pine");
		pine.put("leaf color", "brown");
		pine.put("age", "83");
		pine.put("sex", "male");

		Map<String, String> birch = new HashMap<>();
		birch.put("type", "birch");
		birch.put("leaf color", "yellow");
		birch.put("age", "44");
		birch.put("sex", "male");

		Map<String, String> cherry = new HashMap<>();
		cherry.put("type", "cherry");
		cherry.put("leaf color", "red");
		cherry.put("age", "18");
		cherry.put("sex", "female");
	}
}
