package projects.game.monster_battle.src;

public class Player extends Entity
{
    Player(int health, int damageMin, int damageMax) {
        super(health, damageMin, damageMax);
    }

    @Override
    void entityDied() {
        System.out.println("The Player dies!");
    }
}
