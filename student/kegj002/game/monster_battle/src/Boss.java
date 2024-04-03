package projects.game.monster_battle.src;

public class Boss extends Monster
{
    public Boss(int health, int damageMin, int damageMax) {
        super(health, damageMin, damageMax);
    }

    @Override
    void entityDied() {
        System.out.println("The Boss dies!");
    }

    @Override
    public String toString() {
        return "Boss";
    }
}
