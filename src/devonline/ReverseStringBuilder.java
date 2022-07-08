package devonline;

public class ReverseStringBuilder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("!dlrow olleH");
        String myString = builder.reverse().toString();
        System.out.println(myString);
    }
}
