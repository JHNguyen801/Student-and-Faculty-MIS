/*
 * Classroom interface has room number and type of room data variables.
 * A constructor holds room number and classroom data. A toString method
 * show room number and type of room.
 */
package backend;

/**
 *
 * @author Hoang Nguyen
 */
public class Classroom implements IClassroom {

    private String roomNumber;
    private RoomType typeOfRoom;

    // Enumerated list of room types restricts the type of room allowed
    public enum RoomType {
        LAB, CLASSROOM, LECTURE_HALL
    }

    // Default no-arg constructor, assume some default values
    public Classroom() {
        roomNumber = "000";
        typeOfRoom = RoomType.CLASSROOM;
    }

    // Overloaded constructor
    public Classroom(String number, RoomType typeOfRoom) {
        this.roomNumber = number;
        this.typeOfRoom = typeOfRoom;
    }

    @Override
    public String getRoomNumber() {
        return this.roomNumber;
    }

    @Override
    public RoomType getTypeOfRoom() {
        return typeOfRoom;
    }

    @Override
    public void setRoomNumber(String room) {
        this.roomNumber = room;
    }

    @Override
    public void setTypeOfRoom(RoomType typeOfRoom) {
        this.typeOfRoom = typeOfRoom;
    }

    @Override
    public String toString() {
        return "Classroom{" + "roomNumber=" + roomNumber + ", typeOfRoom=" + typeOfRoom + '}';
    }   

}
