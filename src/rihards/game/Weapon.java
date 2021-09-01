package rihards.game;

public class Weapon {
    private int power;
    private String name;

    Weapon() {
        setPower(5);
        setName("Axe");
    }

    Weapon(int power, String name) {

        if (power >= 1 && power <= 10) {
            setPower(power);
        } else {
            setPower(5);
        }

        if (name.length() >= 4 && name.length() <= 20) {
            setName(name);
        } else {
            setName("Axe");
        }

    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
