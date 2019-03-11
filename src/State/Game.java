package State;

import java.util.Scanner;

import javax.swing.text.DefaultEditorKit.DefaultKeyTypedAction;

public class Game {

	Level1 lvl1 = new Level1(this);
	Level2 lvl2 = new Level2(this);
	Level3 lvl3 = new Level3(this);
	Level4 lvl4 = new Level4(this);
	Level currentLevel=lvl1;
	
	public Level1 getLevel1()
	{
		return lvl1;
	}
	public Level2 getLevel2()
	{
		return lvl2;
	}
	public Level3 getLevel3()
	{
		return lvl3;
	}
	public Level4 getLevel4()
	{
		return lvl4;
	}
	
	
	
	public void setCurrentLevel(Level level)
	{
		currentLevel = level;
	}
	
	public void victory()
	{
		System.out.println("Sie haben gewonnen!");
		System.exit(0);
	}
	
	
	
	public void play()
	{
		Scanner scan = new Scanner(System.in);
		while(true)
		{
			if(currentLevel == lvl1)
			{
				System.out.println("Wilkommen in Level 1!");
			}
			System.out.println();
			System.out.println("Bitte geben sie WASD für die Steuerung ein oder r für Restart");
			String movement = scan.nextLine();
			char current = movement.charAt(0);
			
			switch(current)
			{
			case 'w': currentLevel.goStraight(); break;
			case 'a': currentLevel.goLeft(); break;
			case 's': currentLevel.goBack(); break;
			case 'd': currentLevel.goRight(); break;
			case 'r': currentLevel.restart(); break;
			default: System.out.println("Ungültige Eingabe"); break;
				
			}
		}
		
	}
}
