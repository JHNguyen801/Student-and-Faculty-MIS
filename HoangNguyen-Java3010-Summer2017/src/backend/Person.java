/*
 * This is the base class that has set and get methods and toString method to 
 * display the test class information
 */
package backend;

import java.util.GregorianCalendar;

/**
 *
 * @author Hoang Nguyen
 */
public class Person implements IPerson {

    // Instantiate the variables
    String name;
    String address;
    GregorianCalendar dateOfBirth;
    String socialSecurityNumber;

    //  Create 2 constructors, the first is holding all required data variable, 
    //  and the second is a default constructor
    public Person(String name, String address, String socialSecurityNumber, GregorianCalendar dateOfBirth) {
        this.name = name;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.socialSecurityNumber = socialSecurityNumber;
    }
    public Person() {
    }
    // Create set and get methods to display the student and faculty information
    @Override
    public GregorianCalendar getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public void setDateOfBirth(GregorianCalendar dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     *
     * @return
     */
    @Override
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    @Override
    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }
    // ToString to show person name, address, date of birth, social security number
    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", address=" + address + ", dateOfBirth="
                + dateOfBirth + ", socialSecurityNumber=" + socialSecurityNumber + '}';
    }
}
