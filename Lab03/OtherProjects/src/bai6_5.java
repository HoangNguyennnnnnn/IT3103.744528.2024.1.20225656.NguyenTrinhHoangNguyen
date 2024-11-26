import java.util.Arrays;
import java.util.Scanner;
//Nguyen Trinh Hoang Nguyen 20225656
public class bai6_5 {
	public static void bubbleSort(int[] arr)
	{
		boolean swapped = false;
		for(int i = 0;i< arr.length -1;i++)
		{
			swapped = false;
			for(int j = 0;j< arr.length -i -1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j]= arr[j+1];
					arr[j+1] = temp;
					swapped =true;
				}
			}
			if(!swapped)
			{
				break;
			}
		}
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		float average = 0;
		System.out.println("Nhap so luong phan tu: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		System.out.println("Nhap lan luot cac phan tu cua mang: ");
		for(int i = 0;i<size;i++)
		{
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		sc.close();
		average = (float)sum / (float)arr.length;
		bubbleSort(arr);
		System.out.println("Mang duoc sap xep la: " + Arrays.toString(arr));
		System.out.println("Gia tri trung binh cua mang duoc sap xep la: " + average);
		System.out.println("Tong cua cac phan tu trong mang: " + sum);
	}
	
}
