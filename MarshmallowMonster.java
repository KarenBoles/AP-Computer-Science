
public class MarshmallowMonster {
	
	private String name;
	private int numEyes, numLegs, numArms;
	private boolean hasButtons;
	
	public MarshmallowMonster()
	{
		name = "";
		numEyes = 0;
		numArms = 0;
		numLegs = 0;
		hasButtons = false;
	}
	
	public MarshmallowMonster(String nm, int eyes, int arms, int legs, boolean button)
	{
		name = nm;
		numEyes = eyes;
		numArms = arms;
		numLegs = legs;
		hasButtons = button;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getNumArms()
	{
		return numArms;
	}
	
	public int getNumLegs()
	{
		return numLegs;
	}
	
	public int getNumEyes()
	{
		return numEyes;
	}
	
	public boolean getHasButtons()
	{
		return hasButtons;
	}
	
	public void setName(String nm)
	{
		name = nm;
	}
	
	public void setNumArms(int arms)
	{
		numArms = arms;
	}
	
	public void setNumLegs(int legs)
	{
		numLegs = legs;
	}
	
	public void setNumEyes(int eyes)
	{
		numEyes = eyes;
	}
	
	public void setHasButtons(boolean buttons)
	{
		hasButtons = buttons;
	}
	
	public String toString()
	{
		String str = "";
		if(hasButtons)
			str = " does ";
		else str = " does not ";
		return("The monster "+name+" has "+numArms+" arms, " +numLegs+" legs, " +numEyes+" eyes, and "+str+" have buttons.");
	}

}
