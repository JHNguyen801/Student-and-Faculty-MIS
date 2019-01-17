/*
 * Course interface has set and get course ID and course name methods.
 * 
 */
package backend;

/**
 *
 * @author Hoang Nguyen
 */
public interface ICourse {

    String getCourseId();
    void setCourseId(String courseId);
    @Override
    String toString();;

}
