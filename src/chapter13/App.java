package chapter13;

public class App {
    public static void main(String[] args) {
        MiniMiniMusicApp app = new MiniMiniMusicApp();
        MusicTest1 mt = new MusicTest1();
        mt.play();

        app.play();

        System.out.println(throwsException(1));
    }

    public static String throwsException(int value) {
        try {
            if(value == 5) {
                return "Success!";
            } else {
                throw new Exception("Invalid value");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());

            return throwsException(value + 1);
        }
    }
}
