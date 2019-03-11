package State;

public class Level2 extends Level {

	Game game;
	
	Level2(Game main)
	{
		game = main;
	}

	@Override
	public void goRight() {
		System.out.println("Hier geht es weiter: Level3");
		game.setCurrentLevel(game.getLevel3());
	}

	@Override
	public void goLeft() {
		System.out.println("Ahhhh schlangen");		
	}

	@Override
	public void goStraight() {
		System.out.println("Da steht ein Oger. Da willst du nicht lang gehen!");		
	}

	@Override
	public void goBack() {
		System.out.println("Zurück zu Level 1...");
		game.setCurrentLevel(game.getLevel1());
	}

	@Override
	public void restart() {
		game.setCurrentLevel(game.getLevel1());
	}
}
