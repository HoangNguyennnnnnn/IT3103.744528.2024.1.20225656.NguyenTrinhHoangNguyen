import java.util.Scanner;
//Nguyen Trinh Hoang Nguyen 20225656
public class bai6_3 {
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Nhap so n:");
		int n = keyboard.nextInt();
		for(int i = 1;i<=n;i++)
		{
			for(int j = 1;j<= n-i;j++)
			{
				System.out.print(" ");
			}
			for(int j = 1;j<= 2*i-1;j++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
		keyboard.close();
	}
}
