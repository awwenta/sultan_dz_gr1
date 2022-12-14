public class Main {
    public static void main(String[] args) {
        Boss c1 = new Boss(700, 50, "Physical");
        int bossHealth = c1.getHealth();
        int bossDamage = c1.getDamage();
        String bossDefence = c1.getDefenceType();

        System.out.println("Health: " + bossDefence);
        System.out.println("Damage: " + bossDamage);
        System.out.println("Defence: " + bossDefence);
    }
}
