package kg.geeks.game.players;

public class Berserk extends Hero {
    private int blockedDamage;

    public Berserk(int health, int damage, String name) {
        super(health, damage, SuperAbility.SAVE_DAMAGE_AND_REVERT, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        if (boss.getDefence() != SuperAbility.SAVE_DAMAGE_AND_REVERT) {
            int additionalDamage = blockedDamage + boss.getDamage() / 5;
            System.out.println("Berserk использовал способность SAVE_DAMAGE_AND_REVERT и нанес дополнительный урон боссу: " + additionalDamage);
        } else {
            blockedDamage = 0;

        }

    }

    public void setBlockedDamage(int blockedDamage) {
        this.blockedDamage = blockedDamage;
    }
}
