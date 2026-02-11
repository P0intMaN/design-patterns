public class Main {
    public static void main(String[] args) {
        Character kingCharacter = new King(null);
        Character knightCharacter = new Knight(null);
        Character peasantCharacter = new Peasant(null);

        kingCharacter.fight();
        knightCharacter.fight();
        peasantCharacter.fight();

        //peasant acquired sword. now he can fight!
        peasantCharacter.setWeapon(new SpearWeapon());
        peasantCharacter.fight();
        
    }
}