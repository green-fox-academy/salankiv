public class Hud {
	Characs type;

	public Hud(Characs type) {
		this.type = type;
	}

	public String getHud() {
		return type.hudInfo;
	}
}
