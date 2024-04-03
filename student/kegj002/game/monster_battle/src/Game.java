package projects.game.monster_battle.src;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Random;

public class Game
{
    //# Fields
    private final ArrayList<Monster> monsters;
    private final Battle battle;


    //# Constructors
    Game(Player player, ArrayList<Monster> monsters) {
        this.monsters = monsters;
        this.battle = new Battle(player, monsters.getFirst());
    }


    void start() {
        //# Start the game

        // The player battles against the monsters until:
        // - all monsters have dies
        // - or the player dies

        System.out.println("*Game starting*");
        System.out.println("This game is between " + getPlayer() + " and " + getMonstersLeft() + " monsters/bosses.");
        System.out.println(getPlayer() + " have " + getPlayer().getHealth() + " HP.");
        System.out.println("First monster have " + getMonsters().getFirst().getHealth() + " HP.");
        System.out.println("FIGHT!");
    }

    void runGame() {

        while (battle.getPlayer().getHealth() > 0) {
            battle.playerAttacks();

            if (battle.getCurrentMonster().getHealth() <= 0) {
                removeCurrentMonsterIfDead();

                if (monsters.size() > 0) {
                    sendNextMonsterToBattle();
                    announceNewMonster();
                } else {
                    System.out.println("You Win! Congratulations!");
                    break;
                }
            }

            battle.monsterAttacks();

            if(!getPlayer().isDead()) {
                System.out.println("You have lost and the " + getMonsters().getFirst() + " dances on your corpse.");
                break;
            }
        }
    }


    //# Getter-methods
    ArrayList<Monster> getMonsters() {
        return this.monsters;
    }

    Battle getBattle() {
        return this.battle;
    }

    Player getPlayer() {
        return this.getBattle().getPlayer();
    }

    int getMonstersLeft() {
        return this.getMonsters().size();
    }

    //# Static-methods
    static int getRandomDamage(int max) {
        return Game.getRandomDamage(0, max);
    }

    static int getRandomDamage(int min, int max) {
        Random RNG = new Random();

        return RNG.nextInt(max - min) + min;
    }

    //# Methods
    void removeCurrentMonsterIfDead() {
        monsters.remove(0);
        // System.out.println("*Removes monster from ArrayList, new length is " + monsters.size() + ".*");
    }

    void sendNextMonsterToBattle() {
        battle.setMonster(monsters.getFirst());
    }

    public Monster getNextMonster() {
        if (!monsters.isEmpty()) {
            return  monsters.get(0);
        } else {
            return null;
        }
    }

    public void announceNewMonster() {
        System.out.print("A new " + getMonsters().getFirst() + " enters the field. ");
        System.out.println("This " + getMonsters().getFirst() + " has " + getMonsters().getFirst().getHealth() + " HP.");
    }
}
