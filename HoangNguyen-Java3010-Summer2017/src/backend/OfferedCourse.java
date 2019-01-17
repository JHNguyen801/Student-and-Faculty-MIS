/*
 * OfferdCourse class implements Icourse interface. It has all the overriding  
 * set and get methods of ICourse interface
 */
package backend;

import hnguyen.utilities.Logger;

/**
 *
 * @author Hoang Nguyen
 */
public class OfferedCourse implements ICourse
{
    String courseId;
    String courseName;
    Classroom classroom;
    
    public OfferedCourse() {
        Logger.logInfo("Offered Course created with default values");
    }
    // A constructor hold courseId, course name, and classroom data
    public OfferedCourse( String courseId, String courseName, Classroom classroom) {
        this.classroom = classroom;
        this.courseId = courseId;
        this.courseName = courseName;
    }
    // Create set and get methods
    public Classroom getClassroom() {
        return classroom;
    }
   
    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }
    @Override
    public String getCourseId() {
        return courseId;
    }

    @Override
    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    // ToString method to dispaly courseID, coursename, and classroom information
    @Override
    public String toString() {
        return "OfferedCourse{" + "courseIDNumber=" + courseId + ", courseName=" + courseName + ", classroom=" + classroom + '}';
    }
}
