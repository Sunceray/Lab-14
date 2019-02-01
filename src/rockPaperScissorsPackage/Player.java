package rockPaperScissorsPackage;
 
public abstract class Player {
	private String name;
	public abstract Roshambo generateRoshambo();
	//a method that doesn't contain a body
	
	Player()  {
	}
	public Player(String name) {
		this.name = name;
	//Whatever is recieved in the paramter is setting it to name
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + "]";
	}
}
	
		
	
	
