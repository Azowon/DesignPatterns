package State;

public class Level4 extends Level {

	Game game;
	
	Level4(Game main)
	{
		game = main;
	}

	@Override
	public void goRight() {
		System.out.println("Oh nein... was hast du getan.. Du stirbst jetzt");
		restart();
	}

	@Override
	public void goLeft() {
		System.out.println("Nooope");		
	}

	@Override
	public void goStraight() {
		game.victory();
	}

	@Override
	public void goBack() {
		System.out.println("Zurück zu level 3");
		game.setCurrentLevel(game.getLevel3());	
	}

	@Override
	public void restart() {
		game.setCurrentLevel(game.getLevel1());		
	}
}
