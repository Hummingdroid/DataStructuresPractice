import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import javax.jnlp.PersistenceService;
import java.lang.reflect.Array;
import java.util.*;
import java.util.concurrent.PriorityBlockingQueue;

public class Main {
	public static void main(String[] args) {
//		LinkedList<Person> myLink = new LinkedList<>();
//		Person p1 = new Person("Jason", 42);
//		Person p2 = new Person("Elisa", 24);
//		Person p3 = new Person("Juan", 32);
//		myLink.add(p1);
//		myLink.add(p2);
//		myLink.add(p3);

//		// Search and Get index of object searched for in an LinkedList
//		int indexSearched = myLink.indexOf(new Person("Juan",32));
//		System.out.println(indexSearched);
//
//		// Replace an item at a specific index with an item from a different index.
//		myLink.add(indexSearched,p1);
//		System.out.println(myLink);

//		// LinkedList initalizer
//		LinkedList<Person> personList = new LinkedList<>(Arrays.asList(new Person("Mathew", 22),
//				new Person("Mark", 33), new Person("Luke", 21)));
//		System.out.printf("Person list is as follows: %s%n", personList);
//
//		// Find specific index of item in list
//		int locationofPerson = personList.indexOf(new Person("Luke", 21));
//		System.out.printf("Location of Person index: %d",locationofPerson);
//
//		// Add item to the begining of the list
//		personList.addFirst(new Person("Gomez", 44));

//		// Add item to the end of the list
//		personList.addLast(new Person("Michael Scott", 45));


//		// Create Second linked list to add to another linked list.
//		LinkedList<Person> personList2 = new LinkedList<>(Arrays.asList(new Person("Toby", 40), new Person("Angela", 35), new Person("Dwight", 38)));
//		personList.addAll(personList2);
//		System.out.println(personList);


//		// Check if Linked List contains a specific item, returns boolean
//		System.out.println(personList.contains(new Person("Michael Scott", 45)));

//		// Return the first item in a list
//		System.out.println(personList.element());

//		// List Iterator returns a list in proper sequence or when you need to find a previous item.
//		ListIterator<Person> iterator  = personList2.listIterator(0);
//		while(iterator.hasNext()){
//			Person p = iterator.next();
//			System.out.printf("Name: %s&n", p.getName());
//			System.out.printf("Age: %s&n", p.getAge());
//		}
//		System.out.println();

//		// Push person ontop linked list stack
//		personList2.push(new Person("Chancelor", 300));


//		// Look at  last person put on the stack(node zero) but dont remove.
//		System.out.println(personList2.peek());
//		System.out.println(personList2);

//		// Look at and pop off person on most recent node.
//		System.out.println(personList2.pop());
//		System.out.println(personList2);

		//LinkedList<Person> personList3 = new LinkedList<>(Arrays.asList(new Person("Tony", 40), new Person("Sara", 35), new Person("garheht", 38)));

//		// Remove first occurance of an item in a list.
//		personList3.removeFirstOccurrence(new Person("Sara", 0));

//		// Remove first occurrance based upon a searched item.
//		String searchName = "Sara";
//		for(Person x : personList3){
//			if(x.getName().contains(searchName)){ ;
//				personList3.remove(personList3.indexOf(x));
//			}
//		}

//		// Set a node to a new value in a linked list
//		personList3.set(1, new Person("Fonzie", 23));
//		System.out.println(personList3);

		// ___________________________________________________________________________________________________________
		//Priority QUEUE. Is ordered by priority of objects. Can not contain null.
		// Comparator can be used to set the order. Order is natural order. Lease element is first, then second etc..
		// If objects are similar they are polled randomly. Not thread safe. Use PriorityBlockingQueue. O(log(n))


//		// Create a Priority Blocking Queue.
//		PriorityBlockingQueue<Integer> priorityList = new PriorityBlockingQueue<Integer>(Arrays.asList(9,8,7,6,5,44));
//
//		while(true){
//			Integer i = priorityList.poll();
//			System.out.println(i);
//			if(i == null){
//				break;
//			}
//		}

		// Create a comparator
		Comparator<Person> nameSorter = Comparator.comparing(Person::getId);

		// Add Comparator to priority blocking queue which has default size of 10
		PriorityQueue<Person> personList = new PriorityQueue<Person>(nameSorter);
		personList.add(new Person("Jack",21, 55));
		personList.add(new Person("Jill", 33, 100));

		// Iterate the Priority Queue
		while(true){
			Person p = personList.poll();
			if(p == null) break;
			System.out.println(p);
		}







		//_______________________________________________________________________________________________________________

//		// Arraylist initalizer.
//		ArrayList<Integer> myArrayList = new ArrayList<Integer>(Arrays.asList(22,25,30,50));
//		ArrayList<Integer> myArrayList2 = new ArrayList<Integer>(Arrays.asList(22,25,30,50));
//
//		ArrayList<Integer> myArrayList3 = new ArrayList<>();
//		myArrayList3.add(22);
//		myArrayList3.add(25);
//		myArrayList3.add(30);
//		myArrayList3.add(40);

//		// Copy one ArrayList to another.
//		Integer [] mynewArry =  new Integer [myArrayList.size()];
//		mynewArry = myArrayList.toArray(mynewArry);

		// Search the arraylist for a specific item
//		int searchItem = 22;
//		for(int i = 0; i < myArrayList.size(); i++){
//			if (myArrayList.get(i).equals(searchItem)) {
//				System.out.println(searchItem + " Item found");
//				break;
//			} else {
//				System.out.println("Item not found");
//			}
//		}

		// Sort the Arrrays
//		Collections.sort(myArrayList);
//		Collections.sort(myArrayList2);
//		Collections.sort(myArrayList3);
//
//		// Compare arraylist for equality.
//		System.out.println(myArrayList.equals(myArrayList2));
//		System.out.println(myArrayList.equals(myArrayList3));
//
//		// Remove all duplicate items in an arraylist that exist in another arraylist, leaving only non-duplicate items
//		ArrayList myArrayList4 = new ArrayList<>(Arrays.asList(10,20,75, 30,35,40));
//		ArrayList myArrayList5 = new ArrayList<>(Arrays.asList(10,20,30,40,77));
//		Collections.sort(myArrayList4);
//		Collections.sort(myArrayList5);
//		myArrayList5.removeAll(myArrayList4);
//		System.out.println(myArrayList4);
//		System.out.println(myArrayList5);


//		// Retain all duplicates in list6 that are in list7
//		ArrayList myArrayList6 = new ArrayList<>(Arrays.asList(77,55,66,88,99));
//		ArrayList myArrayList7 = new ArrayList<>(Arrays.asList(77,50,60,88,99));
//		Collections.sort(myArrayList6);
//		Collections.sort(myArrayList7);
//		myArrayList6.retainAll(myArrayList7);
//
	}

//	public static int reverseNumber(int number){
//    int digit = 0;
//    int reversed = 0;
//
//    // While number not 0 do this.
//		while(number != 0) {
//			// number argument =  1234
//			// Any number modulus 10 = the last digit, example 1234 will have remainder of 4.
//			digit = number % 10;
//			System.out.println("Number: " +number);
//			System.out.println("Digit: " + digit);
//
//			// We multiply reverse by 10 so that the ones column becomes the tens column, the tens column
//			// becomes the hundreds column, and so on. This also leaves us with a new ones column where we
//			// can add our digit which we determined was 4.
//			reversed = reversed * 10 + digit;
//			System.out.println("Reversed: " + reversed);
//
//			number /= 10;
//			System.out.println("Number divided by Ten: " +number);
//			System.out.println();
//		}
//		return reversed;
//}

//       // Second Way to reverse a Number
//       public static int reverseNumber2(int number){
//		String strNumber = Integer.toString(number);
//		char [] strNumberArray = strNumber.toCharArray();
//
//		String tempNumber = "";
//		for(int i = strNumber.length()-1; i >= 0; i--){
//			tempNumber += strNumberArray[i];
//		}
//		int numToReturn = Integer.parseInt(tempNumber);
//		return numToReturn;
//	   }



//  // Reverse a String
//	public static String reverseString(String str){
//		char [] cArray = str.toCharArray();
//		String newString ="";
//		for(int i = cArray.length-1; i >=0; i--){
//			newString += cArray[i];
//		}
//		return newString;
//	}

//	public static void swapTwoNumbers(int num1, int num2){
//		num1 = num1+num2; // 30
//		num2 = num1-num2; // 10
//		num1 = num1-num2; // 20
//		System.out.println(num1);
//		System.out.println(num2);
//	}



	}

