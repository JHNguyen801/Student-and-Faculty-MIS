/*
 * Faculty class extends base class (Person). It contains data fields, overidding methods
 * and display faculty information.
 */
package backend;

import hnguyen.utilities.Logger;
import java.util.ArrayList;
import java.util.GregorianCalendar;

/**
 *
 * @author Hoang Nguyen
 */
public class Faculty extends Person {

    private GregorianCalendar dateOfHire;
    private GregorianCalendar dateOfTermination;
    private Status status;
    private double salary;
    
    ArrayList<FacultyCourse> listOfCourses = new ArrayList<FacultyCourse>();
    public enum Status {
        FULLTIME, PARTTIME
    }
    // Create 2 constructors, the first is holding all required data variable, 
    // and the second is a default constructor has no arguments
    public Faculty(String name, String address, String ssnum, GregorianCalendar dateOfBirth,
                   GregorianCalendar dateOfHire, Status status, double salary) {
        super(name, address, ssnum, dateOfBirth);
        this.dateOfHire = dateOfHire;
        this.salary = salary;
        this.status = status;
    }
    public Faculty() {
        Logger.logInfo("Faculty created with default values");
    }

    public GregorianCalendar getDateOfHire() {
        return dateOfHire;
    }

    public void setDateOfHire(GregorianCalendar dateOfHire) {
        this.dateOfHire = dateOfHire;
    }

    public GregorianCalendar getDateOfTermination() {
        return dateOfTermination;
    }

    public void setDateOfTermination(GregorianCalendar dateOfTermination) {
        this.dateOfTermination = dateOfTermination;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
         Logger.logInfo("Set status: " + this.status);
    }

    public ArrayList<FacultyCourse> getListOfCourses() {
        return listOfCourses;
    }

    public void setListOfCourses(ArrayList<FacultyCourse> listOfCourses) {
        this.listOfCourses = listOfCourses;
    }
    // ToString method to display faculty's date of hire, date of termination,
    // salary, status, and list of course.
    @Override
    public String toString() {
        return "Faculty{" + "name: " + name + ", address: " + address + ", ssn: " + socialSecurityNumber 
                + ", date of birth" + dateOfBirth.getTime() + ",dateOfHire=" + dateOfHire.getTime() 
                + ", dateOfTermination=" + dateOfTermination.getTime()
                + ", salary= " + salary + ", status= " + status + ", listOfCourses= " + listOfCourses + '}';
    }
}
