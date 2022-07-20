import java.security.SecureRandom;
import java.util.Random;

/**
 * This is our NonPlayer Character that inherits
 * from GameCharacter it represent objects the game controls 
 * (as opposed to objects a human player controls).
 * @author 
 * @version 1.3
 * Lab1
 * CS131ON
 */
public class NonPlayerCharacter extends GameCharacter {
private boolean active;
private String intelligenceType;

public class NonPlayerCharacter ()
{
	super();
	setActive(false);
	setIntelligenceType("AVERAGE");
	}

public NonPlayerCharacter(String uniqueID, String personality, boolean active, String intelligenceType) {
	super(uniqueID, personality);
	this.active = active;
	this.intelligenceType = intelligenceType;
	}	
//
//Returns a string in given format
	public String introduce()
	{
	// "Hello, my name is NAME" Hint: Name is actually the Unique ID for the object. (Test 11 should pass.)
	return "Hello, my name is "+super.uniqueID;
	}
	//Returns a random string from the array
	public String exclaim()
	{
	String[] strArray= {"Dag Gummit","Doggone it","Holy cow","Jeez","Well cheese and crackers"};
	Random rd=new Random();
	int randomId=rd.nextInt(4);
	return strArray[randomId];
	}

	public void setActive(boolean active) {
	this.active = active;
	}

	public void setIntelligenceType(String intelligenceType) {
	this.intelligenceType = intelligenceType;
	}

	public String reportStructure()
	{
	StringBuilder str=new StringBuilder();
	str.append(super.reportStructure()).append("\n==================================\n").append("Active: ").append(active).append("\n").append("Intelligence: ").append(intelligenceType);
	str.append("\n==================================");
	return str.toString();
	}
//
}//end class
