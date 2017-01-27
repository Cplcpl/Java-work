public class Player 
{
	String name = "";
	int[] hits;
	
	public Player(String Uname, int g1, int g2, int g3, int g4, int g5)
	{
		hits = new int[5];
		
		name = Uname;
		hits[0] = g1;
		hits[1] = g2;
		hits[2] = g3;
		hits[3] = g4;
		hits[4] = g5;
	}

}

