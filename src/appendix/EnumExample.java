package appendix;

enum Member {
    KEVIN,
    BOB,
    STUART
}

public class EnumExample {
    public static Member selectedBandMember;

    public static void main(String[] args) {
        if(selectedBandMember == Member.KEVIN) {
            System.out.println("Hello, Kevin!");
        }
    }
}
