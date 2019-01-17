/*
 * InputStudentInfo.java
 *
 * Created on Jun 11, 2017, 3:10:16 PM
 */
package view;

import backend.OfferedCourse;
import backend.Student;
import data.DataContainer;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import java.util.GregorianCalendar;
import java.awt.event.ActionListener;
import exceptionhandling.NoDataException;
import exceptionhandling.ErrorDialog;
import exceptionhandling.InvalidDataException;

/**
 *
 * @author Hoang Nguyen
 */
public class InputStudentInfo extends javax.swing.JFrame implements ActionListener {

    ArrayList<Student> listOfStudents;
    // Local copy of the application's data
    private DataContainer data;
    // Data model used for the list of courses on the form.  This list will be
    // used to assign courses to a student
    private DefaultListModel listModel = new DefaultListModel();
    
    // Local copy of new student
    Student newStudent;

    public InputStudentInfo(DataContainer data) {
         
        initComponents();
        // Link the buttons to the actionPerformed method
        this.clearButton.addActionListener(this);
        this.saveButton.addActionListener(this);
        this.closeButton.addActionListener(this);
        // Store a local copy of the data
        this.data = data;
        // Retrieve the list of students from the data model and store locally
        this.listOfStudents = data.getListOfStudents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        currentGPAField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        socialSecurityField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        addressField = new javax.swing.JTextField();
        nameField = new javax.swing.JTextField();
        dateOfBirthField = new javax.swing.JTextField();
        dateOfGraduationField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        addCourseButton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel1.setText("Name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel3.setText("Student Information");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel7.setText("Date of Graduation");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel8.setText("Current GPA");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel2.setText("Address");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel4.setText("Social Security No.");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel5.setText("Date of Birth");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel6.setText("MM-DD-YYYY");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel9.setText("MM-DD-YYYY");

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

        jLabel10.setText("Add Student");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(193, 193, 193)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(27, 27, 27)
                .addComponent(jLabel10)
                .addGap(285, 285, 285))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(addressField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                            .addComponent(nameField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(socialSecurityField)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(currentGPAField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(dateOfGraduationField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(dateOfBirthField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel6))))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addCourseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel10))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(socialSecurityField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dateOfBirthField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dateOfGraduationField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(currentGPAField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addCourseButton)))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
// TODO add your handling code here:
    this.dispose();
}//GEN-LAST:event_closeButtonActionPerformed
    @Override
    public void actionPerformed(java.awt.event.ActionEvent event) {

        //  Create a hanndling event which button is clicked to take place.
        String buttonClicked = event.getActionCommand();
        // Create input exception when a user click save and clear button
        if (buttonClicked.equals("Save")) {
            try {
                saveData();
            } catch (NoDataException error) {
                ErrorDialog errordialog = new ErrorDialog(error.getMessage());
                errordialog.setVisible(true);
            } catch (InvalidDataException error) {
                ErrorDialog errordialog = new ErrorDialog(error.getMessage());
                errordialog.setVisible(true);
            }
        } else if (buttonClicked.equals("Clear")) {
            this.nameField.setText("");
            this.addressField.setText("");
            this.socialSecurityField.setText("");
            this.dateOfBirthField.setText("");
            this.dateOfGraduationField.setText("");
            this.currentGPAField.setText("");
        } else if (buttonClicked.equals("Close")) {
            this.dispose();
        }
    }
private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
    // Create a new classroom object
}//GEN-LAST:event_saveButtonActionPerformed

    private void saveData() throws NoDataException, InvalidDataException {
        // Create a new classroom object
         newStudent = new Student();
         
        // Retrieve the values from the form
        String name = this.nameField.getText();
        String address = this.addressField.getText();
        String ssn = this.socialSecurityField.getText();
        String dob = this.dateOfBirthField.getText();    
        String graduation = this.dateOfGraduationField.getText();
        String currentgpa = this.currentGPAField.getText();      
    
        // If no room name, address, ssn, dob, graduation, and current gpa are input, throw an exception and display 
        // the error dialog.  Don't allow the user to continue until the
        // error if fixed.
        if (name.length() == 0) {
            throw new NoDataException("Missing name");
        }
        if (address.length() == 0) {
            throw new NoDataException("Missing address");
        }
        if (ssn.length() == 0) {
            throw new NoDataException("Missing SSN");
        }
        // If input data for SNN is less than 9 or more than 9 digits, throw an exception.
        if (ssn.length() < 9 || ssn.length() > 9) {
            throw new InvalidDataException("SSN must be 9 digits");
        }
         newStudent.setSocialSecurityNumber(ssn);  
                for (int i = 0; i < ssn.length(); i++) {
                    if (Character.isLetter(ssn.charAt(i)))
                        throw new InvalidDataException("Must be numbers only!");
                }
        if (dob.length() == 0) {
            throw new NoDataException("Missing date of birth");
        }
        if (graduation.length() == 0) {
            throw new NoDataException("Missing date of graduation");
        }
        if (currentgpa.length() == 0) {
            throw new NoDataException("Missing current GPA");
        }
        // Store the data in the new student object
        newStudent.setName(name);
        newStudent.setAddress(address);
        newStudent.setSocialSecurityNumber(ssn);
        // Retrieve GPA and convert to a double before storing in object
        // If there is a problem converting to a double, it will throw a built in
        // runtime exception.        
        float gpadouble = Float.parseFloat(currentgpa);
        newStudent.setCurrentGPA(gpadouble);
        // Add to the list in the data model
        this.listOfStudents.add(newStudent);
        
         // Store the dates - ugly and somewhat complicated private date string 
        // parser function takes the text from the form and generates a 
        // GregorianCalendar object
        // Retrieve date of birth value from form and pass to private helper method
        // Returns a calendar object
        GregorianCalendar gcDate = this.getDate(this.dateOfBirthField.getText());

        // Store 
        newStudent.setDateOfBirth(gcDate);

        // Retrieve date of birth graduation from form and pass to private helper method
        // Returns a calendar object
        gcDate = this.getDate(this.dateOfGraduationField.getText());

        // Store 
        newStudent.setDateOfGraduation(gcDate);

        // Now that we have a new student, enable adding courses
        this.addCourseButton.setEnabled(true);               
    }

private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
// TODO add your handling code here:
    this.nameField.setText(" ");
    this.addressField.setText(" ");
    this.socialSecurityField.setText(" ");
    this.dateOfBirthField.setText("");
    this.dateOfGraduationField.setText("");
    this.currentGPAField.setText("");
}//GEN-LAST:event_clearButtonActionPerformed

private void addCourseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCourseButtonActionPerformed
        ArrayList<OfferedCourse> listOfAvailableCourses = data.getListOfClassBases();
        NewStudentCourseAddForm nscaf = new NewStudentCourseAddForm(newStudent, listOfAvailableCourses);
        nscaf.setVisible(true);        
}//GEN-LAST:event_addCourseButtonActionPerformed
 /**
     * Parses the string date using the string split function and builds a
     * calender date
     *
     * @param formStringDate
     * @return GregorianCalendar
     */
    private GregorianCalendar getDate(String formStringDate) {

        // Split the string into pieces
        String[] dateElements = formStringDate.split("-");
        // Let's use a private month mapper function to convert the month to a numeric value
        Integer dobMonth = this.getIntegerMonthFromString(dateElements[0]);
        Integer dobDay = Integer.parseInt(dateElements[1]);
        Integer dobYear = Integer.parseInt(dateElements[2]);

        // Set the date
        GregorianCalendar newdate = new GregorianCalendar(dobYear, dobMonth, dobDay);
        
        // Return date
        return newdate;
    }

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCourseButton;
    private javax.swing.JTextField addressField;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton closeButton;
    private javax.swing.JTextField currentGPAField;
    private javax.swing.JTextField dateOfBirthField;
    private javax.swing.JTextField dateOfGraduationField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nameField;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField socialSecurityField;
    // End of variables declaration//GEN-END:variables
}
