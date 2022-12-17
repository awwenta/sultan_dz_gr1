public class Boss extends GameEntity {
    private int health;

    private int damage;

    private String defenceType;

    private WeaponType weaponType;

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    public Boss(int health, int damage, String defenceType){
        this.health = 700;
        this.damage = 50;
        this.defenceType = "Physical";
        this.setWeapon(WeaponType.SWORD);

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
