import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Double> individualMarksListLisa  = new ArrayList<>();
		individualMarksListLisa.add(8.9);
		individualMarksListLisa.add(9.1);
		List<Integer> projectMarksListJeremy = new ArrayList<>();
		projectMarksListJeremy.add(8);
		projectMarksListJeremy.add(9);
		List<Student> listOfStudents = new ArrayList<>();
		Student student1 = new Student("Lisa", "Stuart", Student.getAverageMark(individualMarksListLisa));
		Student student2 = new Student("Jeremy", "Green", Student.getAverageMark(projectMarksListJeremy));
		listOfStudents.add(student1);
		listOfStudents.add(student2);
		System.out.println("------from student-----");
		System.out.println(student1.toString());
		System.out.println(student2.toString());
		System.out.println("------from list-----");
		System.out.println(listOfStudents.get(0));
		System.out.println(listOfStudents.get(1));



	}
}