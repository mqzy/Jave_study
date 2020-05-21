public class RegularExpression {
    public static void main(String[] args) {
        String regex1 = "\\d{11}";
        String regex2 = "\\p{Digit}{11}";
        String s1 = "12345678900";
        if (s1.matches(regex2)){
            System.out.println("ok");
        }else {
            System.out.println("ojbk");
        }
    }
}
