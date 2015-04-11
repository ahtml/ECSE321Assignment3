
public class Critter {
	
	private int health;
	private int speed;
	private int position;
	private int id;
	private int index;
	private int value;
	private boolean isAlive;
	
	// GETTERS AND SETTERS
	public boolean isAlive() {
		return isAlive;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position = position;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public void moving(){ // Use to move through path
		// Not needed for the assignment
	}
	
	/**
	 * Determine the value of the Critter once it is killed
	 */
	public void calculateValue(){ 
		value = (health+speed)*(id+1);
	}
	
	public int removeHealth(){ // The amount of health removed by the player if the critter reaches the end
		return (health+speed)*(id+1);
	}
	
	/**
	 * Displays the info about the Critter
	 */
	public void displayCritterInfo(){
		System.out.println("Critter Index: " + getIndex() +  "\nCritter ID: " + getId() + "\nHealth: " + getHealth() + "\nSpeed: " + getSpeed() + "\nValue: " + getValue());
	}
	

}
