package sr222qn_assign2.Queue;
import java.util.Iterator;
public class QueueMain {

	public static void main(String[] args) {
		LinkedQueue queue1 = new LinkedQueue();
        queue1.isEmpty();
        queue1.enqueue("Sirwan");
        queue1.enqueue("Dilshad");
        queue1.enqueue("Shivan");
        queue1.enqueue("Breen");
        System.out.println("Is Empty: "+queue1.isEmpty());
        System.out.println("The first elment is: "+queue1.first());
        System.out.println("The last elment is: "+queue1.last());
        System.out.println("The elments are: "+queue1.toString());
        
        Iterator<Object> itreator = queue1.iterator();
        while (itreator.hasNext())
        {
            System.out.println(itreator.next().toString());
        }
   
        queue1.dequeue();
        queue1.dequeue();
        queue1.dequeue();
        queue1.dequeue();

        System.out.println("Is Empty: "+queue1.isEmpty());
	}

}
