package sr222qn_assign4.time;

import java.util.Comparator;
import java.util.Random;
public class sortingAlgorithms {



	public static void main(String[] args) {
		int[] intArray = new int[45000];
		Random rand = new Random(100000);
		for(int i = 0;i < intArray.length; i++) {

			intArray[i] = rand.nextInt();
		}
		@SuppressWarnings("unused")
		int intArraySorted[];
		long startTime = System.currentTimeMillis();

		intArraySorted = insertionSort(intArray);

		long endTime = System.currentTimeMillis();
		int actualTime = (int) (endTime - startTime);
		System.out.println("It took "+actualTime+" millis to sort the array of 42000 intgers");

		String[] strArray = new String[22000];
		Random rand2 = new Random();
		String str = "";
		String order = "abcdefghij";
		for(int i = 0; i< 22000; i++) {								
			for (int l = 0; l < 10; l++) {
				str += order.charAt(rand2.nextInt(order.length()));	
			}
			str = "";												
			strArray[i] = str;
		}
		Comparator<String> largest = (s1,s2) -> s2.compareTo(s1);

		long startTime1 = System.currentTimeMillis();

		insertionSort(strArray, largest);

		long endTime1 = System.currentTimeMillis();
		int actualTime1 = (int) (endTime1 - startTime1);
		System.out.println("It took "+actualTime1+" millis to sort the array of 22000 strings");

	}

	public static int[] insertionSort(int[] in)  {

		for(int i=0; i<in.length-1; i++)
		{
			int num = in[i+1];
			while(i>=0 && in[i]>num)
			{
				in[i+1] = in[i]; 
				i--;
			}
			in[i+1] = num;
		}

		return in;
	}

	public static String[] insertionSort(String[] in, Comparator<String> c)  {

		for (int i = 1; i < in.length; i++) 
		{
			String str = in[i];
			int x = i - 1;
			while (x >= 0) 
			{
				if (c.compare(str,in[x]) <0 ) 
				{
					break;
				}
				in[x + 1] = in[x];
				x--;
			}
			in[x + 1] = str;
		}
		return in;

	}


}