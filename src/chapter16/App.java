package chapter16;

import java.io.*;

public class App {
    private static final String fileName = "game.ser";

    public static void main(String[] args) {
        Character human = new Character("human", CharacterType.HUMAN, new String[]{"axe"});
        Character troll = new Character("troll", CharacterType.TROLL, new String[]{"bat"});
        Character elf = new Character("elf", CharacterType.ELF, new String[]{"sword"});

        File d = new File("directory");
        var result = d.mkdir();

        System.out.println("result -> " + result);

        //System.out.println(f.isDirectory());

        if(d.isDirectory()) {
            String[] dirContents = d.list();

            for(String dirContent : dirContents) {
                System.out.println(dirContent);
            }
        }

        Character[] c = new Character[]{human, troll, elf};

        //saveCharacters(c);
        //readCharacters(c.length);
    }

    public static void saveCharacters(Character[] characters) {
        try {
            FileOutputStream fileStream = new FileOutputStream(fileName);
            ObjectOutputStream os = new ObjectOutputStream(fileStream);

            for(Character c : characters) {
                os.writeObject(c);
            }

            os.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void readCharacters(int numberOfCharacters) {
        try {
            FileInputStream fileStream = new FileInputStream(fileName);
            ObjectInputStream os = new ObjectInputStream(fileStream);

            for(int i = 0; i < numberOfCharacters; i++) {
                Character c = (Character) os.readObject();

                System.out.println(c.toString());
            }

            os.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
