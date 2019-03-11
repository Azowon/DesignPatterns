package State;

public class Level1 extends Level {
	Game game;
	
	Level1(Game main)
	{
		game = main;
	}

	@Override
	public void goRight() {
		System.out.println("Rechts ist eine Sackgasse");
		
	}

	@Override
	public void goLeft() {
		System.out.println("Links ist ein Abgrund");		
	}

	@Override
	public void goStraight() {
		System.out.println("Hier geht es weiter: Level2");
		game.setCurrentLevel(game.getLevel2());
	}

	@Override
	public void goBack() {
		System.out.println("Hinter dir ist eine Wand");		
	}

	@Override
	public void restart() {
		game.setCurrentLevel(game.getLevel1());
	}
}
