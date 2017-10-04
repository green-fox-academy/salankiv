public class Hud {
	String hud;
	Hero theHero;

	public Hud(Hero theHero) {
		this.theHero = theHero;
	}

	public String getHud() {
		return theHero.hudInfo;
	}
}
