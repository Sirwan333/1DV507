package sr222qn_assign1;

import java.util.Scanner;
import java.util.Arrays;

public class PascalMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Pick an integer: ");
		int input = sc.nextInt();
		int[] pascalR = pascalRow(input);
		System.out.println("The represntation row of Pascal’s Triangle is: " + Arrays.toString(pascalR));
		sc.close();
	}

	public static int[] pascalRow(int n) {
		int[] pascal = new int[n + 1];
		if (n == 0) 
		{
			pascal[0] = 1;
			return pascal;
		}
		int[] pascal2 = pascalRow(n - 1);
		pascal[0] = 1;
		pascal[n] = 1;
		for (int i = 1; i < pascal2.length; i++) 
		{
			pascal[i] = pascal2[i - 1] + pascal2[i];
		}
		return pascal;
	}
}
