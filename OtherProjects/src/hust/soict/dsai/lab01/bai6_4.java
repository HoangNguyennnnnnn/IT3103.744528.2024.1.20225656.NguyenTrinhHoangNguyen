package hust.soict.dsai.lab01;
import java.util.Arrays;
import java.util.Scanner;
//Nguyen Trinh Hoang Nguyen 20225656
public class bai6_4 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String[] Jan = {"January","Jan.","Jan","1"};
		String[] Fer = {"February","Feb.","Feb","2"};
		String[] Mar = {"March","Mar.","Mar","3"};
		String[] Apr = {"April","Apr.","Apr","4"};
		String[] May = {"May","5"};
		String[] Jun = {"June","Jun","6"};
		String[] Jul = {"July","Jul","7"};
		String[] Aug = {"August","Aug.","Aug","8"};
		String[] Sep = {"September","Sept.","Sep","9"};
		String[] Oct = {"October","Oct.","Oct","10"};
		String[] Nov = {"November","Nov.","Nov","11"};
		String[] Dec = {"December","Dec.","Dec","12"};
		String strMonth;
		String strYear;
		int month = 0;
		int year;
		int days;
		while(month == 0) 
		{
			System.out.println("Nhap thang: ");
			strMonth = sc.nextLine();
			if(Arrays.asList(Jan).contains(strMonth)) month =1;
			else if(Arrays.asList(Fer).contains(strMonth)) month =2;
			else if(Arrays.asList(Mar).contains(strMonth)) month =3;
			else if(Arrays.asList(Apr).contains(strMonth)) month =4;
			else if(Arrays.asList(May).contains(strMonth)) month =5;
			else if(Arrays.asList(Jun).contains(strMonth)) month =6;
			else if(Arrays.asList(Jul).contains(strMonth)) month =7;
			else if(Arrays.asList(Aug).contains(strMonth)) month =8;
			else if(Arrays.asList(Sep).contains(strMonth)) month =9;
			else if(Arrays.asList(Oct).contains(strMonth)) month =10;
			else if(Arrays.asList(Nov).contains(strMonth)) month =11;
			else if(Arrays.asList(Dec).contains(strMonth)) month =12;
			else
			{
				System.out.println("Thang khong xac dinh. Vui long nhap lai:");
			}
		}
		//Nhap nam va kiem tra nam co hop le
		while(true)
		{
			System.out.println("Nhap nam: ");
			strYear = sc.nextLine();
			
			if(!strYear.matches("\\d+"))
			{
				System.out.println("Nam khoong xac dinh. Vui long nhap lai:");
				continue;
			}
			year = Integer.parseInt(strYear);
			if(year <0)
			{
				System.out.println("Nam khoong xac dinh. Vui long nhap lai:");
				continue;
			}else break;
		}
		if(month == 2)
		{
			if((year % 4 == 0 && year %100 != 0)|| year % 400 == 0)
			{
				days = 29;
			}
			else
			{
				days =28;
			}
		}
		else if(month == 1||month == 3||month == 5||month == 7||month == 8||month == 10||month == 12)
		{
			days =31;
		}
		else
		{
			days = 30;
		}
		System.out.println("Thang " + month +" nam " + year + " co " +days +" ngay.");
		sc.close();
	}
}
