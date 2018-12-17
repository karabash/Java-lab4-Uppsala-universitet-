package players;
/**
 * Abstract class 
 * @author #Karabash
 * @version jdk1.8.0_181
 */
public abstract class Gamer {
	private String name;
	/**
	 * This constructor forced to get a name from user
	 * @param name
	 * set user name
	 */
	public Gamer(String name) {
		this.name = name;
	}
	/**
	 * getter
	 * @return
	 * return this.name
	 */
	public String getName() {
		return name;
	}
	/**
	 *  setter
	 * @param name
	 * set a user name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
    }

