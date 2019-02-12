package pokemon.model;

public class Necrozma extends Pokemon implements Normal
{
public Necrozma(int number, String name)
{
	super(number, name);
}

	public void wingAttack()
	{
		System.out.println("swoosh");
	}
	public int powerLevel()
	{
		return 2000;
	}
}
