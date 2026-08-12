 public class student {
    private static int x=1;
    private int sNo;
    private int stdId;
    private String stdName;
    private int stdAge;
    private String stdCourse;
    private String stdPhnNo;
    private int roomNumber;

    


    student(int stdId,String stdName,int stdAge, String stdCourse,String stdPhnNo){
        this.sNo=x++;
        this.stdId = stdId ;
        this.stdName = stdName;
        this.stdAge = stdAge;
        this.stdCourse = stdCourse;
        this.stdPhnNo = stdPhnNo;


    }

    int getStdId(){
        return this.stdId;
    }

    String getStdName(){
        return this.stdName;
    }

    void setStdName(String newName){
        this.stdName = newName;
    }
    int getStdAge(){
        return this.stdAge;
    }

    void setStdAge(int newAge){
        this.stdAge = newAge;
    }

    String getStdCourse(){
        return this.stdCourse;
    }

    void setStdCourse(String newCourse){
        this.stdCourse = newCourse;
    }

    String getStdPhnNo(){
        return stdPhnNo;
    }

    void setStdPhnNo(String newPhnNo){
        this.stdPhnNo = newPhnNo;
    }

    int getroomNumber(){
        return roomNumber;
    }

    void SetroomNumber(int roomNumber){
        this.roomNumber = roomNumber;
    }

    @Override
        public String toString(){
            return "SNo. :"+ sNo+ " , ID : "+stdId+" , Name :"+stdName+" , Age :"+stdAge+" , Course :"+stdCourse+" , contect No. :"+stdPhnNo + "Room Number : " + roomNumber;
        }

}
