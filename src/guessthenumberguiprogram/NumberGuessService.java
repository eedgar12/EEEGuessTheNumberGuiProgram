package guessthenumberguiprogram;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JFrame;

/**
 *
 * @author Emma Edgar
 */
public class NumberGuessService implements ActionListener{

    MainGui mainGui = new MainGui();
    Random rnd = new Random();
    private int num; 
    private int guess;
    
    public int getNum(){
        return num;
    }
    
    public void setNum(int num){
        //needs validation
        this.num = num;
    }
    public int getGuess(){
        return guess;
    }
    
    public void setGuess(int guess){
        //needs validation
        this.guess = guess;
    }
    
    public NumberGuessService(){
        mainGui.setVisible(true);
        num = new Integer(rnd.nextInt(9) + 1);
    }
    
    public String resultString(double guess){
        if (num > guess) {
            return GuessEnum.LOW.toString();
        } else if (num == guess) {
            return GuessEnum.CORRECT.toString();
        } else if (num < guess) {
            return GuessEnum.HIGH.toString();
        } else {
            return ("Sorry, there was an error in the program");
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        throw new UnsupportedOperationException("Not supported yet.");
        if (e.getSource() == mainGui){
            
        }
    }
    
    
            
}
