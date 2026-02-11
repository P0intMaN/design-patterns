import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public abstract class Character {
    private final String type = "Character";
    private String name;
    
    private final List<String> firstNameList = List.of(
    "Ancient", "Brazen", "Celestial", "Dauntless", "Ethereal", 
    "Fearless", "Gilded", "Hallowed", "Immortal", "Jade", 
    "Kinetic", "Luminous", "Mystic", "Noble", "Obsidian", 
    "Primal", "Quiet", "Radiant", "Stalwart", "Valiant"
    );

    private final List<String> secondNameList = List.of(
        "Achilles", "Beowulf", "Cuchulainn", "Leonidas", "Musashi", 
        "Ragnar", "Siegfried", "Xerxes", "Arthur", "Genghis", 
        "Hannibal", "Spartacus", "Ajax", "Galahad", "Attila", 
        "Boudica", "Gerard", "Roland", "Sun", "Vercingetorix"
    );

    private static Set<String> generatedNames = new HashSet<String>();  
    private static final Random random = new Random();


    // constructors
    public Character(String name) {
        if (name == null) {
            name = generateRandomName();
        }

        setName(name);
    }


    // a random character name generator
    public String generateRandomName() {
        int maximumPossibleNames = firstNameList.size() * secondNameList.size();
        String generatedName;

        if (generatedNames.size() >= maximumPossibleNames) {
            throw new IllegalStateException("All possible combinations of character names are exhausted. Please provide a name for the character.");
        }

        do {

        
                generatedName = firstNameList.get(random.nextInt(firstNameList.size()))
                                    .concat(
                                        secondNameList.get(random.nextInt(secondNameList.size()))
                                    );
        } while (generatedNames.contains(generatedName));

        System.out.println(generatedName);
        return generatedName;
        
    }

    // getters and setters
    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    abstract void fight();

}
