package learnjava;

public class Hero extends Parson {

	
	String sperPower;
	
	Hero(String name, int age, String sperPower)
	{
		super(name,age);
		
		this.sperPower = sperPower;
	}
}
