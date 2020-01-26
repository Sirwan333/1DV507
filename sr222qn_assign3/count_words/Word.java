package sr222qn_assign3.count_words;

public class Word implements Comparable<Word> {
	private String word;

	public Word(String str) {
		word=str.toLowerCase();
	}
	
	public String toString() {
		return word; 
	}

	public int hashCode() { 
		int hashCode = 0;
		for(int i=0; i<word.length(); i++){
			char ch = word.charAt(i);
			hashCode =hashCode+ Character.getNumericValue(ch);
		}
		return hashCode; 
	}
	
	public boolean equals(Object other) { 
		if (other instanceof Word) 
		{
			Word wo = (Word)other;		
			return (wo.word.equalsIgnoreCase(word));   
		}
		
		return false;
	}

	public int compareTo(Word w) { 
		return word.compareTo(w.word); 
	}

}
