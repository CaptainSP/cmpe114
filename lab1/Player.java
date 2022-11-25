package labq1;

public class Player
{
	private double elo;
	private String name;
	private long playerNum;
	// ---------------------------------------------------------------
	// Constructor -- initializes elo, owner, and account number
	// ---------------------------------------------------------------
	public Player(double elo,String name,long playerNum)
	{
		this.elo=elo;
		this.name=name;
		this.playerNum=playerNum;
		
	}
	
	
	
	
	// --------------------------------
	// Decrements elo by amount
	// --------------------------------
	public void decrease(double amount)
	{
		//add body of withdraw
		if(elo-amount<0 ) {
			System.out.println("this player already has 0 elo ");
		}
		else 
		{
			elo -=amount;
			
		}
	}
	
	
	
	public void increase(double amount)
	{
		//add body of withdraw
		elo+=amount;
	}
	
	// ------------------------
	// Returns elo.
	// ------------------------
	public double getelo()
	{
		return elo;
	}
	// --------------------------------------------------------------------
	// Returns a string containing the name, player number, and elo.
	// --------------------------------------------------------------------
	public String toString()
	{
		return "Name: " + name 
				+ " Player Number: " + playerNum + " Elo: " + elo;
	}
	// --------------------------------------------------
	// Each game won will increase players elo by 10.
	// --------------------------------------------------
	public double win()
	{
		elo+=10;
		return elo;
	}
	// --------------------------------------------
	// Changes the name of the player
	// --------------------------------------------
	public void changeName(String newName)
	{
		this.name = newName;
		//add body of changeName
	}
}