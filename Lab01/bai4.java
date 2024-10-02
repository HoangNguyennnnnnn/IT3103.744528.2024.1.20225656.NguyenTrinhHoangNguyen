package week1;

import javax.swing.JOptionPane;
//Nguyen Trinh Hoang Nguyen 20225656
public class bai4 {
	public static void main(String args[]) {
		System.out.println("Nguyen Trinh Hoang Nguyen 20225656");
		String strNum1, strNum2;
		String strNotification = "You've just entered: ";
		
		strNum1 = JOptionPane.showInputDialog(null,
				"Please input the first number: ","Input the first number",
				JOptionPane.INFORMATION_MESSAGE);
		strNotification += strNum1 + " add ";
		
		strNum2 = JOptionPane.showInputDialog(null,
				"Please input the second number: ","Input the second number",
				JOptionPane.INFORMATION_MESSAGE);
		strNotification += strNum2;
		
		JOptionPane.showConfirmDialog(null, strNotification,
				"Show two numbers",JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}
}
