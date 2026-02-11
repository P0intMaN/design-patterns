public class Knight extends Character {

    private final String type = "Knight";
    

    public Knight(String name) {
        super(name);
        setWeapon(new SpearWeapon());
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
