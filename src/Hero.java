public class Hero {
    private int health;

    private int damage;

    private String superpower;

    private Hero(int health, int damage, String superpower){
        health = 400;
        damage = 10;
        superpower = "SuperJump";

    }

    public int getDamage() {
        return damage;
    }

    public int getHealth() {
        return health;
    }

    public void setSuperpower(String superpower) {
        this.superpower = superpower;
    }

    private void Hero2(int health, int damage, String superpower){
        health = 400;
        damage = 10;

    }
}