package Strategy;

public abstract class Student{


		Lernverhalten lernverhalten;
		Alkoholkonsum alkoholkonsum;
		
		public void setLernverhalten(Lernverhalten lernen)
		{
			lernverhalten = lernen;
		}
		
		public void setAlkoholkonusm(Alkoholkonsum alki)
		{
			alkoholkonsum = alki;
		}
		
		public void lernen()
		{
			lernverhalten.lernbeginn();
		}
		public void ausrede()
		{
			lernverhalten.ausrede();
		}
		public void trinken()
		{
			alkoholkonsum.trinken();
		}
	
	
	public abstract int getMatrikelnummer();
	

}


