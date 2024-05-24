package FunksjonelleGrensesnittOrd2021;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UniversityHandbook {

	private final List<Course> courses = new ArrayList<>();

	/**
	 * Reads all the courses from a given input stream. The courses are on this
	 * form: courseName, averageGrade, prerequisite 1, prerequisite 2,
	 * prerequisite 3....
	 * 
	 * See courses.txt in src/main/resources/del7_og_8 for an example file.
	 * 
	 * Calling this method should remove any existing courses from the handbook.
	 * 
	 * A given course can have anything from 0 to unlimited number of prerequisites.
	 * The courses do not necessary come in order. Meaning that a course may appear
	 * in the prerequisite list as a never before seen course. The method should read
	 * in all courses, and set the courseName, averageGrade and prerequisites of all
	 * courses and add the courses to the courses field of this class.
	 * 
	 * A skeleton code to read from file is provided to you but feel free to write
	 * your own code for this.
	 * 
	 * You can assume that all lines from the file will be on the correct format.
	 * 
	 * @param stream InputStream containing the course data
	 */
	public void readFromInputStream(InputStream stream) {
		try (Scanner scanner = new Scanner(stream)) {
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				String[] details = line.split(",");
				
				// TODO: implement remaining details
				
			}
		}

	}

	/**
	 * Gets the course with the courseName
	 * 
	 * @param courseName The name of the course
	 * 
	 * @return The course with the given name
	 */
	public Course getCourse(String courseName) {
		// TODO
		return null;
	}

	public List<Course> getCourses(){
		return new ArrayList<>(courses);
	}

	public static void main(String[] args) {
		UniversityHandbook handbook = new UniversityHandbook();
		// Reads inn all the files from the course
		handbook.readFromInputStream(handbook.getClass().getResourceAsStream("courses.txt"));
	}

}



//////////////////////////////////////////////// KOK /////////////////////////////////////////////////////////////

// public void readFromInputStream(InputStream stream) {
// 	try (Scanner scanner = new Scanner(stream)) {
// 		while (scanner.hasNextLine()) {
// 			String line = scanner.nextLine();
// 			String[] details = line.split(",");
			
// 			// Check if the class is already added if not create new, if it is added, add its avg grade
// 			Optional<Course> c_opt = courses.stream().filter(c -> c.getCourseName().equals(details[0])).findFirst();
			
// 			Course course;
// 			boolean add_flag = true;
// 			if (!c_opt.isPresent()){
// 				course = new Course(details[0], Double.parseDouble(details[1]));
// 			} else {
// 				// This c_opt has already been added and is thus missing its prereqs and average grade
// 				course = c_opt.get();
// 				course.setAverageGrade(Double.parseDouble(details[1]));
// 				add_flag = false;
// 			}

// 			// The prerequisites are still missing so we add these
// 			for (int i = 2; i < details.length; i++) {
// 				final int i_c = i;
// 				Optional<Course> prereq = courses.stream().filter(c -> c.getCourseName().equals(details[i_c])).findFirst();
				
// 				Course tmp;
// 				if (!prereq.isPresent()){
// 					tmp = new Course(details[i]);
// 					courses.add(tmp);
// 				} else {
// 					// This course has already been added in the past and can thus be used
// 					tmp = prereq.get();
// 				}

// 				course.addPrequisite(tmp);
// 			}
			
// 			if (add_flag)
// 				courses.add(course);
// 		}
// 	}

// 	System.out.println(courses);
// 	courses.stream().forEach(c -> System.out.println(c.getPrerequisites()));
// 	courses.stream().forEach(c -> System.out.println(c.getAverageGrade()));
// }