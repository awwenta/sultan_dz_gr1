public class GameEntity {
    private int health;

    private int damage;

    private Weapon weapon;

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public WeaponType getSword() {
        return sword;
    }

    public void setSword(WeaponType sword) {
        this.sword = sword;
    }

    private WeaponType sword;

    public WeaponType getWeapon() {
        return sword;
    }

    public void setWeapon(WeaponType weapon) {
        this.sword = WeaponType.SWORD;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setDefenceType(String defenceType) {
        this.defenceType = defenceType;
    }

    public void setSuperpower(String superpower) {
        this.superpower = superpower;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getDefenceType() {
        return defenceType;
    }

    public String getSuperpower() {
        return superpower;
    }

    private String defenceType;

    private Boss Owner;

    public Boss getOwner() {
        return Owner;
    }

    public void setOwner(Boss owner) {
        Owner = owner;
    }

    private String superpower;
}
