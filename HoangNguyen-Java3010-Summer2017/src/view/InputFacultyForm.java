/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

 /*
 * InputFacultyForm.java
 *
 * Created on Jun 18, 2017, 3:28:15 PM
 */
package view;

import backend.Faculty;
import backend.OfferedCourse;
import data.DataContainer;
import java.util.ArrayList;
import java.util.GregorianCalendar;

/*
 * @author Hoang Nguyen
 */

public class InputFacultyForm extends javax.swing.JFrame {

    ArrayList<Faculty> listOfFaculty;
    // Local copy of the application's data
    private DataContainer data;
    // Create a new Faculty object
    Faculty newFaculty = new Faculty();

    /**
     * Creates new form InputFacultyForm
     */
    public InputFacultyForm(DataContainer data) {
        initComponents();
        this.listOfFaculty = data.getListOfFaculties();
        // Store a local copy of the data
        this.data = data;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        addressField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        snnField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        dateOfBirthMonth = new javax.swing.JSpinner();
        dateOfBirthDay = new javax.swing.JSpinner();
        dateOfBirthYear = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        dateOfHireMonth = new javax.swing.JSpinner();
        dateOfHireDay = new javax.swing.JSpinner();
        dateOfHireYear = new javax.swing.JSpinner();
        dateOfTerminationMonth = new javax.swing.JSpinner();
        dateOfTerminationDay = new javax.swing.JSpinner();
        dateOfTerminationYear = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        statusComboBox = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        saveButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        salaryField = new javax.swing.JTextField();
        addCourseButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Add Faculty Information");

        jLabel2.setText("Name");

        jLabel3.setText("Address:");

        jLabel4.setText("Social Security Number");

        jLabel5.setText("Date of Birth");

        dateOfBirthMonth.setModel(new javax.swing.SpinnerListModel(new String[] {"Jan", "Feb", "Mar", "Apr", "June", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}));

        dateOfBirthDay.setModel(new javax.swing.SpinnerListModel(new String[] {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));

        dateOfBirthYear.setModel(new javax.swing.SpinnerListModel(new String[] {"1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019"}));

        jLabel6.setText("Year");

        jLabel7.setText("Month");

        jLabel8.setText("Day");

        dateOfHireMonth.setModel(new javax.swing.SpinnerListModel(new String[] {"Jan", "Feb", "Mar", "Apr", "June", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}));

        dateOfHireDay.setModel(new javax.swing.SpinnerListModel(new String[] {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));

        dateOfHireYear.setModel(new javax.swing.SpinnerListModel(new String[] {"1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019"}));

        dateOfTerminationMonth.setModel(new javax.swing.SpinnerListModel(new String[] {"Jan", "Feb", "Mar", "Apr", "June", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}));

        dateOfTerminationDay.setModel(new javax.swing.SpinnerListModel(new String[] {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));

        dateOfTerminationYear.setModel(new javax.swing.SpinnerListModel(new String[] {"1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019"}));

        jLabel9.setText("Date of Hire");

        jLabel10.setText("Date of Termination");

        statusComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Full Time", "Part Time" }));

        jLabel11.setText("Status");

        jLabel12.setText("Salary");

        jLabel13.setText("Enter Single Digits, no spaces, no commas");

        jLabel14.setText("Add Classes for Faculty");

        jScrollPane1.setViewportView(jTextPane1);

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        closeButton.setText("Exit");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        addCourseButton.setText("Add Courses");
        addCourseButton.setEnabled(false);
        addCourseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCourseButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(207, 207, 207)
                                .addComponent(jLabel1))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(nameField, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                                        .addComponent(addressField)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(10, 10, 10)
                                            .addComponent(jLabel7)
                                            .addGap(55, 55, 55)
                                            .addComponent(jLabel8)
                                            .addGap(48, 48, 48)
                                            .addComponent(jLabel6))
                                        .addComponent(dateOfHireMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(74, 74, 74)
                                            .addComponent(dateOfHireDay, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(144, 144, 144)
                                            .addComponent(dateOfHireYear, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(dateOfTerminationMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(144, 144, 144)
                                            .addComponent(dateOfTerminationYear, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(dateOfBirthMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(dateOfBirthDay, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(dateOfBirthYear, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(snnField)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(74, 74, 74)
                                            .addComponent(dateOfTerminationDay, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel13)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(salaryField, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(statusComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, 113, Short.MAX_VALUE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(saveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(clearButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(closeButton, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE))
                                .addGap(25, 25, 25))
                            .addComponent(addCourseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clearButton))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(snnField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(closeButton)
                            .addComponent(jLabel4))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel6)
                    .addComponent(addCourseButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dateOfBirthMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dateOfHireMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dateOfTerminationMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dateOfBirthDay, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateOfHireDay, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateOfTerminationDay, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dateOfBirthYear, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateOfHireYear, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateOfTerminationYear, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(statusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(salaryField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addGap(22, 22, 22)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:

        String errorString = "";

        // Retrieve the values from the form
        String name = this.nameField.getText();
        String address = this.addressField.getText();
        String ssn = this.snnField.getText();

        // Retrieve status and convert to Status enumerated type and store in object
        String selectedStatus = (String) this.statusComboBox.getSelectedItem();
        if (selectedStatus.equals("Full Time")) {
            newFaculty.setStatus(Faculty.Status.FULLTIME);
        } else if (selectedStatus.equals("Part Time")) {
            newFaculty.setStatus(Faculty.Status.PARTTIME);
        }
        // Retrieve salary and convert to a double before storing in object
        String salarystring = this.salaryField.getText();
        Double salarydouble = Double.parseDouble(salarystring);
        newFaculty.setSalary(salarydouble);

        // Store the data in the new student object
        if (this.nameField.getText().equals("")) {
            errorString += "Missing:\n name";
        } else {
            newFaculty.setName(name);
        }
        if (this.addressField.getText().equals("")) {
            errorString += "\n address";
        } else {
            newFaculty.setAddress(address);
        }
        if (this.snnField.getText().equals("")) {
            errorString += "\n SSN";
        } else {
            newFaculty.setSocialSecurityNumber(ssn);
        }

        // Retrieve date of birth values from spinners and convert to a date object
        // These fields return objects so we need to first convert them to strings 
        // and thenconvert them to integers
        Integer dobYear = Integer.parseInt(dateOfBirthYear.getValue().toString());
        Integer dobDay = Integer.parseInt(dateOfBirthDay.getValue().toString());
        // Let's use a month mapper to convert the month to a numeric value
        Integer dobMonth = this.getIntegerMonthFromString(dateOfBirthMonth.getValue().toString());
        GregorianCalendar dateOfBirth = new GregorianCalendar(dobYear, dobMonth, dobDay);
        // Store in object
        newFaculty.setDateOfBirth(dateOfBirth);

        // Retrieve date of hire values from spinners and convert to a date object
        // These fields return objects so convert them to first convert them to strings 
        // and thenconvert them to integers
        Integer dohYear = Integer.parseInt(dateOfHireYear.getValue().toString());
        Integer dohDay = Integer.parseInt(dateOfHireDay.getValue().toString());
        // Let's use a different month mapper for date of hire and convert the 
        // string month to a GregorianCalendar class month
        Integer dohMonth = this.getMonthFromMonthArray(dateOfHireMonth.getValue().toString());
        GregorianCalendar dateOfHire = new GregorianCalendar(dohYear, dohMonth, dohDay);
        // Store in object
        newFaculty.setDateOfHire(dateOfHire);

        // Retrieve date of termination values from spinners and convert to a date object
        // These fields return objects so convert them to first convert them to strings 
        // and thenconvert them to integers
        Integer dotYear = Integer.parseInt(dateOfTerminationYear.getValue().toString());
        Integer dotDay = Integer.parseInt(dateOfTerminationDay.getValue().toString());
        Integer dotMonth = this.getIntegerMonthFromString(dateOfTerminationMonth.getValue().toString());
        GregorianCalendar dateOfTermination = new GregorianCalendar(dotYear, dotMonth, dotDay);

        // Store the object in the application data model list of courses
        newFaculty.setDateOfTermination(dateOfTermination);

        this.data.getListOfFaculties().add(newFaculty);

        this.addCourseButton.setEnabled(true);
    }//GEN-LAST:event_saveButtonActionPerformed

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_closeButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        // TODO add your handling code here:
        this.nameField.setText(" ");
        this.addressField.setText("");
        this.snnField.setText(" ");
        this.dateOfBirthMonth.setValue("Jan");
        this.dateOfBirthDay.setValue("01");
        this.dateOfBirthYear.setValue("1950");
        this.dateOfHireMonth.setValue("Jan");
        this.dateOfHireDay.setValue("01");
        this.dateOfHireYear.setValue("1950");
        this.dateOfTerminationMonth.setValue("Jan");
        this.dateOfTerminationDay.setValue("01");
        this.dateOfTerminationYear.setValue("1950");
        this.statusComboBox.setSelectedIndex(0);
        this.salaryField.setText(" ");

    }//GEN-LAST:event_clearButtonActionPerformed

    private void addCourseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCourseButtonActionPerformed
        ArrayList<OfferedCourse> listOfAvailableCourses = data.getListOfClassBases();
        NewStudentCourseAddForm nscaf = new NewStudentCourseAddForm(newFaculty, listOfAvailableCourses);
        nscaf.setVisible(true);

    }//GEN-LAST:event_addCourseButtonActionPerformed
    private int getIntegerMonthFromString(String stringmonth) {
        if (stringmonth.equals("Jan")) {
            return 0;
        } else if (stringmonth.equals("Feb")) {
            return 1;
        } else if (stringmonth.equals("Mar")) {
            return 2;
        } else if (stringmonth.equals("Apr")) {
            return 3;
        } else if (stringmonth.equals("May")) {
            return 4;
        } else if (stringmonth.equals("June")) {
            return 5;
        } else if (stringmonth.equals("Jul")) {
            return 6;
        } else if (stringmonth.equals("Aug")) {
            return 7;
        } else if (stringmonth.equals("Sep")) {
            return 8;
        } else if (stringmonth.equals("Oct")) {
            return 9;
        } else if (stringmonth.equals("Nov")) {
            return 10;
        } else {
            return 11;
        }
    }

    private int getMonthFromMonthArray(String stringmonth) {
        String[] monthArray = {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
            "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        for (int i = 0; i < 12; i++) {
            if (stringmonth.equals(monthArray[i])) {
                return i;
            }
        }
        return 12;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCourseButton;
    private javax.swing.JTextField addressField;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton closeButton;
    private javax.swing.JSpinner dateOfBirthDay;
    private javax.swing.JSpinner dateOfBirthMonth;
    private javax.swing.JSpinner dateOfBirthYear;
    private javax.swing.JSpinner dateOfHireDay;
    private javax.swing.JSpinner dateOfHireMonth;
    private javax.swing.JSpinner dateOfHireYear;
    private javax.swing.JSpinner dateOfTerminationDay;
    private javax.swing.JSpinner dateOfTerminationMonth;
    private javax.swing.JSpinner dateOfTerminationYear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField salaryField;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField snnField;
    private javax.swing.JComboBox statusComboBox;
    // End of variables declaration//GEN-END:variables
}
