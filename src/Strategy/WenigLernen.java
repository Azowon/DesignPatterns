package Strategy;

public class WenigLernen implements Lernverhalten {

	@Override
	public void lernbeginn() {
		System.out.println("Dieser Student beginnt frühestens 2 Stunden vor der Klausur zu lernen");
		
	}

	@Override
	public void ausrede() {
		System.out.println("Wer sein Studium liebt, der Schiebt!");
		
	}

}
