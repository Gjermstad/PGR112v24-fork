package projects.game.monster_battle.src;

public class Monster extends Entity
{
    Monster(int health, int damageMin, int damageMax) {
        super(health, damageMin, damageMax);
    }

    @Override
    void entityDied() {
        System.out.println("The Monster dies!");
    }

    @Override
    public String toString() {
        return "Monster";
    }
}
