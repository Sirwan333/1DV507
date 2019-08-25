package sr222qn_assign3.count_words;

import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class IdentyfyWordsMain {
	
		public static void main(String[] args) throws IOException {
			
			try{ File inputFile = new File(args[0]);
			Scanner sc = new Scanner(inputFile);
			
			File outFile = new File("C:\\Users\\serwa\\eclipse-workspace\\java_courses\\1DV507\\src\\sr222qn_assign3\\count_words\\Words.txt"); 
			FileWriter witer = new FileWriter(outFile); 
			BufferedWriter bWriter = new BufferedWriter(witer); 

			while (sc.hasNext()) 
			{ 
				String str = sc.nextLine();
				str = str.replaceAll("[^A-Za-z-\']", " "); 
				bWriter.write(str);
			}
			sc.close();
			bWriter.close();
			}catch (FileNotFoundException e) {
	            System.out.println("The file is not found");
	            e.printStackTrace();
	        } 
			
			
		}
		

	

}
