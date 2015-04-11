
public abstract class Critter {
	
	private int health;
	private int speed;
	private int position;
	private int id;
	private int value;
	private boolean isAlive;
	
	// GETTERS AND SETTERS
	public boolean isAlive() {
		return isAlive;
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
	
	public void calculateValue(){
		value = (health+speed)*(id+1);
	}

}
