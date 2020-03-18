import java.lang.reflect.Array;
import java.util.*;
import java.util.concurrent.PriorityBlockingQueue;

public class AllStructures {

	public AllStructures() {

	}

	public void createSimpleArrayAndCopyRangeToNewArray() {
		// Arrays
		int[] numArray = new int[20];

		int[] numArray2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

		// Copy array from (array, inclusive, last index)
		int[] myNumbers = Arrays.copyOfRange(numArray2, 0, 10);
	}

	public void createSimpleArrayFromArrayListAndSearchSimpleArray() {
		// Arraylist initalizer.
		ArrayList<Integer> myArrayList = new ArrayList<Integer>(Arrays.asList(22, 25, 30, 50));
		ArrayList<Integer> myArrayList2 = new ArrayList<Integer>(Arrays.asList(22, 25, 30, 50));

		ArrayList<Integer> myArrayList3 = new ArrayList<>();
		myArrayList3.add(22);
		myArrayList3.add(25);
		myArrayList3.add(30);
		myArrayList3.add(40);

		// Create an array that is the size of the ArrayList
		Integer[] mynewArry = new Integer[myArrayList.size()];

		// Copy items from array to ArrayList
		mynewArry = myArrayList.toArray(mynewArry);

		//Sort the Arrays
		Collections.sort(myArrayList);
		Collections.sort(myArrayList2);
		Collections.sort(myArrayList3);

		//Search the array for a specific item
		System.out.println("Search for number 22");
		int searchItem = 22;
		for (int i = 0; i < myArrayList.size(); i++) {
			if (myArrayList.get(i).equals(searchItem)) {
				System.out.println(searchItem + " Item found");
				break;
			}
			else {
				System.out.println("Item not found");
			}
		}

		// Compare arraylist for equality.
		System.out.println(myArrayList.equals(myArrayList2));
		System.out.println(myArrayList.equals(myArrayList3));
	}

	public void removeAllDuplicateItemsArrayList() {
		// Creating ArrayLists and Sort them.
		ArrayList myArrayList4 = new ArrayList<>(Arrays.asList(10, 20, 75, 30, 35, 40));
		ArrayList myArrayList5 = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 77, 35));
		Collections.sort(myArrayList4);
		Collections.sort(myArrayList5);
		System.out.println("Arrays are sorted first using sort() method");
		System.out.println("Arraylist4: " + myArrayList4);
		System.out.println("ArrayList5: " + myArrayList5);
		System.out.println("------ And After -------");

		// Remove all duplicate items in arraylist(5) that exist in another ArrayList(4), leaving only non-duplicate items in arraylist(5)
		System.out.println("Remove all duplicates in ArrayList5 that also exist in ArrayList4");
		myArrayList5.removeAll(myArrayList4);
		System.out.println("Arraylist4: " + myArrayList4);
		System.out.println("ArrayList5: " + myArrayList5);
	}

	public void retainAllDuplicates() {
		// Retain all duplicates in list6 that are in list7
		ArrayList myArrayList6 = new ArrayList<>(Arrays.asList(77, 55, 66, 88, 99));
		ArrayList myArrayList7 = new ArrayList<>(Arrays.asList(77, 50, 60, 88, 99));
		Collections.sort(myArrayList6);
		Collections.sort(myArrayList7);
		myArrayList6.retainAll(myArrayList7);
	}

	public void replaceArrayListItem() {
		ArrayList<String> s1 = new ArrayList<>(Arrays.asList("Jay", "Wilma", "Francene", "Gomez", "Sara"));

		// Find item
		int index = s1.indexOf("Francene");

		// Remove Item at index of what you were looking for(If you don't arraylist just moves items in front of
		// index forward and ArrayList grows.
		s1.remove(index);

		// Add the new Item to the index location and give it a value.
		s1.add(index, "Jason");

		for (String s : s1) {
			System.out.println(s);
		}
	}

	public void removeItemsUsingListIterator() {
		ArrayList<Integer> intList = new ArrayList<Integer>(Arrays.asList(33, 5, 44, 6, 7));
		Iterator iter = intList.iterator();

		while (iter.hasNext()) {
			// Get what is at next index/node
			Object nextItem = iter.next();

			// If the item at next index/node is the value remove.
			if (nextItem.equals(44)) {
				iter.remove();
				break;
			}
		}

		// Iternate over entire ArrayList
		for (Integer x : intList) {
			System.out.println(x);
		}
	}

	public void removeItemsInArrayListWithoutIterator() {
		ArrayList<Integer> intList = new ArrayList<>(Arrays.asList(55, 66, 33, 23, 76, 88, 99, 01, 23));

		int searchedItem = 76;
		boolean contains = intList.contains(searchedItem);
		if (contains) {
			intList.remove(intList.indexOf(searchedItem));
		}

		for (Integer x : intList) {
			System.out.println(x);
		}
	}

	public void goStrings() {
		// Split Strings in Arrays
		String name = "Jason-Green-Boogies-Really-Hard";

		// Separate at the regex delimiter into limit(n - 1) times.
		// If limit is > 1 then string is separated by delimiter n -1 times
		// so this will separate at the delimiter once and then give the next index the rest of the string.
		// so, index 0 = Jason index 1 = Green index 2 = Boogies-Really-Hard
		String[] newArray = name.split("-", 3);
		for (String x : newArray) {
			System.out.println(x);
		}

		// If limit is set to 1 nothing changes
		// If it is <= 0 then it will do as many regex seperations as needed.
		String name2 = "John-Jacob-Jingle-Hymer-Schmit";
		String[] newArray2 = name2.split("-", 0);
		for (String x : newArray2) {
			System.out.println(x);
		}

		// Regex delimiter with no limit, will delimit at the regex delimiter infinite times.
		// Index 0 = Into  Index 1 = the Matrix  Index 2 = here we go
		String name3 = "Into:the Matrix:here we go";
		String[] newArray3 = name3.split(":");
		for (String x : newArray3) {
			System.out.println(x);
		}

		// Using different Regex as the argument and saves them to the new array.
		// after I print out the new string with the regex delimiters absent.
		String crazyWord = "I owe you $5, but you owe me 10?";
		String[] array4 = crazyWord.split("[$ , ?]");
		String nwString = "";
		for (String x : array4) {
			nwString += x + " ";
		}
		System.out.println(nwString);
		//I owe you  5  but you owe me 10

		// Negation will reverse the number value and negate it.
		int one = 22;
		int two = -one;
		System.out.println(two);

		// Using modulus to get last number in a number.
		int number1 = 1234;
		System.out.println(number1 % 10);

		// Get the remainder using modulus.
		int alpha = 22;
		System.out.println(alpha % 11);

	}

	// Reverse a String
	public String reverseString(String inputStr) {
		char[] cArray = inputStr.toCharArray();
		String newString = "";

		for (int i = cArray.length - 1; i >= 0; i--) {
			newString += cArray[i];
		}
		return newString;
	}

	public void goExponents() {
		// Exponential
		int oneEx = (int) Math.pow(10, 2);
		System.out.println(oneEx);

		// Division
		int first = 300;
		int second = 10;
		System.out.println(first / second);
	}

	// Way to reverse a Number by converting into a String by Integer.toString() and back Integer.parseInt().
	public int reverseNumber2(int number) {
		String strNumber = Integer.toString(number);
		char[] strNumberArray = strNumber.toCharArray();

		String tempNumber = "";
		for (int i = strNumber.length() - 1; i >= 0; i--) {
			tempNumber += strNumberArray[i];
		}
		int numToReturn = Integer.parseInt(tempNumber);
		return numToReturn;
	}


	public static void swapTwoNumbers(int num1, int num2) {
		num1 = num1 + num2; // 30
		num2 = num1 - num2; // 10
		num1 = num1 - num2; // 20
		System.out.println(num1);
		System.out.println(num2);
	}


	public void goGenerics() {
		// Generics at work
		RouterConnection r1 = new RouterConnection("Jay", "Sundaryians");
		System.out.println(r1.sendUserNametoRouter());
		System.out.println(r1.sendPasswordToRouter());

		System.out.println();

		RouterConnection r2 = new RouterConnection(8675309, "1A2B3Cdefghi");
		System.out.println(r2.sendUserNametoRouter());
		System.out.println(r2.sendPasswordToRouter());

		//Once compiled, all the info the that makes a Generic Object a type as in the above, is removed
		// from the byte code. Thats why casting is done here, because the return object is of type Object.
		int theUserName = (int) r2.name;
		String theUSerPassword = (String) r2.password;
		System.out.println();

		System.out.printf("The user name is :%s and the user password is:%s", theUserName, theUSerPassword);

		// Using Generics ensures Type Safety.
		ArrayList<RouterConnection> routerArray = new ArrayList<>();
		routerArray.add(r1);
		routerArray.add(r2);


		// Creating a Generic Array
		Object[] genArray = new String[10];
		genArray[0] = "pickles";
		//genArray[1] = 22;
		//System.out.println(genArray[1]);

		// Also you cant do this due to type erasure. Arrays can only be done Generically using Object.
		// T [] myArray = T [25];

		// Wild Cards Yall!!!, using the (?) is a wildcard in collections.
		//Collection<?> coll = new ArrayList<String>();
		//List<? extends Number> list = new ArrayList<Long>();
		//Pair<String, ?> pair = new Pair<String, Integer>("Dolly", 22);

		// Comparator<? super String< denotes all instantiations of the Comparator interface for type argument types
		// that are supertypes of String.
		try {
			//Comparator<? super String> cmp = new RuleBasedCollator(new Integer(100));
			// throws exception because Integer is not a subtype of string.
		}
		catch (Exception e) {

		}


		//UNBOUNDED... wildcard parameterized type
		//A generic type where all type arguments are the unbounded wildcard "?” WITHOUT ANY RESTRICTION on type variables. e.g.
		ArrayList<?> list1 = new ArrayList<Long>();
		//or
		ArrayList<?> list2 = new ArrayList<String>();
		//or
		ArrayList<?> list3 = new ArrayList<Person>();

		//Bounded wildcards put some restrictions over possible types, you can use to instantiate a
		// parametrized type. This restriction is enforced using keywords “super” and “extends”.
		//In layman’s terms, if you want generic expression to accept all subclasses of a particular type,
		// you will use upper bound wildcard using “extends” keyword.
		List<? extends Number> mixedNumbersList = new ArrayList<Double>();

		// Here I make a mistake to show that you cant use upper bound to a lower bound of ? where you're trying to
		// use "String" as a lower bound of Number.
		//List<? extends Number> wontWorkList = new ArrayList<String>();

		// 	NOT ALLOWED IN GENERICS
		// 1. INSTANTIATING "T", you cant do   Constuctor(){ new T(); }
		// 2. STATIC FIELD OF TYPE "T"
		// 3. CANT USE PRIMITIVES : you can't do ArrayList<int> myInts = new ArrayList<>();

	}


	public void getIndexOfItemLinkedList() {

		LinkedList<Person> myLink = new LinkedList<>();
		Person p1 = new Person("Jason", 42, 234567);
		Person p2 = new Person("Elisa", 24, 34577);
		Person p3 = new Person("Juan", 32, 65454898);
		myLink.add(p1);
		myLink.add(p2);
		myLink.add(p3);

		// Search and Get index of object searched for in an LinkedList
		int indexSearched = myLink.indexOf(new Person("Juan", 32, 454567));
		System.out.println(indexSearched);
	}

	public void replaceItemAtIndexInLinkedList() {
		LinkedList<Person> myLink = new LinkedList<>();
		Person p1 = new Person("Jason", 42, 234567);
		Person p2 = new Person("Elisa", 24, 34577);
		Person p3 = new Person("Juan", 32, 65454898);
		myLink.add(p1);
		myLink.add(p2);
		myLink.add(p3);

		// Replace an item at a specific index with an item from a different index.
		myLink.add(1, p1);
		System.out.println(myLink);
	}

	public void findAnItemInAlinkedList() {

		// LinkedList initalizer
		LinkedList<Person> personList = new LinkedList<>(Arrays.asList(new Person("Mathew", 22, 55903),
				new Person("Mark", 33, 6767), new Person("Luke", 21, 2323)));
		System.out.printf("Person list is as follows: %s%n", personList);

		// Find specific index of item in list
		int locationofPerson = personList.indexOf(new Person("Luke", 21, 6538));
		System.out.printf("Location of Person index: %d", locationofPerson);

	}

	public void addItemToBeginningAndEndOfLinkedList() {
		// LinkedList initalizer
		LinkedList<Person> personList = new LinkedList<>(Arrays.asList(new Person("Mathew", 22, 55903),
				new Person("Mark", 33, 6767), new Person("Luke", 21, 2323)));


		// Add item to the begining of the list
		personList.addFirst(new Person("Gomez", 44, 5567));

		// Add item to the end of the list
		personList.addLast(new Person("Michael Scott", 45, 3345));

	}

	public void appendLinkedLists() {
		// LinkedList initalizer
		LinkedList<Person> personList = new LinkedList<>(Arrays.asList(new Person("Mathew", 22, 55903),
				new Person("Mark", 33, 6767), new Person("Luke", 21, 2323)));

		// Create Second linked list to add to another linked list.
		LinkedList<Person> personList2 = new LinkedList<>(Arrays.asList(new Person("Toby", 40, 123989), new Person("Angela", 35, 3444), new Person("Dwight", 38, 1287)));


		// Adding all items from first list to Second List(the last node)
		personList.addAll(personList2);
		System.out.println(personList);
	}

	public void checkIfLinkedListContainsACertainItem() {
		// LinkedList initalizer
		LinkedList<Person> personList = new LinkedList<>(Arrays.asList(new Person("Mathew", 22, 55903),
				new Person("Mark", 33, 6767), new Person("Luke", 21, 2323)));
		LinkedList<Person> personList2 = new LinkedList<>(Arrays.asList(new Person("Willow", 22, 55903),
				new Person("Stark", 33, 6767), new Person("Duke", 41, 2323)));

		// Check if Linked List contains a specific item, returns boolean
		System.out.println(personList.contains(new Person("Michael Scott", 45, 690978098)));

		// Return the first item in a list
		System.out.println(personList.element());

		// List Iterator returns a list in proper sequence or when you need to find a previous item.
		ListIterator<Person> iterator = personList2.listIterator(0);
		while (iterator.hasNext()) {
			Person p = iterator.next();
			System.out.printf("Name: %s&n", p.getName());
			System.out.printf("Age: %s&n", p.getAge());
		}
		System.out.println();

		// Push person on top linked list stack
		personList2.push(new Person("Chancelor", 300, 115678));


		// Look at  last person put on the stack(node zero) but dont remove.
		System.out.println(personList2.peek());
		System.out.println(personList2);

		// Look at and pop off person on most recent node.
		System.out.println(personList2.pop());
		System.out.println(personList2);

	}

	public void removeFirstOccuranceInLinkedListOfAnItem() {
		LinkedList<Person> personList3 = new LinkedList<>(Arrays.asList(new Person("Tony", 40, 13456),
				new Person("Sara", 35, 334454), new Person("garheht", 38, 2230011)));

		System.out.println(personList3);
		System.out.println("AND NOW Remove First Occurance OF Sara");

		// Remove first occurance of an item in a list.
		personList3.removeFirstOccurrence(new Person("Sara", 0, 334454));

		// Remove first occurrance based upon a searched item.
		String searchName = "Sara";
		for (Person x : personList3) {
			if (x.getName().contains(searchName)) {
				;
				personList3.remove(personList3.indexOf(x));
			}
		}

		// Set a node to a new value in a linked list
		personList3.set(1, new Person("Fonzie", 23, 2230080));
		System.out.println(personList3);
	}

	public void goPriorityQueue() {
		// Stored In Natural Order
		PriorityBlockingQueue<Integer> priorityList = new PriorityBlockingQueue<Integer>(Arrays.asList(9, 8, 7, 6, 5, 44));

		while (true) {
			Integer i = priorityList.poll();
			System.out.println(i);
			if (i == null) {
				break;
			}
		}
		System.out.println("-------------------------------------------------------------\n");

		/*USE PriorityQUEUE WHEN YOU WANT TO STORE INFORMATION IN A SPECIFIC ORDER AFTER IT IS SORTED AND POP,
		POLL, PEEK a Collection.
		 */

		Person p1 = new Person("Jack", 21, 100);
		Person p2 = new Person("Jill", 33, 15);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println("----------- Before Comparator Orders by ID Number ----------\n");

		// Create a comparator for the order you want
		Comparator<Person> nameSorter = Comparator.comparing(Person::getId);

		// Add Comparator to priority queue which has default size of 10
		PriorityQueue<Person> personList = new PriorityQueue<Person>(nameSorter);
		personList.add(p1);
		personList.add(p2);


		// Iterate the Priority Queue
		while (true) {
			Person p = personList.poll();
			if (p == null) break;
			System.out.println(p);
		}
	}

	public void doThisHashMapMagic(){

		// Collection that when filled doesn't keep a specific order. Use when you want to get info from a collection
		// by key and value.
		HashMap<String, Person> personList = new HashMap<>();

		Person iamFirst = new Person("Jackie", 44, 1345643);
		Person isecond = new Person("Robbie", 44, 13456443);

		personList.put("1a5kj4lk98aaa", iamFirst);
		personList.put("22998jhkd89sk", isecond);

		Iterator itr = personList.keySet().iterator();

		while(itr.hasNext()){

			// Get the key
			Object key= itr.next();

			// Get the value from the key(Value Object must be of same type as stored.
			// example: Person is a person value, Car is a car value, and Integer is an int value.)
			Person value = personList.get(key);
			System.out.printf("The Key is : %s with a Value of %s%n", key,value);
		}

		// See if list contains certain keys
		System.out.println(personList.containsKey("1a5kj4lk98aaa"));
		System.out.println(personList.containsKey(123545645));

		// Return the set of all the keys in a HashMap
		System.out.println(personList.keySet());

		// Return all the values in the HashMap
		System.out.printf("List one: %s", personList.values());

		// Add values from one map to another map, in this case put list one stuff into list 2
		HashMap<String, Person> personList2 = new HashMap<>();
		personList2.putAll(personList);
		System.out.printf("\nList two %s\n", personList2.values());
		System.out.println();


		// This will not work because of different Type of Key Value Pairs than first Collection.
		//HashMap<Integer, Integer> personList3 = new HashMap<>();
		//personList3.putAll(personList);

		personList2.remove("1a5kj4lk98aaa");
		System.out.printf("List 2 after removing a jackie by key %s", personList2.values());
	}
}



