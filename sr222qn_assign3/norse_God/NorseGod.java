package sr222qn_assign3.norse_God;

public class NorseGod {
	private String name="";
	private String race="";
	private String desc="";
	
	public NorseGod() {
		
	}
	private void emptyError(String s) throws IllegalArgumentException {
		if (s.isEmpty()) {
			throw new IllegalArgumentException();
		}
	}
	public NorseGod(String a, String b, String c) throws IllegalArgumentException {
		emptyError(a);
		emptyError(b);
		emptyError(c);
		name = a;
		race = b;
		desc = c;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String str) throws IllegalArgumentException {
		emptyError(str);
		name = str;
	}
	
	public String getRace() {
		return race;
	}
	
	public void SetRace(String str) throws IllegalArgumentException {
		emptyError(str);
		race = str;
	}
	
	public String getDesc() {
		return desc;
	}
	
	public void setDesc(String str) throws IllegalArgumentException {
		emptyError(str);
		desc = str;
	}

}
