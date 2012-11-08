/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package guessthenumberguiprogram;

/**
 *
 * @author Toshiba laptop
 */
public enum GuessEnum {
    HIGH{
        public String toString(){
            return "Your guess is too high";
        }
    },
    LOW{
        public String toString(){
            return "Your guess is too low";
        }
    },
    CORRECT{
        public String toString(){
            return "Your guess is correct";
        }
    };
    
}
