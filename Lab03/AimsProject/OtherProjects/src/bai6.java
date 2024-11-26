//Nguyen Trinh Hoang Nguyen 20225656

import javax.swing.*;
import java.util.Scanner;
public class bai6 {
	public static void main(String args[])
	{
		String tmp = JOptionPane.showInputDialog(null,"Lua chon:\n"
				+ "1,Phuong trinh bac 1\n"
				+ "2,Phuong trinh bac 2\n"
				+ "3,He phuong trinh bac 1", "MENU",
				JOptionPane.INFORMATION_MESSAGE);
		int select  = Integer.parseInt(tmp);
		if(select == 1)
		{
			Scanner scanner1 = new Scanner(System.in);
			System.out.println("Giai phuong trinh ax+b=0\n"
					+ "Nhap a:");
			double a = scanner1.nextDouble();
			System.out.println("Nhap b");
			double b = scanner1.nextDouble();
			scanner1.close();
			if(a == 0 )
			{
				if (b == 0)
				{
					System.out.println("Phuong trinh co vo so nghiem");
				}else
				{
					System.out.println("Phuong trinh vo nghiem");
				}
			}else
			{
				System.out.println("Phuong trinh tren co nghiem duy nhat la :" + ((-b)/a));
			}
		}else if(select == 2)
		{
			Scanner scanner2 = new Scanner(System.in);
			System.out.println("Giai phuong trinh ax^2+bx+c=0\n"
					+ "Nhap a:");
			double a = scanner2.nextDouble();
			System.out.println("Nhap b");
			double b = scanner2.nextDouble();
			System.out.println("Nhap c");
			double c = scanner2.nextDouble();
			scanner2.close();
			if(a==0)
			{
				if(b == 0)
				{
					if(c==0)
					{
						System.out.println("Phuong trinh co vo so nghiem");
					}else
					{
						System.out.println("Phuong trinh vo nghiem");
					}
				}else
				{
					System.out.println("Phuong trinh co 1 nghiem duy nhat:"+(-c/b));
				}
			}else
			{
				double delta = b*b-4*a*c;
				if(delta<0) 
				{
					System.out.println("Phuong trinh vo nghiem");
				}else
				{
					if(delta == 0)
					{
						System.out.println("Phuong trinh co 1 nghiem kep :"+ (-b/(2*a)));
					}else if(delta > 0)
					{
						System.out.println("Phuong trinh co 2 nghiem phan biet \n x1:"+
					(-b+Math.sqrt(delta))/(2*a)+ 
					"\n x2:"+ (-b-Math.sqrt(delta))/(2*a));
					}
				}
			}
		}else if (select == 3)
		{
			Scanner scanner3 = new Scanner(System.in);
			System.out.println("Giai he phuong trinh \n a1x+b1y=c1\n a2x+b2y=c2\n"
					+ "Nhap a1:");
			double a1 = scanner3.nextDouble();
			System.out.println("Nhap b1");
			double b1 = scanner3.nextDouble();
			System.out.println("Nhap c1");
			double c1 = scanner3.nextDouble();
			System.out.println("Nhap a2");
			double a2 = scanner3.nextDouble();
			System.out.println("Nhap b2");
			double b2 = scanner3.nextDouble();
			System.out.println("Nhap c2");
			double c2 = scanner3.nextDouble();
			scanner3.close();
			double D = a1*b2 - a2*b1;
			double Dx = c1*b2 - c2*b1;
			double Dy = a1*c2 - a2*c1;
			if(D != 0)
			{
				System.out.println("He phuong trinh co nghiem duy nhat x:" + (Dx/D)+ " y:"+(Dy/D));
			}else if(D == 0 &&(Dx != 0 || Dy != 0))
			{
				System.out.println("He phuong trinh vo nghiem");
			}else if(D ==0 && Dx == 0 && Dy == 0)
			{
				System.out.println("He phuong trinh vo so nghiem");
			}
		}
		
	}
}
