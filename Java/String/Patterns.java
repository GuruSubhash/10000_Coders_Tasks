import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Patterns {
    public static void main(String[] args) {
        Pattern p= Pattern.compile("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[!@#$%^&*]).{8,}$");
        Matcher m= p.matcher("Name@12345");
        boolean b= m.matches();
        System.out.println(b);
    }
}
