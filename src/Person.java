import java.util.Objects;

public class Person implements Comparable<Person> {
	private String name;
	private int age;
	private long id;

	public Person(){
	}

	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}

	public Person(String name, int age, long id){
		super();
		this.name = name;
		this.age = age;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public long getId(){
		return this.id;
	}

	@Override public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Person)) return false;
		Person person = (Person) o;
		return
				getName().equals(person.getName());
	}

	@Override public int hashCode() {
		return Objects.hash(getName(), getAge());
	}

	@Override public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}

	@Override public int compareTo(Person o) {
		if(this.id==o.getId())
			return 0;
		else if(this.id>o.getId())
			return 1;
		else
			return -1;
	}

	public static int count;
	static {
		count++;
	}
}

