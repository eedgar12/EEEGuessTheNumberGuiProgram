package guessthenumberguiprogram;

import java.util.Random;

/**
 *
 * @author Emma Edgar
 */
public class NumberGuessService {

//    private enum guessResult {HIGH, LOW, CORRECT};
    
    Random rnd = new Random();
    private int num; 
    private int guess;
    
    public int getNum(){
        return num;
    }
    
    public int getGuess(){
        return guess;
    }
    
    public void setGuess(int guess){
        //needs validation
        this.guess = guess;
    }
    public NumberGuessService(){
        num = new Integer(rnd.nextInt(9) + 1);
    }
    
    
    public String resultString(double guess){
        System.out.println("num: " + num + " guess: " + guess);
        if (num > guess) {
            return ("You guessed low");
        } else if (num == guess) {
            return ("You guessed correctly");
        } else if (num < guess) {
            return ("You guessed high");
        } else {
            return ("Sorry, there was an error in the program");
        }
    }
            
}
