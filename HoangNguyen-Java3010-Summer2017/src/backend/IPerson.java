/*
 * Person interface has get and set name, address, SSN, date of birth methods
 * 
 */
package backend;

import java.util.GregorianCalendar;

/**
 *
 * @author Hoang Nguyen
 */
public interface IPerson 
{
    public String getName();

    public String getAddress();

    public String getSocialSecurityNumber();

    public GregorianCalendar getDateOfBirth();

    public void setName(String name);

    public void setAddress(String address);

    public void setSocialSecurityNumber(String SocialSecurityNumber);

    public void setDateOfBirth(GregorianCalendar dateOfBirth);
}        


