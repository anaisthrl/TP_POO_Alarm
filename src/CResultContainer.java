import java.awt.BorderLayout;
import java.awt.Graphics;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class CResultContainer extends JLabel {

	private String message;

	CResultContainer(String message){
		this.message = message;
	};

	
	public String getMessage() {
		return this.message;
	}
	
	public void setMessage(String newMessage) {
		System.out.println("Je set le message");
		this.message = newMessage;
	}
}
