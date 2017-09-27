import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by aze on 2017.04.04..
 */
public class Extension {
	int add(int a, int b) {
		return a + b;
	}

	int maxOfThree(int a, int b, int c) {
		if (a > b && a > c)
			return a;
		else if (b > a && b > c)
			return b;
		else
			return c;
	}

	List<Integer> median(List<Integer> pool) {
		List<Integer> value = new ArrayList<>();
		Collections.sort(pool);
		if (pool.size() % 2 == 1) {
			value.add(pool.get((pool.size() - 1) / 2));
			return value;
		}
			else {
				value.add(pool.get((pool.size() - 1) / 2));
				value.add(pool.get((pool.size() + 1) / 2));
				return value;
		}
	}

	boolean isVowel(char c) {
		return Arrays.asList('a', 'u', 'o', 'e', 'i').contains(Character.toLowerCase(c));
	}

	String translate(String hungarian) {
		String teve = hungarian;
		int length = teve.length();
		for (int i = 0; i < length; i++) {
			char c = teve.charAt(i);
			if (isVowel(c)) {
				StringBuilder temp = new StringBuilder();
				temp.append(teve);
				temp.insert(i + 1,'v').insert(i + 2, c);
				teve = temp.toString();
				i+=2;
				length+=2;
			}
		}
		return teve;
	}

	public static void main(String[] args) {
		Extension valami = new Extension();
		System.out.println(valami.median(Arrays.asList(3,1,6)));
	}
}
