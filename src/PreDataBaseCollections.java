import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class  PreDataBaseCollections <T> implements Iterable<T>{
	ArrayList<T> currentArray;

	public PreDataBaseCollections(){
		this.currentArray = new ArrayList<>();
	}

	public void addItem(T input){
		currentArray.add(input);
	}

	@Override public Iterator<T> iterator() {
		return null;
	}

	// Method to iterate over the generic collection
	public void getAllItems(){
		// Create iterator on currentArray.
		Iterator iter = currentArray.iterator();

		// While the collection has a next item
		while(iter.hasNext()){
			T x = (T)iter.next();
			System.out.println(x);
		}
	}

	public ArrayList<T> sendCollectionToDatabase(ArrayList<T> arrayToSendToDB){
		currentArray = new ArrayList<T>(arrayToSendToDB);
		return currentArray;
	}
}
