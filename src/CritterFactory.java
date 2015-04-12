
public class CritterFactory {
	
	private double indexLevel = 0.1; // Critters stats will change as the levels progress
	
	public Critter makeCritter(CritterType type){
		Critter critter = new Critter();
		
		switch(type){
		case NORMAL:
			critter.setHealth((int)(10*indexLevel));
			critter.setSpeed((int)(10*indexLevel));
			critter.setId(0);
			break;
		case FAST:
			critter.setHealth((int)(10*indexLevel));
			critter.setSpeed((int)(20*indexLevel));
			critter.setId(1);
			break;
		case STRONG:
			critter.setHealth((int)(20*indexLevel));
			critter.setSpeed((int)(10*indexLevel));
			critter.setId(2);
			break;
		default:
			break;
		}
		critter.calculateValue();
		return critter;
	}
	
	/**
	 * Finding out the Type of Critter to make
	 * @param i The index being passed
	 * @return The Type of Critter
	 */
	public CritterType determineCritterType(int i){
		if(i%3==0){
			return CritterType.NORMAL;
		}
		else if(i%3==1){
			return CritterType.FAST;
		}
		else if(i%3==2){
			return CritterType.STRONG;
		}
		else{
			return CritterType.NORMAL;
		}
	}
	
	/**
	 * Sets the current index which changes the parameters of health and speed according to the wave level
	 * @param indexLevel Constant by which all the parameters are multiplied by depending on the wave level
	 */
	public void setIndexLevel(int indexLevel) {
		this.indexLevel = 1+indexLevel/10.0;
	}
	
	public double getIndexLevel(){
		return this.indexLevel;
	}
	
}
