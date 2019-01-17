/*
 * Faculty course has set and get faculty course methods and a toString method
 * to display courseID.
 */
package backend;

import hnguyen.utilities.Logger;
import java.util.ArrayList;

/**
 *
 * @author Hoang Nguyen
 */
public class FacultyCourse implements ICourse {

    private ArrayList<Student> students = new ArrayList<Student>();
    private String courseId;

    /** Default, no-arg constructor */
    public FacultyCourse() {
        Logger.logInfo("FacultyCourse created with default values");
    }

    /** Overloaded constructor */
    public FacultyCourse(String courseId) {
        this.courseId = courseId;
        Logger.logInfo(this.toString() + " created");
    }

    public ArrayList<Student> getStudents() {
        return this.students;
    }

    @Override
    public String getCourseId() {
        return courseId;
    }

    @Override
    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
    /**
     * Add an existing list of students to the course
     */
    public void addStudents(ArrayList<Student> students) {
        this.students.addAll(students);
    }

    /**
     * toString will format the data as key/value pairs separated by a colon (:)
     * This will allow the data to be easily parsed using the String split method
     */
    @Override
    public String toString() {
        return "courseId=" + courseId;
    }
}
