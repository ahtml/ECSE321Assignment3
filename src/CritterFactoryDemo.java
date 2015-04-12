import java.util.LinkedList;
import java.util.Scanner;


public class CritterFactoryDemo {
	
	public static void main(String [] args){
		
		LinkedList <Critter>myCritters = new <Critter>LinkedList();
		int level = 1;
		CritterFactory myCritterFactory = new CritterFactory();
		boolean nextLevel = false;
		Scanner input = new Scanner(System.in);
		
		do{ // Make at least one round of critters
			myCritterFactory.setIndexLevel(level);
			System.out.println("Current Level: " + level);
			myCritters.clear(); // Clear the critters list so that the wave does not include previous waves' critters
			for(int i=0;i<level*3;i++){ // Creating 3 times the level of critters each level
				// System.out.println(i);
				int critterType = i;
				CritterType c = myCritterFactory.determineCritterType(critterType); // Make new Critter
				Critter myCritter = myCritterFactory.makeCritter(c);
				myCritter.setIndex(i);
				myCritters.add(myCritter);
				
				myCritters.get(i).displayCritterInfo(); // Show the info about the Critters
				
			}
			System.out.print("Would you like to see the next round? (Y/N) : ");
			if(input.nextLine().toUpperCase().equals("Y")){ // Want to see a new round
				nextLevel=true;
				level++;
			}
			else{
				nextLevel = false;
			}
		}while(nextLevel); // You still want to see a new round
		
		System.out.println("Done making Critters with Factory Pattern!");
		
	}

}
