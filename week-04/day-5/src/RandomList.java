import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RandomList {
	public static void main(String[] args) {

		List<String> names = new ArrayList<>();
		names.addAll(Arrays.asList("Bekő Barna", "Dzindzisz Magdalena", "Szelecsényi Lászó", "Simándi Barbara", "Szabó Viktor Lukács", "Salánki Viktor", "Vittay Dominika" ));
		names.addAll(Arrays.asList("Nezih Ozsarac", "Papp László", "Dedeó Zsófia", "Vass Sándor", "Papp Krisztina", "Csoma Márton", "Süki Ádám"));
		names.addAll(Arrays.asList("Dobi János", "Bencsik Zsombor", "Toth Mihaly Alex", "Rédly Tamás", "Székely Márton", "Kassai Ágnes"));
		List<String> orderedNames = new ArrayList<>();

		while (names.size() != 0) {
			orderedNames.add(names.get((int) (Math.random() * names.size())));
			names.remove(orderedNames.get(orderedNames.size() - 1));
		}

		for (String n : orderedNames) {
			System.out.println(n);
		}

	}
}
