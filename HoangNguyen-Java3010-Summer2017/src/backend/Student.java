/*
 * This class derived from the base class (Person), it contains current GPA, date of graduation, student 
 * course list. In addition, it has the following overiding methods from the base class:
 * set and get methods   
 */
package backend;

import java.util.ArrayList;
import java.util.GregorianCalendar;

/**
 *
 * @author Hoang Nguyen
 */
public class Student extends Person {
    // Instantiate variable and create a course array list.
    double currentGPA;
    GregorianCalendar dateOfGraduation;
    ArrayList<StudentCourse> enrolledCourses = new ArrayList<StudentCourse>();
    // Create 2 constructors, the first is holding all required data variable, and the second is a default constructor
    public Student(double currentGPA, GregorianCalendar dateOfGraduation, String name, String address, String socialSecurityNumber, GregorianCalendar dateOfBirth) {
        super(name, address, socialSecurityNumber, dateOfBirth);
        this.currentGPA = currentGPA;
        this.dateOfGraduation = dateOfGraduation;
    }

    public Student() {
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public double getCurrentGPA() {
        return currentGPA;
    }

    public void setCurrentGPA(double currentGPA) {
        this.currentGPA = currentGPA;
    }

    public GregorianCalendar getDateOfGraduation() {
        return dateOfGraduation;
    }

    public void setDateOfGraduation(GregorianCalendar dateOfGraduation) {
        this.dateOfGraduation = dateOfGraduation;
    }
    // Create a student enrolled course array method
    public ArrayList<StudentCourse> getEnrolledCourses() {
        return enrolledCourses;
    }

    public void setEnrolledCourses(ArrayList<StudentCourse> enrolledCourses) {
        this.enrolledCourses = enrolledCourses;
    }
    // ToString to show student's name, address, SSN, DOB, Graduation date, enrolled course, gpa
    @Override
    public String toString() {
        return "Student: Person{" + "name= " + name + ", address= " + address + ", socialSecurityNumber= " + socialSecurityNumber
                + ", dateOfBirth= " + dateOfBirth.getTime() + ", Date Of Graduation= " + dateOfGraduation.getTime() + "<br>" + "Enrolled Courses: " + enrolledCourses + '}' + "GPA: " + currentGPA;
    }
}