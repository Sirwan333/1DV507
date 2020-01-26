package sr222qn_assign1;

public class PrintRecursive {

	public static void main(String[] args) {
		String str = "Hello Everyone!";

		print(str, 0);
		System.out.println();
		printReverse(str, 0);
	}

	private static boolean run=false;

	private static void printReverse(String str, int n) {
		if(!run)						
		{
			n = str.length()-1;					
			run = true;
		}
		System.out.print(str.charAt(n));	
		if(n == 0) 
		{								
			return;
		}
		printReverse(str,n-1);							
	}

	private static void print(String str, int n) {
		System.out.print(str.charAt(n));	
		if(n == str.length()-1) 
		{				
			return;
		}
		print(str,n+1);					
	}
}


