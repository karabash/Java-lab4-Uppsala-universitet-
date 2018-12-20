package vocabulary_lesson_game;

/**
 * Abstract class enum
 * @author #Karabash
 * @version jdk1.8.0_181
 */
 
public  enum  SwedishVocabulary {
    BIL("car"), HUS("house"), SPRINGA("run"), BLÅ("blue"), 
    BAKA("bake"), HOPPA("jump"), SIMMA("swim"), MÅNE("moon"),
    VÄG("road"), SNÄLL("kind"); 
	private String englishValueofSwedishV;
	
	// constructor must has a parameter!
	private SwedishVocabulary(String englishValueofSwedishV) {
		this.englishValueofSwedishV = englishValueofSwedishV;
	}
	
	public String getValue() {
		return this.englishValueofSwedishV;
	}
}