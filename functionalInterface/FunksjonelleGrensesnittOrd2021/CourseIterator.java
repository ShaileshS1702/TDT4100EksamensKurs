package FunksjonelleGrensesnittOrd2021;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CourseIterator implements Iterator<Course> {
    // Iterate over courses in order of ascending grade

    private List<Course> courses = new ArrayList<>();

    public CourseIterator() {
        UniversityHandbook hb = new UniversityHandbook();
        hb.readFromInputStream(hb.getClass().getResourceAsStream("courses.txt"));
        courses = hb.getCourses();
    }

    @Override
    public boolean hasNext() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'hasNext'");
    }

    @Override
    public Course next() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'next'");
    }

}
