package Strategy;

public class Faulpelz extends Student {

	public Faulpelz() {
		alkoholkonsum = new TrinkeViel();
		lernverhalten = new WenigLernen();
	}
	
	@Override
	public int getMatrikelnummer() {
		
		return 254675;
	}

}


