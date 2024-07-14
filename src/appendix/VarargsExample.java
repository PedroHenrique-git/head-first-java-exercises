package appendix;

public class VarargsExample {
    public static void main(String[] args) {
        printAllStrings("Pedro ", "Henrique ", "Da ", "Silva");
    }

    public static void printAllStrings(String...strings) {
        for(String str : strings) {
            System.out.println(str);
        }
    }
}
