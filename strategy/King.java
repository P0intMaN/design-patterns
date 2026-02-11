public class King extends Character {
    
    private final String type = "King";

    public King(String name) {
        super(name);
        setWeapon(new SwordWeapon());
    }


    @Override
    public void fight() {
        useWeapon();
    }

    @Override
    public String getType() {
        return this.type;
    }

}
