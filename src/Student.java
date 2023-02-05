import java.util.List;

public class Student {
	public String studentName;
	public String studentSurname;
	public double marksAverage;


	public Student(String studentName, String studentSurname, double marksAverage){
		this.studentName=studentName;
		this.studentSurname=studentSurname;
		this.marksAverage=marksAverage;
	}

	public static double  getAverageMark(List<? extends Number>  listOfMarks){
		return (listOfMarks.get(0).doubleValue()+listOfMarks.get(1).doubleValue())/2;
	}

	@Override
	public String toString() {
		return "Name: "+studentName+"\n"+
				"Surname: "+studentSurname+"\n"+
				"Average mark:"+marksAverage;
	}
}
