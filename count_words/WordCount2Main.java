package sr222qn_assign3.count_words;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class WordCount2Main {

	public static void main(String[] args) throws FileNotFoundException {
		File fileInput1 = new File(args[0]);
		Scanner sc = new Scanner(fileInput1);

		File fileInput2 = new File(args[0]);
		Scanner sc2 = new Scanner(fileInput2);
		
		HashWordSet h = new HashWordSet();
		while (sc.hasNext()) 
		{
			Word word = new Word(sc.next());
			h.add(word);
		}
	
		TreeWordSet t = new TreeWordSet();
		while (sc2.hasNext()) 
		{
			Word word = new Word(sc2.next());
			t.add(word);
		}
		sc.close();
		sc2.close();
		System.out.println("Number of Hash Words: "+h.size());
		System.out.println("Number of Tree Words: "+t.size());
		System.out.println("Hash words are: "+ h.toString());
		System.out.println("Tree words are: "+ t.toString());

	}

}
