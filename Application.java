
public class Application {

	public static void main(String[] args) {
		
		NonPlayerCharacter npc = new NonPlayerCharacter("487", "Neutral", false, "AVERAGE");
		System.out.println(npc.reportStructure());
		System.out.println(npc.introduce());
		System.out.println("Random String:"+npc.exclaim());

	}//end main

}//end class

