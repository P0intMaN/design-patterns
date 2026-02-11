public class NoWeapon implements WeaponsInterface {
    
    private final String type = "None";
    private final int hitPoint = 0;


    @Override
    public void damage(Character c) {
        System.out.println(String.format("%s attacks with Weapon used: %s | Damage dealt: %s", c.getType(), getType(), getHitPoint()));
    }



    // getters and setters
    public String getType() {
        return type;
    }
    public int getHitPoint() {
        return hitPoint;
    }
}
