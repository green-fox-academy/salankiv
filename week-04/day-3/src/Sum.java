import java.util.List;

public class Sum {
	List<Integer> list;
	int sumOfList;

	public Sum() {
	}

	public int sumMethod(List<Integer> list) {
		sumOfList = 0;
		if (list == null) {
			return 0;
		} else {
			for (int i = 0; i < list.size(); i++) {
				sumOfList += list.get(i);
			}
			return sumOfList;
		}
	}
}
