package sr222qn_assign4.time;

public class stringConcatenations {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			//stringOnlyOneCharacter();
			//stringRowWith80Characters();
			//stringBuilderOnlyOneCharacter();
			stringBuilderRowWith80Character();
		}
	}
	@SuppressWarnings("unused")
	private static void stringOnlyOneCharacter() {
		String string = "";
		long startTime = System.currentTimeMillis();
		while (System.currentTimeMillis() - startTime < 1000) {
			string = string + "a";
		}
		long endTime = System.currentTimeMillis();
		int actualTime = (int) (endTime - startTime);
		System.out.println("Run Time: " + actualTime + " millis" + " Concatenations: " + string.length());
	}
	@SuppressWarnings("unused")
	private static void stringRowWith80Characters() {

		String string = "";
		long startTime = System.currentTimeMillis();
		while (System.currentTimeMillis() - startTime < 1000) {
			for (int i = 0; i < 80 ; i++) {
				string += "a";

			}
		}
		long endTime = System.currentTimeMillis();
		int actualTime = (int) (endTime - startTime);
		System.out.println("Run Time: " + actualTime + " millis" + " Concatenations: " + (string.length()));
	}
	@SuppressWarnings("unused")
	private static void stringBuilderOnlyOneCharacter() {

		StringBuilder str = new StringBuilder();
		long startTime = System.currentTimeMillis();
		while (System.currentTimeMillis() - startTime < 1000) {
			str.append("a");
		}
		long endTime = System.currentTimeMillis();
		int actualTime = (int) (endTime - startTime);
		long startTime2 = System.currentTimeMillis();
		str.toString();
		long endTime2 = System.currentTimeMillis();
		int actualTime2 = (int) (endTime2 - startTime2);
		System.out.println("Run Time: " + (actualTime + actualTime2)+ " millis" + " Concatenations: " + (str.length()));
	}
	@SuppressWarnings("unused")
	private static void stringBuilderRowWith80Character() {

		StringBuilder str = new StringBuilder();
		long startTime = System.currentTimeMillis();
		while (System.currentTimeMillis() - startTime < 1000) {
			for (int i = 0; i < 80 ; i++) {
				str.append("a");

			}
		}
		long endTime = System.currentTimeMillis();
		int actualTime = (int) (endTime - startTime);
		long startTime2 = System.currentTimeMillis();
		str.toString();
		long endTime2 = System.currentTimeMillis();
		int actualTime2 = (int) (endTime2 - startTime2);
		System.out.println("Run Time: " + (actualTime + actualTime2)+ " millis" + " Concatenations: " + (str.length()/80));

	}
}
