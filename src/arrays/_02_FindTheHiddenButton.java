/*****
 * 
 * Run the FndHdnBtn.jar to play the finished game
 * 
 *****/

package arrays;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
	
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_FindTheHiddenButton implements ActionListener{
	JFrame window;
	JPanel panel;
	
	//1. create an array of JButtons. Don't initialize it yet.
	JButton[] jbs; 
	//2 create an int variable called hiddenButton
	int hiddenButton;
	public static void main(String[] args) {
		new _02_FindTheHiddenButton().start();
	}
	
	public void start() {
		window = new JFrame("Find the Button");
		panel = new JPanel();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//3.  Ask the user to enter a positive number and convert it to an int
		String s = JOptionPane.showInputDialog("Give a number");
		hiddenButton = Integer.parseInt(s);
		//4. Initialize the array of JButtons to be the size of the int created in step 3
		jbs = new JButton[hiddenButton];
		//5. Make a for loop to iterate through the JButton array
			//6. initialize each JButton in the array
			//7. add the ActionListener to each JButton
			//8. add each JButton to the panel
		for(int i = 0; i < jbs.length; i++) {
			jbs[i] = new JButton();
			jbs[i].addActionListener(this);
			panel.add(jbs[i]);
		}
		//9 add the panel to the window
		window.add(panel);
		//10. call setExtendedState(JFrame.MAXIMIZED_BOTH) on your JFrame object.
		window.setExtendedState(JFrame.MAXIMIZED_BOTH);
		//11. set the JFrame to visible.
		window.setVisible(true);
		//12. Give the user the instructions for the game.
		JOptionPane.showMessageDialog(null, "find the button");
		//13. initialize the hiddenButton variable to a random number less than the int created int step 3
		Random r = new Random();
		hiddenButton = r.nextInt(hiddenButton);
		//14. Set the text of the JButton located at hiddenButton the read "ME"
		jbs[hiddenButton].setText("me");
		//15. Use Thread.sleep(100); to pause the program.
		//    Surround it with a try/catch

		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//16. Set the text of the JButton located at hiddenButton to be blank.
		jbs[hiddenButton].setText("");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonClicked = (JButton)e.getSource();
		
		//17. if the hiddenButton is clicked, tell the user that they win.
		if(a.getjbs[hiddenButton]) {
			
		}
		//18. else tell them to try again
	}
}
