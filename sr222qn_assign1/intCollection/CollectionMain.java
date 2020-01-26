package sr222qn_assign1.intCollection;

public class CollectionMain {

	public static void main(String[] args) {
		
		ArrayIntList sr = new ArrayIntList();
		sr.add(5);
		sr.add(6);
		sr.add(7);
		sr.add(8);
		sr.add(9);
		sr.add(10);
		sr.add(11);
		sr.add(12);
		sr.add(13);
		System.out.println(sr.isEmpty());
		System.out.println(sr.get(8));
		sr.addAt(1, 7);
		System.out.println(sr.get(9));
		System.out.println(sr.size());
		System.out.println(sr.toString());
		sr.remove(5);
		System.out.println(sr.size());
		System.out.println(sr.get(5));


		ArrayIntStack la = new ArrayIntStack();
		la.push(6);
		la.push(7);
		la.push(8);
		System.out.println(la.isEmpty());
		System.out.println(la.size());
		System.out.println(la.pop());
		System.out.println(la.size());
		System.out.println(la.peek());
		System.out.println(la.toString());
	}

}
