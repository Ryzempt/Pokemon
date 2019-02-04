package pokemon.model;

public class OtherMonster extends Pokemon implements Normal
{
	public OtherMonster(int num, String pokename)
	{
		super(num,pokename);
	}
	
	public void bite()
	{
		System.out.println("My Move is Greater than yours " + this.getAttackPoints());
	}
	
	public int ultraLevel()
	{
		return this.getHealthPoints();
	}

	@Override
	public void wingAttack()
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public int powerLevel()
	{
		// TODO Auto-generated method stub
		return 0;
	}
}



