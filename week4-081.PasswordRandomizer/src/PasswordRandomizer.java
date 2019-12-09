import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    String password = "";
    int length = 0;
    Random random = new Random();

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length = length;
    }

    public String createPassword() {
        // write code that returns a randomized password
        int count = 0;
        while (count <= this.length) {
            int ran = random.nextInt(24);
            char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(number);
        }
        return "";
    }
}
