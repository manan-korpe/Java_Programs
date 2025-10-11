/* 25 Assume that there are two packages, student and exam. A student package contains Student
class and the exam package contains Result class. Write a program that generates mark sheet
for students.
*/

import student.Student;
import exam.Result;

public class Practical_25{
	public static void main(String[] args){
		Student s1 = new Student(1,"abc");
		
		int[] tempMarks = {96, 68, 77};
		Result r1 = new Result(s1, tempMarks);
		
		r1.generateMarkSheet();
	}
}