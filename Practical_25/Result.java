package exam;

import student.Student;

public class Result{
	Student s;
	public int[] marks = new int[3];
	public int totalMarks;
	public String grade;
	public float percentage;
	
	public Result(){
		this(null,new int[]{0,0,0});
	}
	
	public Result(Student s,int[] marks){
		this.s = s;
		this.marks = marks;
		
		//calculate total marks
		int sum = 0;
		for(int currentMarks: this.marks){
			sum += currentMarks;
		}
		totalMarks = sum;
		
		//calculate grade
		percentage = totalMarks * 100 / 300.0f;
		System.out.println(percentage);
		grade = generateGrade(percentage);
	}
	
	//generate grade from percentage
	public String generateGrade(float percentage){
		if(percentage >= 90)	return "A+";
		else if(percentage >= 80)	return "A";
		else if(percentage >= 60)	return "B+";
		else if(percentage >= 60)	return "B";
		else if(percentage >= 40)	return "c";
		else return "fail";
	}
	
	public void generateMarkSheet(){
		System.out.println("=========== Mark Sheet ===========");
		System.out.println("Student Roll No : " + s.rollNo);
		System.out.println("Student Name : "+ s.name);
		System.out.println("Course : "+ s.course);
		
		//print subjects marks
		System.out.println("\nMarks: ");
		for(int i=0; i < marks.length; i++){
			System.out.println("Subject " + (i+1) + " : " + marks[i]);
		}
		
		System.out.println("\nTotal Marks : " + totalMarks + "/" + 100*3);
		System.out.println("Percentage : " + percentage);
		System.out.println("Grade : " + grade);
		System.out.println("==================================");
	}
}