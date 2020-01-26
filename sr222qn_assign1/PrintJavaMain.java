package sr222qn_assign1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.lang.StringBuilder;
import java.util.List;

public class PrintJavaMain {
	public static void main(String[] args) {

		try {
			checkException(args);
			File f1 = new File(args[0]);
			PrintAllJavaFiles(f1);
		}
		catch (Exception e) {
			System.out.println(e);
		}

	}

	public static void checkException(String[] args) throws IllegalArgumentException {
		if (args.length == 0) 
		{
			throw new IllegalArgumentException("Please insert path");
		}
	}

	private static int sub = 0; 
	public static void PrintAllJavaFiles(File directory) throws IOException {
		if (directory.isDirectory()) 
		{
			toSort(directory);
			sub++;
			File[] listF = directory.listFiles();
			for (File f : listF) 
			{
				PrintAllJavaFiles(f);
			}
			sub--;
		}	
		else if (directory.getName().contains(".java") && directory.isFile()) 
		{
			toSort(directory);
		}
	}

	public static void toSort(File f) throws IOException {
		StringBuilder subB = new StringBuilder();
		for (int i=0;i<sub;i++) 
		{
			subB.append("  ");
		}
		if (f.isFile()) 
		{
			List<String> lineList;
			lineList = Files.readAllLines(f.toPath());
			System.out.println(subB.toString()+f.getName());
			System.out.println(subB.toString()+" "+lineList.size()+" Number of Rows"+"\n"+subB.toString());
		}
		else 
		{
			System.out.println(subB+f.getName());
		}
	}
}
