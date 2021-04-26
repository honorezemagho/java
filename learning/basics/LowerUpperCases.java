public class LowerUpperCases {

    public static void upperAscii(){
        StringBuilder sb = new StringBuilder(26);
        for (char ch = 'A'; ch <= 'Z'; ch++)
            sb.append(ch);
        System.out.printf("upper ascii: %s, length: %s", sb, sb.length());
    }
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(26);
        for (char ch = 'a'; ch <= 'z'; ch++)
            sb.append(ch);
            upperAscii();
        System.out.printf("lower ascii: %s, length: %s", sb, sb.length());
    }
}
