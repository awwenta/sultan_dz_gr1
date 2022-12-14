public class Boss {
    private int health;

    private int damage;

    private String defenceType;

    public Boss(int health, int damage, String defenceType){
        this.health = 700;
        this.damage = 50;
        this.defenceType = "Physical";

    }

    public int getDamage() {
        return damage;
    }

    public int getHealth() {
        return health;
    }

    public String getDefenceType(){
        return defenceType;
    }
}
