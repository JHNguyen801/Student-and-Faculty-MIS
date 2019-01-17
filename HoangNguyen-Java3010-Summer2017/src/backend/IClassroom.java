/*
 * Classroom Interface has set and get room number and type of room methods
 * 
 */
package backend;

/**
 *
 * @author Hoang Nguyen
 */
public interface IClassroom 
{
    String getRoomNumber();
    void setRoomNumber(String roomnumber);
    
    Classroom.RoomType getTypeOfRoom();
    void setTypeOfRoom(Classroom.RoomType roomtype);
    
}
