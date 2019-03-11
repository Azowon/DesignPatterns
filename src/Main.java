import State.Game;
import Strategy.*;

public class Main {

	Singelton test = Singelton.getInstance();
	Singelton test2 = Singelton.getInstance();
	
	public static void main(String... args)
	{
		Main main = new Main();
		
		//Strategy
		Faulpelz Karl = new Faulpelz();
		Karl.ausrede();
		Karl.lernen();
		Karl.trinken();
		
		//Singelton
		System.out.println(main.test.getCounter());
		System.out.println(main.test2.getCounter());

		//State
		Game game = new Game();
		game.play(); 
	}

}
