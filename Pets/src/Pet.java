
public class Pet {
		private String name;
		private String animalType;
		private boolean alive;
		private double health;
		private double hunger;
	public Pet(){
		name ="";
		animalType ="";
		alive = true;
		health=0;
		hunger=0;
	}
	public Pet(String name,String animalType,boolean alive,double health,double hunger){
		this.name=name;
		this.animalType=animalType;
		this.alive=alive;
		this.health=health;
		this.hunger=hunger;
	}
	public String getName(){
		return name;
	}
	public String getAnimalType(){
		return animalType;
	}
	public boolean getAlive(){
		return alive;
	}
	public double getHealth(){
		return health;
	}
	public double getHunger(){
		return hunger;
	}
	public void setAlive(boolean alive){
		this.alive =alive;
	}
	public void setHealth(double health){
		this.health=health;
	}
	public void setHunger(double hunger){
		this.hunger=hunger;
	}
	public void feed(double food){
		this.hunger=0.0;
		this.health=100.0;
	}
	@Override
	public String toString(){	
		return "My "+animalType+" is named "+name+". They are "+hunger+"% hungry and have "+health+"% health. Are they alive? "+alive;
	}
}
