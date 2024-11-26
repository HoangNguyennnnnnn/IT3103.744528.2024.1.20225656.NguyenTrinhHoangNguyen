import java.util.Scanner;
//Nguyen Trinh Hoang Nguyen 20225656
public class bai5 {
	public static void main(String args[]) {
	Scanner scanner = new Scanner(System.in);
	double number1 = scanner.nextDouble();
	double number2 = scanner.nextDouble();
	scanner.close();
	System.out.println("Tong 2 so :" + (number1+number2));
	System.out.println("So thu 1 tru so thu 2 :" +(double)(number1-number2));
	System.out.println("So thu 2 tru so thu 1 :" + (double)(number2-number1));
	System.out.println("Tich 2 so :" + number1*number2);
	System.out.println("So thu 1 chia so thu 2 :" + number1/number2);
	System.out.println("So thu 1 chia so thu 2 :" + number2/number1);
	}
}
