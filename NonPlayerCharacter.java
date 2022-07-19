import java.security.SecureRandom;

/**
 * This is our NonPlayer Character that inherits
 * from GameCharacter it represent objects the game controls 
 * (as opposed to objects a human player controls).
 * @author Aaron McCarley
 * @version 1.1
 * Lab1 Program 1
 * CS131ON
 */
 /**This is a sub class of GameCharacter **/
	public class NonPlayerCharacter extends GameCharacter {
	//Instance variables
		private boolean active;
		private String intelligenceType;

		public NonPlayerCharacter()
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
		
		public String introduce()
		{
	// The Unique ID "Hello, my name is NAME" Hint: Name is actually the Unique ID for the object.
			return "Hello, my name is "+super.uniqueID; 
		}
	//Returns random string from the array
		public String exclaim()
		{
			String[] strArray= {"Dag Gummit","Doggone it","Holy cow","Jeez","Well cheese and crackers"};
			SecureRandom randm=new SecureRandom();
			int randomId=randm.nextInt(4);
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

}//end class
