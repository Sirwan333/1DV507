package sr222qn_assign3.sort;
import java.util.Comparator;
import java.util.Arrays;

public class SortingAlgorithms {

	public static void main(String[] args) {
		int[] intArray = {5, 10, 22, 1, 6, 28, 169};
		
		//Comparator<String> largest = (s1,s2) -> s2.compareTo(s1); 
		//String[] str = {"s", "l", "re", "fe", "q", "a"};

		System.out.println(Arrays.toString(insertionSort(intArray)));
		//System.out.println(Arrays.toString(insertionSort(str,largest)));
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
