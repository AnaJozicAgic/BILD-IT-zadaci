package zadaci_19_02_2016;

import java.util.Arrays;

public class Course implements Cloneable {
	// Data fields
	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents;

	// Construct
	public Course(String courseName) {
		this.courseName = courseName;
	}

	// Adding student
	public void addStudent(String student) {
		students[numberOfStudents] = student;
		numberOfStudents++;
	}

	// getters
	public String[] getStudents() {
		return students;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public String getCourseName() {
		return courseName;
	}

	public void dropStudent(String student) {
	} // Left as an exercise in Programming Exercise 10.9 29 }

	@Override
	// Overrides clone, to perform deep copy
	protected Course clone() throws CloneNotSupportedException {
		try {
			return (Course) super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("...");
			throw new RuntimeException();
		}
	}

	@Override
	public String toString() {
		return "Course [courseName=" + courseName + ", students=" + Arrays.toString(students) + ", numberOfStudents="
				+ numberOfStudents + "]";
	}

	public static void main(String[] args) {
		// course object for testing
		Course a = new Course("Name 1");
		a.addStudent("Amila");
		a.addStudent("Ensar");
		a.addStudent("Amel");
		// Deep copy of the object
		try {
			Course b = a.clone();
			System.out.println(b);
		} catch (CloneNotSupportedException e) {
			System.out.println("...");
		}
	}
}
