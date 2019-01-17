/*
 * This class holds a classroom list in the array list
 * 
 */
package data;

import backend.Classroom;
import backend.Faculty;
import backend.Student;
import backend.OfferedCourse;
import java.util.ArrayList;
import com.sun.org.apache.xml.internal.serialize.OutputFormat;
import com.sun.org.apache.xml.internal.serialize.XMLSerializer;
import hnguyen.utilities.Logger;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;

/**
 *
 * @author Hoang Nguyen
 */
public class DataContainer {
    
    private ArrayList<Classroom> listOfClassrooms = new ArrayList<Classroom>();
    private ArrayList<OfferedCourse> listOfClassBases = new ArrayList<OfferedCourse>();
    private ArrayList<Student> listOfStudents = new ArrayList<Student>();
    private ArrayList<Faculty> listOfFaculties = new ArrayList<Faculty>();
    
    
    
    public DataContainer() {
    }
    
    public ArrayList<Classroom> getListOfClassrooms() {
        return listOfClassrooms;
    }
    
    public void setListOfClassrooms(ArrayList<Classroom> listOfClassrooms) {
        this.listOfClassrooms = listOfClassrooms;
    }
    
    public ArrayList<OfferedCourse> getListOfClassBases() {
        return listOfClassBases;
    }
    
    public void setListOfClassBases(ArrayList<OfferedCourse> listOfClassBases) {
        this.listOfClassBases = listOfClassBases;
    }
    
    public ArrayList<Faculty> getListOfFaculties() {
        return listOfFaculties;
    }
    
    public void setListOfFaculties(ArrayList<Faculty> listOfFaculties) {
        this.listOfFaculties = listOfFaculties;
    }
    
    public ArrayList<Student> getListOfStudents() {
        return listOfStudents;
    }
    
    public void setListOfStudents(ArrayList<Student> listOfStudents) {
        this.listOfStudents = listOfStudents;
    }

    /**
     * Writes out text file
     */
    public void writeTextFile() {
        
        PrintWriter pw = null, pw2 = null, pw3 = null, pw4 = null;
        try {
            pw = new PrintWriter("Classroom.txt");
            pw2 = new PrintWriter("Offeredcourse.txt");
            pw3 = new PrintWriter("Student.txt");
            pw4 = new PrintWriter("Faculty.txt");
            // Loop through the array list of classrooms and print comma delimited to a text file
            for (Classroom classroom : listOfClassrooms) {
                pw.println(classroom.toString());
            }
            for (OfferedCourse offeredcourse : listOfClassBases) {
                pw2.println(offeredcourse.toString());
            }
            for (Student student : listOfStudents) {
                pw3.println(student.toString());
            }
            for (Faculty faculty : listOfFaculties) {
                pw4.println(faculty.toString());
            }     
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            // Flush the output stream and close the file
            pw.flush();
            pw.close();
            pw2.flush();
            pw2.close();
            pw3.flush();
            pw3.close();
            pw4.flush();
            pw4.close();
        }
    }
     
    /**
     * Creates a serialized object
     */
    public void writeSerializedFile() {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(
                    new FileOutputStream("Classroom.ser"));
            ObjectOutputStream oos2 = new ObjectOutputStream(
                    new FileOutputStream("Offeredcourse.ser"));
            ObjectOutputStream oos3 = new ObjectOutputStream(
                    new FileOutputStream("Student.ser"));            
            ObjectOutputStream oos4 = new ObjectOutputStream(
                    new FileOutputStream("Faculty.ser"));
            oos.writeObject(this.listOfClassrooms);           
            oos2.writeObject(this.listOfClassBases);
            oos3.writeObject(this.listOfStudents);
            oos4.writeObject(this.listOfFaculties);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Create an XML formatted output file
     */
    public void writeXML() {

        // get a document builder factory
        DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
        
        try {
            // get a document builder from the factory
            DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();

            // create an instance of the document model
            Document doc = docBuilder.newDocument();

            // create the root element <list_of_classrooms> and append to document
            Element root = doc.createElement("list_of_classrooms");
            doc.appendChild(root);
            Element root2 = doc.createElement("list_of_offered_course");
            doc.appendChild(root2);
            Element root3 = doc.createElement("list_of_students");
            doc.appendChild(root3);
            Element root4 = doc.createElement("list_of_faculty");
            doc.appendChild(root4);           

            // Loop through the array list of classrooms and create the classroom elements of the xml file
            for (Classroom classroom : listOfClassrooms) {
                
                Element classroomElement = doc.createElement("classroom");
                
                Element roomNumberElement = doc.createElement("room_number");
                Text roomNumberText = doc.createTextNode(classroom.getRoomNumber());
                roomNumberElement.appendChild(roomNumberText);
                classroomElement.appendChild(roomNumberElement);
                
                Element roomtypeElement = doc.createElement("room_type");
                Text roomtypetText = doc.createTextNode(classroom.getTypeOfRoom().toString());
                roomtypeElement.appendChild(roomtypetText);
                classroomElement.appendChild(roomtypeElement);
                
                root.appendChild(classroomElement);
                
            }
            // Loop through the array list of offered course and create the offered course elements of the xml file
            for (OfferedCourse offeredcourse : listOfClassBases) {
                Element courseIDElement = doc.createElement("course ID");
                Element courseNameElement = doc.createElement("course name");
                
                Text IDText = doc.createTextNode(offeredcourse.getCourseId());
                courseIDElement.appendChild(IDText);
                courseIDElement.appendChild(courseIDElement);
                Text nameText = doc.createTextNode(offeredcourse.getCourseName());
                courseNameElement.appendChild(nameText);
                courseNameElement.appendChild(courseNameElement);
                
            }
            // Loop through the array list of student and create the student elements of the xml file
            for (Student student : listOfStudents) {
                Element studentElement = doc.createElement("name");
                Element addressElement = doc.createElement("address");
                Element ssnElement = doc.createElement("ssn");
                Element dobElement = doc.createElement("dob");
                Element dogElement = doc.createElement("graduation");
                Element currentgpaElement = doc.createElement("current gpa");
                
                Text nameText = doc.createTextNode(student.getName());
                studentElement.appendChild(nameText);
                studentElement.appendChild(studentElement);
                
                Text addressText = doc.createTextNode(student.getAddress());
                addressElement.appendChild(addressText);
                addressElement.appendChild(addressElement);
                
                Text ssnText = doc.createTextNode(student.getSocialSecurityNumber());
                ssnElement.appendChild(ssnText);
                ssnElement.appendChild(ssnElement);
                
                Text dobText = doc.createTextNode(student.getDateOfBirth().toString());
                dobElement.appendChild(dobText);
                dobElement.appendChild(dobElement);
                
                Text dogText = doc.createTextNode(student.getDateOfGraduation().toString());
                dogElement.appendChild(dogText);
                dogElement.appendChild(dogElement);
                
                Text currentgpaText = doc.createTextNode(String.valueOf(student.getCurrentGPA()));
                currentgpaElement.appendChild(currentgpaText);
                currentgpaElement.appendChild(currentgpaElement);
                
            }
            // Loop through the array list of faculty and create the faculty elements of the xml file
            for (Faculty faculty : listOfFaculties) {
                Element nameElement = doc.createElement("name");
                Element addressElement = doc.createElement("address");
                Element ssnElement = doc.createElement("ssn");
                Element dobElement = doc.createElement("dob");
                Element doHireElement = doc.createElement("date_of_hire");
                Element doTerminationElement = doc.createElement("date_of_termination");
                Element statusElement = doc.createElement("status");
                Element salaryElement = doc.createElement("salary");
                
                Text nameText = doc.createTextNode(faculty.getName());
                nameElement.appendChild(nameText);
                nameElement.appendChild(nameElement);
                
                Text addressText = doc.createTextNode(faculty.getAddress());
                addressElement.appendChild(addressText);
                addressElement.appendChild(addressElement);
                
                Text ssnText = doc.createTextNode(faculty.getSocialSecurityNumber());
                ssnElement.appendChild(ssnText);
                ssnElement.appendChild(ssnElement);
                
                Text dobText = doc.createTextNode(faculty.getDateOfBirth().toString());
                dobElement.appendChild(dobText);
                dobElement.appendChild(dobElement);
                
                Text dohText = doc.createTextNode(faculty.getDateOfHire().toString());
                doHireElement.appendChild(dohText);
                doHireElement.appendChild(doHireElement);
                
                Text dotText = doc.createTextNode(faculty.getDateOfTermination().toString());
                doTerminationElement.appendChild(dotText);
                doTerminationElement.appendChild(doHireElement);
                
                Text statusText = doc.createTextNode(faculty.getStatus().toString());
                statusElement.appendChild(statusText);
                statusElement.appendChild(statusElement);                
                
                Text salaryText = doc.createTextNode(String.valueOf(faculty.getSalary()));
                salaryElement.appendChild(salaryText);
                salaryElement.appendChild(salaryElement);
                
            }

            // use default xml formatting in the file
            OutputFormat format = new OutputFormat(doc);
            format.setIndenting(true);

            // open the output stream
            XMLSerializer serializer = new XMLSerializer(
                    new FileOutputStream(new File("classroom.xml")), format);
            XMLSerializer serializer2 = new XMLSerializer(
                    new FileOutputStream(new File("offeredcourse.xml")), format);
            XMLSerializer serializer3 = new XMLSerializer(
                    new FileOutputStream(new File("student.xml")), format);
            XMLSerializer serializer4 = new XMLSerializer(
                    new FileOutputStream(new File("faculty.xml")), format);
            // write out the object
            serializer.serialize(doc);
            serializer2.serialize(doc);
            serializer3.serialize(doc);
            serializer4.serialize(doc);
            
        } catch (Exception pce) {
            System.out.println(pce.getMessage());
        }
    }
     /**
     * Reads a serialized object, in this case, a list of classrooms
     */
    public void readSerializedFile() {
        try {
            ObjectInputStream oos = new ObjectInputStream(
                    new FileInputStream("classroom.ser"));
            ObjectInputStream oos1 = new ObjectInputStream(new FileInputStream("offeredcourse.ser"));
            ObjectInputStream oos2 = new ObjectInputStream(new FileInputStream("student.ser"));
            ObjectInputStream oos3 = new ObjectInputStream(new FileInputStream("faculty.ser"));
            // Read the serialized object and cast to its original type
            this.listOfClassrooms = (ArrayList<Classroom>) oos.readObject();
            this.listOfClassBases = (ArrayList<OfferedCourse>) oos1.readObject();
            this.listOfStudents = (ArrayList<Student>) oos2.readObject();
            this.listOfFaculties = (ArrayList<Faculty>) oos3.readObject();
            System.out.println(this.listOfClassrooms.toString());
        } catch (Exception exp) {
            Logger.logError(exp.getMessage());
        }
    }

    /**
     * Read a delimited text file, the delimeter is ":". You need to know the
     * format of the text file in order to parse it correctly. The format of the
     * text file is:
     *
     * Example: RoomNumber:45:RoomType:CLASSROOM
     */
    public void readTextFile() {
        try {
            boolean eof = false;
            BufferedReader bw = new BufferedReader(new FileReader("classroom.txt" + "offeredcourse.txt" + "student.txt" + "faculty.txt" ));
            while (!eof) {
                String lineFromFile = bw.readLine();
                if (lineFromFile == null) {
                    eof = true;
                } else {
                    String[] lineElements = lineFromFile.split(":");
                    Classroom classroom = new Classroom();
                    classroom.setRoomNumber(lineElements[1]);
                    if (lineElements[3].equals("LAB")) {
                        classroom.setTypeOfRoom(Classroom.RoomType.LAB);
                    } else if (lineElements[3].equals("CLASSROOM")) {
                        classroom.setTypeOfRoom(Classroom.RoomType.CLASSROOM);
                    } else if (lineElements[3].equals("LECTURE_HALL")) {
                        classroom.setTypeOfRoom(Classroom.RoomType.LECTURE_HALL);
                    }
                    // add the classroom to the data model arraylist
                    listOfClassrooms.add(classroom);
                    OfferedCourse course = new OfferedCourse();
                    Student student = new Student();
                    course.setCourseId(lineElements[2]);
                    course.setCourseName(lineFromFile);
                    listOfClassBases.add(course);
                    student.setName(lineFromFile);
                    student.setAddress(lineFromFile);
                    listOfStudents.add(student);
                    Faculty faculty = new Faculty();
                    faculty.setName(lineFromFile);
                    faculty.setAddress(lineFromFile);
                    faculty.setSalary(0);
                    faculty.setStatus(Faculty.Status.FULLTIME);
                    listOfFaculties.add(faculty);
                }
            }
        } catch (Exception exp) {
             Logger.logError(exp.getMessage());
        }
    }

    public void readXML() {

        try {

            // Get the factory instance
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();

            //Using factory, get an instance of document builder
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();

            //parse using builder to get document representation of the XML file
            Document xmlDocument = documentBuilder.parse("classroom.xml");
            Document xmlDocument1 = documentBuilder.parse("offeredcourse.xml");
            //get the root elememt (list_of_classrooms)
            Element list_of_classrooms = xmlDocument.getDocumentElement();
            Element list_of_courses = xmlDocument1.getDocumentElement();
            
            //retrieve the list of classrooms from the root of the document
            NodeList classroomList = list_of_classrooms.getElementsByTagName("classroom");
            NodeList courseList = list_of_courses.getElementsByTagName("offeredcourse");
            //loop through the list of classrooms and create classroom objects            
            for (int i = 0; i < classroomList.getLength(); i++) {

                //get a classroom element from the list
                Element classroomElement = (Element) classroomList.item(i);

                //get the data for the classroom, we retrieve node lists for convenience
                //but we will only have one of each so we will use the first element in 
                // each list
                NodeList roomNumberList = classroomElement.getElementsByTagName("room_number");
                NodeList roomTypeList = classroomElement.getElementsByTagName("room_type");
                
                //create a classroom
                Classroom newclassroom = new Classroom();
                
                //retrieve the first element from the roomnumber list and get its content (text value)
                String roomnumber = roomNumberList.item(0).getTextContent();
                
                //set the value in the classroom
                newclassroom.setRoomNumber(roomnumber);
                
                //retrieve the first element from the roomtype list and get its content (text value)
                String roomtype = roomTypeList.item(0).getTextContent();
                
                //compare this string to the values in the RoomType class and set the correct value
                if (roomtype.equals("LAB")) {
                    newclassroom.setTypeOfRoom(Classroom.RoomType.LAB);
                } else if (roomtype.equals("CLASSROOM")) {
                    newclassroom.setTypeOfRoom(Classroom.RoomType.CLASSROOM);
                } else if (roomtype.equals("LECTURE_HALL")) {
                    newclassroom.setTypeOfRoom(Classroom.RoomType.LECTURE_HALL);
                }
                
                //add the classroom to the data model arraylist
                listOfClassrooms.add(newclassroom);
            }
            
            for (int i = 0; i < courseList.getLength(); i++) {

                //get a classroom element from the list
                Element courseElement = (Element) courseList.item(i);

                //get the data for the classroom, we retrieve node lists for convenience
                //but we will only have one of each so we will use the first element in 
                // each list
                NodeList courseIDList = courseElement.getElementsByTagName("courseID");
                NodeList courseNameList = courseElement.getElementsByTagName("course_Name");
                
                //create a classroom
                OfferedCourse newcourse = new OfferedCourse();
                
                //retrieve the first element from the courseID list and get its content (text value)
                String courseID = courseIDList.item(0).getTextContent();
                String courseName = courseNameList.item(0).getTextContent();
                
                //set the value in the courseId and courseName
                newcourse.setCourseId(courseID);
                newcourse.setCourseName(courseName);
                //add the course to the data model arraylist
                listOfClassBases.add(newcourse);
            }
        } // if wrong file name is entered, let Main Menu handle it
        catch (Exception exp) {
           Logger.logError(exp.getMessage());
        }

    }
    
}
