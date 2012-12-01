package guessthenumberguiprogram;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author Emma Edgar
 */
public class GuiTemplate extends JFrame implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
    //public void actionPerformed(ActionEvent ae) {
//          // The ActionEvent object (ae) has info about the event.
//          // You have two options to determine what triggered the event: ae.getSource() or
//          // ae.getActionCommand(). The later is only used if you
//          // first set the action command String
//		if(ae.getSource() == btnGuess) {
//			
//		} else if(ae.getSource() == button2) {
//                    // hide button 2
//                    button2.setVisible(false);
//                } else {
//                    // if this is a long running task create a separate thread
//                    // to do the work on an anonyous inner class:
//                    Thread t = new Thread() {
//                        public void run() {
//                            // long running code here
//                        }
//                    };
//                    t.start();
//                }
//	}
    }

}
