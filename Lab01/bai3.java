package week1;
import javax.swing.JOptionPane;
//Nguyen Trinh Hoang Nguyen 20225656
public class bai3 {
	public static void main(String args[]) {
		System.out.println("Nguyen Trinh Hoang Nguyen 20225656");
		String result;
		result = JOptionPane.showInputDialog("Please enter your name:");
		JOptionPane.showMessageDialog(null,"Hi " + result +" !");
		System.exit(0);
	}
}
