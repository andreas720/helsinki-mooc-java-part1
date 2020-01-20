import java.util.Scanner;

public class HangmanLogic {

    private String word;
    private String guessedLetters;
    private int numberOfFaults;


    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }

    public void guessLetter(String letter) {

        for (char guessedL : letter.toCharArray()) {
            if (this.guessedLetters.contains("" + guessedL)) {
            } else if (word.contains(letter)) {
                this.guessedLetters += letter;
            } else {
                this.guessedLetters += letter;
                this.numberOfFaults++;
            }
        }

        // program here the functionality for making a guess

        // if the letter has already been guessed, nothing happens

        // it the word does not contains the guessed letter, number of faults increase
        // the letter is added among the already guessed letters
    }

    public String hiddenWord() {


        String wordAtStart = "";
        String hiddenWordRevealed = "";


        if (this.guessedLetters.equals("")) {
            for (char c : this.word.toCharArray()) {
                wordAtStart += "_";
            }
            return wordAtStart;
        } else {
            for (char c : this.word.toCharArray()) {
                if (this.guessedLetters.contains("" + c)) {
                    hiddenWordRevealed = hiddenWordRevealed + "" + c;
                } else {
                    hiddenWordRevealed += "_";
                }
            }
        }

        return hiddenWordRevealed;


//        this.word = hiddenWord()
        // program here the functionality for building the hidden word

        // create the hidden word by iterating through t
        // his.word letter by letter
        // if the letter in turn is within the guessed words, put it in to the hidden word
        // if the letter is not among guessed, replace it with _ in the hidden word

        // return the hidden word at the end
    }
}
