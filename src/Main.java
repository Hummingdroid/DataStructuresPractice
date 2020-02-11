import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import javax.jnlp.PersistenceService;
import java.lang.reflect.Array;
import java.util.*;
import java.util.concurrent.PriorityBlockingQueue;

public class Main {
	public static void main(String[] args) {

//		// Split Strings in Arrays
//		String name = "Jason-Green-Boogies-Really-Hard";
//
//		// Separate at the regex delimiter into limit(n - 1) times.
//		// If limit is > 1 then string is separated by delimiter n -1 times
//		// so this will separate at the delimiter once and then give the next index the rest of the string.
//		// so, index 0 = Jason index 1 = Green index 2 = Boogies-Really-Hard
//		String [] newArray = name.split("-",3);
//		for(String x: newArray){
//			System.out.println(x);
//		}
//
//		// If limit is set to 1 nothing changes
//		// If it is <= 0 then it will do as many regex seperations as needed.
//		String name2 = "John-Jacob-Jingle-Hymer-Schmit";
//		String [] newArray2 = name2.split("-", 0);
//		for(String x: newArray2){
//			System.out.println(x);
//		}

//		// Regex delimiter with no limit, will delimit at the regex delimiter infinite times.
//		// Index 0 = Into  Index 1 = the Matrix  Index 2 = here we go
//		String name3 = "Into:the Matrix:here we go";
//		String [] newArray3 = name3.split(":");
//		for(String x : newArray3){
//			System.out.println(x);
//		}

//		// Using different Regex as the argument and saves them to the new array.
//		// after I print out the new string with the regex delimiters absent.
//		String crazyWord = "I owe you $5, but you owe me 10?";
//		String [] array4 = crazyWord.split("[$ , ?]");
//		String nwString = "";
//		for(String x : array4){
//			nwString += x + " ";
//		}
//		System.out.println(nwString);
//		//I owe you  5  but you owe me 10

//		// Negation will reverse the number value and negate it.
//		int one = 22;
//		int two = -one;
//		System.out.println(two);
//
//		// Using modulus to get last number in a number.
//		int number1 = 1234;
//		System.out.println(number1%10);
//
//		// Get the remainder using modulus.
//		int alpha = 22;
//		System.out.println(alpha%11);
////___________________________________________________________________________________________________
//		// Exponential
//		int oneEx = (int)Math.pow(10,2);
//		System.out.println(oneEx);
//
//		// Division
//		int first = 300;
//		int second = 10;
//		System.out.println(first/second);
		//___________________________________________________________________________________________________


//       // Way to reverse a Number by converting into a String by Integer.toString() and back Integer.parseInt().
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

		//___________________________________________________________________________________________________
//  // Reverse a String
//	public static String reverseString(String str){
//		char [] cArray = str.toCharArray();
//		String newString ="";
//		for(int i = cArray.length-1; i >=0; i--){
//			newString += cArray[i];
//		}
//		return newString;
//	}
//___________________________________________________________________________________________________
//	public static void swapTwoNumbers(int num1, int num2){
//		num1 = num1+num2; // 30
//		num2 = num1-num2; // 10
//		num1 = num1-num2; // 20
//		System.out.println(num1);
//		System.out.println(num2);
//	}



		//_______________________________________________________________________________________________________________
		// Generics at work
		RouterConnection r1 = new RouterConnection("Jay", "Sundaryians");
		System.out.println(r1.sendUserName());
		System.out.println(r1.passPasswordToServer());

		System.out.println();

		RouterConnection r2 = new RouterConnection(8675309,"1A2B3Cdefghi");
		System.out.println(r2.sendUserName());
		System.out.println(r2.passPasswordToServer());

		int theUserName = (int)r2.name; // Casting because generics inherit from Object and need to cast.
		String theUSerPassword = (String)r2.password;// Casting because generics inherit from Object and need to cast.
		System.out.println();

		System.out.printf("The user name is :%s and the user password is:%s",theUserName,theUSerPassword);

		// Using Generics ensures Type Safety. Once compiled though, all the info the that makes it a type, is removed
		// from the byte code. Thats why the above needed to be casted.
		ArrayList<RouterConnection> routerArray = new ArrayList<>();
		routerArray.add(r1);
		routerArray.add(r2);




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





	//___________________________________________________________________________________________________________________



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

//		// Create a comparator
//		Comparator<Person> nameSorter = Comparator.comparing(Person::getId);
//
//		// Add Comparator to priority blocking queue which has default size of 10
//		PriorityQueue<Person> personList = new PriorityQueue<Person>(nameSorter);
//		personList.add(new Person("Jack",21, 55));
//		personList.add(new Person("Jill", 33, 100));
//
//		// Iterate the Priority Queue
//		while(true){
//			Person p = personList.poll();
//			if(p == null) break;
//			System.out.println(p);
//		}



}

