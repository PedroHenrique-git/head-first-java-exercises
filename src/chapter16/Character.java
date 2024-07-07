package chapter16;

import java.io.Serializable;
import java.util.Arrays;

public class Character implements Serializable {
    private String name;
    private CharacterType type;
    private String[] weapons;

    public Character(String name, CharacterType type, String[] weapons) {
        this.name = name;
        this.type = type;
        this.weapons = weapons;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CharacterType getType() {
        return type;
    }

    public void setType(CharacterType type) {
        this.type = type;
    }

    public String[] getWeapons() {
        return weapons;
    }

    public void setWeapons(String[] weapons) {
        this.weapons = weapons;
    }

    @Override
    public String toString() {
        return String.format("{ name: %s, type: %s, weapons: %s }", name, type.toString(), Arrays.toString(weapons));
    }
}
