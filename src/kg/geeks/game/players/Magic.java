package kg.geeks.game.players;

public class Magic extends Hero {
    private int boost;

    public Magic(int health, int damage, String name, int boost) {
        super(health, damage, SuperAbility.BOOST, name);
        this.boost = boost;
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (Hero hero : heroes) {
            int newAttack = hero.getDamage() + boost;
            hero.setDamage(newAttack);
        }
        System.out.println("Magic использовал способность BOOST. Атака всех героев увеличилась на " + boost);

    }
}
