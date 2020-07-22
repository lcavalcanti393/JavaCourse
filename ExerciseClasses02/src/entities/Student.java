package entities;

public class Student {
	public String name;
	public double n1, n2, n3;
	
	public double studentGrade() {
		return n1+n2+n3;
	}
	
	public String studentStatus() {
		if(studentGrade() < 60.00) {
			return "\nFAILED\nMISSING "+
					String.format("%.2f",60.00-studentGrade())+" POINTS";
		}else {
			return "\nPASS";
		}
	}
	
	public String toString() {
		return "FINAL GRADE: "+String.format("%.2f", studentGrade()) + studentStatus();
	}

}
