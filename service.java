import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class service {
    Scanner sc = new Scanner(System.in);
    ArrayList<student> stdlist = new ArrayList<>();

    void addStudent(student s){
        stdlist.add(s);
        System.out.println(" student added sucessfully !!");
    }

     ArrayList<student> getStudent(){
        return new ArrayList<>(stdlist);
     }

     void removeStudent(String nameDelete){       
        Iterator<student> itr = stdlist.iterator();
        while (itr.hasNext()) {
             student nameHave = itr.next();
            if (nameHave.getStdName().equals(nameDelete)) {
               itr.remove();
               System.out.println("Student removed from record !!");
               return;
    }
}
        System.out.println("Record not found !!");
        
     }


     void updateDetails(int id,int option,String updated ){
       
        for(student s : stdlist){
            if(s.getStdId()==id){

                switch (option) {
                    case 1:
                        s.setStdName(updated);
                        break;
                    case 2:
                        s.setStdAge(Integer.parseInt(updated));
                        break;
                    case 3:
                        s.setStdCourse(updated);
                        break;
                    case 4:
                        s.setStdPhnNo(updated);
                        break;
                }
            }
        
     }
     System.out.println(" record updated sucessfully !! ");
}

    void searchStudent(String searchStudentName){
        boolean b = false;
        for(student s : stdlist){
            if(s.getStdName().equalsIgnoreCase(searchStudentName))
            {
                System.out.println(" record found ");
                System.out.println("========================");
                System.out.println("Student ID : " + s.getStdId());
                System.out.println("Name : " +s.getStdName());
                System.out.println("Age : " + s.getStdAge());
                System.out.println("Course : " + s.getStdCourse());
                System.out.println("Phone Number : " + s.getStdPhnNo());
                System.out.println("Room Number : " + s.getroomNumber());
                System.out.println("========================");
                b = true;
                break; 
                
            }
        }
        if( b == false){
            System.out.println("record not found !!");
        }
    }

    // void changeRoom(String name,int number){
    //     ArrayList<student> list = student.getroomNumber();


    //     if()
    // }
}
