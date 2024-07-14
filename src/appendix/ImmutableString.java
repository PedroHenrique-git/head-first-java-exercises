package appendix;

public class ImmutableString {
    public static void main(String[] args) {
        String s = "0";

        for(int i = 1; i < 10; i++) {
            s += i;
        }

        System.out.println(s);

        String str = "the text";
        String upperStr = str.toUpperCase();

        System.out.println(upperStr);

        String str1 = "customer";
        String str2 = "customer";

        System.out.println(str1 == str2);

        StringBuilder sb = new StringBuilder("0");

        for(int i = 0; i < 10; i++) {
            sb.append(i);
        }

        System.out.println(sb.toString());
    }
}
