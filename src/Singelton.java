
public class Singelton {

	private int instancecounter = 0; 
	static int counter =0 ;
	static Singelton instance;
	
	static
	{
		counter++;
		instance = new Singelton(counter);
	}
	
	public static Singelton getInstance()
	{
		return instance;
	}
	
	
	private Singelton(int counter)
	{
		instancecounter = counter;
	}
	
	public int getCounter()
	{
		return instancecounter;
	}
	
	
}
