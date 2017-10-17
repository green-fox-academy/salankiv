public class Gnirts implements CharSequence{
	String string;

	public Gnirts(String string) {
		this.string = string;
	}

	public static void main(String[] args) {
		Gnirts g = new Gnirts("example");
		System.out.println(g.charAt(0));
// should print out: l
	}

	@Override
	public int length() {
		return this.string.length();
	}

	@Override
	public char charAt(int i) {
		return this.string.charAt(this.length() - 1 - i);
	}

	@Override
	public CharSequence subSequence(int i, int i1) {
		return null;
	}
}
