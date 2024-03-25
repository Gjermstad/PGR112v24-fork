package projects.game.monster_battle.src;

import java.util.ArrayList;

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
        System.out.println("The " + getCurrentMonster() + " have " + getCurrentMonster().getHealth() + " HP left.");
    }
}
