import java.lang.reflect.Array;
import java.util.ArrayList;
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

        this.password = "";

        for (int i = 0; i < this.length; i++) {
                int number = this.random.nextInt(25);
                char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(number);
                this.password += symbol;

            }

        return this.password;
    }
}
