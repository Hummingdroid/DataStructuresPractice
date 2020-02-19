import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Student extends Person {
	private int studentId;

	public Student(String name, int age, int studentId){
		super(name,age); // Use super classes declared attributes. This is using reusable design principles.
		this.studentId = studentId; // Set attribute that is different from parent class.
	}
	// All superclass methods can be called in this class.
	// Now I would only need to make methods that the super class didn't have.
}
