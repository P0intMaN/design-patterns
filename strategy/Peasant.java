public class Peasant extends Character {
    private final String type = "Peasant";
    
    public Peasant(String name) {
        super(name);
        setWeapon(new NoWeapon());
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
