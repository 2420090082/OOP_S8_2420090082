
public class UserNameFormatter {

    public static void main(String[] args) {
        String name = "  rAjEsh ";
        String trimmed = name.trim();
        trimmed = trimmed.toLowerCase();
        trimmed = trimmed.replace("a", "@");
        System.out.println("Formatted Name: " + trimmed);
    }
}
