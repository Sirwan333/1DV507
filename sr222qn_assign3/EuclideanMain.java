package sr222qn_assign3;
import java.util.Scanner;
public class EuclideanMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Pleas provide two intgers:\nInput1: ");
		int input1 = scan.nextInt();
		System.out.println("Input2: ");
		int input2 = scan.nextInt();
		System.out.println("Greatest Common Divisor (GCD) of "+input1+" and "+input2+" is: " + EuclideanAlgorithm(input1,input2));
		
		scan.close();
	}

		public static int EuclideanAlgorithm(int input1, int input2){
			while( input2!= 0)
			{
				int a = input2;
				input2 = input1%input2;
				input1 = a;
			}
			return input1;

	}

}
