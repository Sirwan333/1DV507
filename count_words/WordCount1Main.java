package sr222qn_assign3.count_words;
import java.util.Scanner;
import java.io.File;
import java.util.HashSet;
import java.util.TreeSet;
import java.io.FileNotFoundException;

public class WordCount1Main {

	public static void main(String[] args) throws FileNotFoundException {

		File inputFile1 = new File(args[0]);
		Scanner sc = new Scanner(inputFile1);

		File inputFile2 = new File(args[0]);
		Scanner sc2 = new Scanner(inputFile2);

		HashSet<Word> h = new HashSet<>();
		while (sc.hasNext()) 
		{
			Word word = new Word(sc.next());
			h.add(word);
		}
	
		TreeSet<Word> t = new TreeSet<>();
		while (sc2.hasNext()) {
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
