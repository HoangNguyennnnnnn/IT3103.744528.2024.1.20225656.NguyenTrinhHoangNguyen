package hust.soict.dsai.lab01;
import javax.swing.JOptionPane;
//Nguyen Trinh Hoang Nguyen 20225656
public class ChossingOption {
	
	public static void main(String args[])
	{
		int option = JOptionPane.showConfirmDialog(null,
				"Do you want to change to the first class ticket?");
		
		JOptionPane.showMessageDialog(null, "You've chosen: "
				+ (option==JOptionPane.YES_OPTION?"YES":"NO"));
		System.exit(0);
	}
}
