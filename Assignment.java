package project;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;

public class Assignment implements Serializable {

	private String name;
	private String person;
	private LocalDate initialDate;
	private LocalDate dueDate;
	private boolean status;

	public Assignment(String name, String person, LocalDate initialDate, LocalDate dueDate, boolean status) {
		this.name = name;
		this.person = person;
		this.initialDate = initialDate;
		this.dueDate = dueDate;
		this.status = status;
		try {
			try (
					// Create an output stream for file Assignments.dat
					ObjectOutputStream output = new ObjectOutputStream(
							new FileOutputStream("src/project/Assignments.dat", true));) {
				// Write this object to the object output stream
				output.writeObject(this);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

		System.out.println(allToString());
	}

	public String toString() {
		String s = "";
		s += name + "\n";
		s += person + "\n";
		s += initialDate + "\n";
		s += dueDate + "\n";
		s += status + "\n";

		return s;
	}

	public static String allToString() {
		String s = "";
		try {
			try (ObjectInputStream input = new ObjectInputStream(new FileInputStream("src/project/Assignments.dat"));) {
				int value;
				while ((value = input.read()) != -1) {
					Assignment assignment = (Assignment) input.readObject();
					s += assignment.toString() + "\n";
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return s;
	}
}
