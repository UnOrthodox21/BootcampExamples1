package rihards.game;

public class Player {

    private String name;
    private Weapon weapon;
    private int health;

    Player(String name, Weapon weapon) {
        setName(name);
        setWeapon(weapon);
        setHealth(1000);
    }

    private boolean isAlive() {
        return getHealth() >= 0;
    }

    public void subtractHealth(int points) {
        if (points < getHealth() && isAlive()) {
            setHealth(getHealth() - points);
            System.out.println(getName() + " lost " + points + " points and now has " + getHealth() + " left.");
        } else if (points >= getHealth() && isAlive()) {
            setHealth(0);
            System.out.println(getName() + " just lost all points and died");
        } else {
            System.out.println(getName() + " is already dead!");
        }
    }

    public void attack(Player victim) {
        if (this.isAlive()) {
            System.out.println(name + " is attacking " + victim.getName() + " with " + getWeapon().getPower());
            victim.subtractHealth(getWeapon().getPower());
        } else {
            System.out.println(name + " is unable to attack, because he/she is dead.");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
