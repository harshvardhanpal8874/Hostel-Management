public class room {
    private int roomNumber;
    private int capacity;
    private int occupied;

     room(int roomNumber , int capacity){
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.occupied = 0;
    }

    int getroomNumber(){
        return this.roomNumber;
    }

    int getCapacity(){
        return this.capacity;
    }
    
    int getoccupied(){
        return this.occupied;
    }

}
