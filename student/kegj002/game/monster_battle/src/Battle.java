package projects.game.monster_battle.src;

public class Battle
{
    //# Fields
    private final Player player;
    private Monster monster;

    //# Constructors
    Battle(Player player, Monster monster) {
        this.player = player;
        this.monster = monster;
    }


    //# Getter-methods
    Player getPlayer() {
        return this.player;
    }

    Monster getCurrentMonster() {
        return this.monster;
    }

    //# Methods
    void playerAttacks() {
        int playerDamage = player.getDamage();
        System.out.println("The Player attacks the " + getCurrentMonster() + " and does " + playerDamage + " damage.");

        if (getCurrentMonster().takeDamage(playerDamage)) {
            System.out.println("The " + getCurrentMonster() + " have " + getCurrentMonster().getHealth() + " HP left.");
        } else {
            getCurrentMonster().entityDied();
        }
    }

    void monsterAttacks() {
        int monsterDamage = monster.getDamage();
        System.out.println("The Monster attacks the player for " + monsterDamage + " damage.");
        player.takeDamage(monsterDamage);
        System.out.println("The Player has " + player.getHealth() + " HP left.");
    }

    boolean checkIfDead() {
        if (!getCurrentMonster().isDead() || !player.isDead()) {
            return true;
        } else {
            return false;
        }
    }
}
