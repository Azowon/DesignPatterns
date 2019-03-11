package State;

public class Level3 extends Level {

	Game game;
	
	Level3(Game main)
	{
		game = main;
	}

	@Override
	public void goRight() {
		System.out.println("2x Rechts? Erscheint unwahrscheinlich... Gehe zurück...");
		game.setCurrentLevel(game.getLevel2());	
	}

	@Override
	public void goLeft() {
		System.out.println("Yeha! Level4!");
		game.setCurrentLevel(game.getLevel4());	
	}

	@Override
	public void goStraight() {
		System.out.println("Eine Unsichtbare Barriere versperrt dir den Weg.");		
	}

	@Override
	public void goBack() {
		System.out.println("Ein Zettel mit der Aufschrift: NICHT 3X RECHTS!");		
	}

	@Override
	public void restart() {
		game.setCurrentLevel(game.getLevel1());		
	}
}
