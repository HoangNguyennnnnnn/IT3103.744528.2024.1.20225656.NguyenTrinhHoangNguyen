package hust.soict.dsai.lab01;

import java.util.Scanner;
//Nguyen Trinh Hoang Nguyen 20225656
public class bai6_6 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap so hang: ");
		int rows = sc.nextInt();
		System.out.println("Nhap so cot: ");
		int columns = sc.nextInt();
		
		int [][] matrix1 = new int[rows][columns]; 
		int [][] matrix2 = new int[rows][columns]; 
		int [][] ansMatrix = new int[rows][columns];
		
		System.out.println("Nhap cac phan tu cua ma tran thu nhat: ");
		for(int i = 0 ; i<rows ; i++)
		{
			for(int j = 0; j<columns ; j++)
			{
				matrix1[i][j] = sc.nextInt();
			}
		}
		System.out.println("Nhap cac phan tu cua ma tran thu hai: ");
		for(int i = 0 ; i<rows ; i++)
		{
			for(int j = 0; j<columns ; j++)
			{
				matrix2[i][j] = sc.nextInt();
				ansMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}
		System.out.println(" Tong cua 2 ma tran tren la: ");
		for(int i = 0 ; i<rows ; i++)
		{
			for(int j = 0; j<columns ; j++)
			{
				System.out.print(ansMatrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
