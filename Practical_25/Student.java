package student;

public class Student{
	public int rollNo;
	public String name;
	public String course;
	
	public Student(){
		this(0,"None");
	}
	
	public Student(int rollNo, String name){
		this.rollNo = rollNo;
		this.name = name;
		this.course = "MCA";
	}

}