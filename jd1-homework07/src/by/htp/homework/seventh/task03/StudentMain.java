package by.htp.homework.seventh.task03;

public class StudentMain {

	public static void main(String[] args) {
		int n = 10;
		
		Student[] students = new Student[n];
		
		students[0] = new Student();
		
		students[0].setName("Abraham");
		students[0].setSurname("Lincoln");
		students[0].setGroup(1);
		students[0].setMarks(new int[] {10, 10, 10, 10, 9});
		
		students[1] = new Student();
		
		students[1].setName("Boris");
		students[1].setSurname("Yeltsin");
		students[1].setGroup(1);
		students[1].setMarks(new int[] {3, 3, 2, 2, 1});
		
		students[2] = new Student();
		
		students[2].setName("George");
		students[2].setSurname("Bush");
		students[2].setGroup(1);
		students[2].setMarks(new int[] {3, 4, 2, 3, 3});
		
		students[3] = new Student();
		
		students[3].setName("Boris");
		students[3].setSurname("Johnson");
		students[3].setGroup(1);
		students[3].setMarks(new int[] {8, 8, 8, 9, 1});

		students[4] = new Student();
		
		students[4].setName("Nikola");
		students[4].setSurname("Tesla");
		students[4].setGroup(1);
		students[4].setMarks(new int[] {10, 10, 10, 10, 10});
		
		students[5] = new Student();
		
		students[5].setName("Elon");
		students[5].setSurname("Musk");
		students[5].setGroup(2);
		students[5].setMarks(new int[] {9, 9, 10, 9, 9});
		
		students[6] = new Student();
		
		students[6].setName("Chuck");
		students[6].setSurname("Norris");
		students[6].setGroup(2);
		students[6].setMarks(new int[] {6, 6, 6, 6, 6});
		
		students[7] = new Student();
		
		students[7].setName("Caligula");
		students[7].setSurname("Augustus");
		students[7].setGroup(1);
		students[7].setMarks(new int[] {1, 2, 3, 2, 1});
		
		students[8] = new Student();
		
		students[8].setName("Alexander");
		students[8].setSurname("Bell");
		students[8].setGroup(1);
		students[8].setMarks(new int[] {9, 10, 10, 9, 10});
		
		students[9] = new Student();
		
		students[9].setName("Stas");
		students[9].setSurname("Mihailov");
		students[9].setGroup(1);
		students[9].setMarks(new int[] {5, 3, 3, 4, 4});
		
		Student[] best = findBest(students);
		
		printStudents(best);
		
	}
	
	public static void printStudents(Student[] sts) {
		
		for (Student student : sts) {
			System.out.println(student.getName() + " " + student.getSurame() + " from group " + student.getGroup());
		}
	}
	
	public static Student[] findBest(Student[] sts) {
		Student[] bestStudents = new Student[sts.length];
		
		int i;
		i = 0;
		
		for (Student student : sts) {
			if (isAlevel(student.getMarks())) {
				bestStudents[i] = student;
				i++;
			}
		}
		
		if (i == sts.length) {	
			return bestStudents;
		} else {
			Student[] bestStudents1 = new Student[i];
			
			for (i = 0; i < bestStudents1.length; i++) {
				bestStudents1[i] = bestStudents[i];
			}
			return bestStudents1;
		}
	}
	
	public static boolean isAlevel (int[] marks) {
		
		for (int i = 0; i < marks.length; i++) {
			if (marks[i] < 9) {
				return false;
			}
		}
		return true;
	}

}
