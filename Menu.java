import java.util.ArrayList;
import java.util.Scanner;
public class Menu {
    Scanner sc = new Scanner(System.in);
    int []arr = {3,3,3,3,3,3,3,3,3,3};
    service service = new service();
    int studentNumber = 1;


    void demo(){
        

        System.out.println(" === Welcome to Hostel management System === \n");

        
        
        while(true){
            
            System.out.println("---please select one options among them ---");
            System.out.println("1. Add Student  ");
            System.out.println("2. Add Room  ");            
            System.out.println("3.Display Student  ");
            System.out.println("4. Update Student ");
            System.out.println("5. Remove Student  ");
            System.out.println("6. Search Student ");
            System.out.println("7. Exit  ");
            int choice = Integer.parseInt(sc.nextLine());
            
            switch(choice){
            case 1:
                addStudent();
                break;
            case 2:
                addRoom();
                break;
            case 3:
                displayStudent();
                break;
            case 4:
                updateStudent();
                break;
            case 5:
                removeStudent();
                break;
            case 6:
                searchStudent();
                break; 
            case 7:
                System.exit(0); 
                break;
            default:
                System.out.println("Invalid input!! try again");
        }
    }
    }
        
        

    void addStudent(){
            System.out.println(" enter - Student ID");
            int stdId = Integer.parseInt(sc.nextLine());
            System.out.println(" Enter - Student Name ");
            String stdName = sc.nextLine();
            System.out.println(" Enter - Student Age ");
            int stdAge = Integer.parseInt(sc.nextLine());
            System.out.println(" Enter - Student Course ");
            String stdCourse = sc.nextLine();
            System.out.println(" Enter - Student Phone Number ");
            String stdPhnNo = sc.nextLine();
            while( stdPhnNo.length() < 10){
                System.out.println(" Please enter valid contect number");
                stdPhnNo = sc.nextLine();
            }

            student obj = new student(stdId, stdName, stdAge,  stdCourse, stdPhnNo);
            service.addStudent(obj);
            
        }

        void addRoom(){
            ArrayList<student> list = service.getStudent();
            for(student s : list){
                if(s.getroomNumber()==0){
                    for(int i=0;i<arr.length;i++){
                        if(arr[i]>0){
                            arr[i]--;
                            s.SetroomNumber(i+1);
                            break;
                        }
                    }
                }
            }

            System.out.println("Room alloted to all students!!");
            
        }

        



        void displayStudent(){
            ArrayList<student> list = service.getStudent();

            if(list.isEmpty()){
                System.out.println(" no record found !! ");
            }
            for(student data : list){
                print(data);
        }
        
        }

        void print(student data){
            System.out.println("=================");

            System.out.println("Student Number ->" +studentNumber++);
            System.out.println("Student ID :" + data.getStdId());
            System.out.println("Name : " + data.getStdName());
            System.out.println("Age : " +   data.getStdAge());
            System.out.println("Course : " + data.getStdCourse());
            System.out.println("Phone number : " + data.getStdPhnNo());
            System.out.println("Room number : " + data.getroomNumber() );
            
            System.out.println("=================");
        }
        

        void updateStudent(){
            System.out.println(" enter the ID of student whose details are incorrect !!");
            int id = Integer.parseInt(sc.nextLine());
            System.out.println("enter what you want to update  \n 1. Name \n 2. Age \n 3. Course \n 4. Phone Number");
            int option = Integer.parseInt(sc.nextLine());
            switch (option) {
                case 1:
                    System.out.println("Enter the Updated name :- ");
                    String newName = sc.nextLine();
                    service.updateDetails(id,option,newName);
                    break;
                case 2:
                    System.out.println("Enter the updated age in number :- ");
                    String newAge = sc.nextLine();
                    service.updateDetails(id,option,newAge);
                    break;
                case 3:
                    System.out.println("Enter the updated course detail :- ");
                    String newCourse = sc.nextLine();
                    service.updateDetails(id,option,newCourse);
                    break;
                case 4:
                    System.out.println("Enter the new phone number :- ");
                    String newPhoneNo = sc.nextLine();
                    service.updateDetails(id,option,newPhoneNo);
                    break;
                default:
                    System.out.println("Invalid Input");
            }
            

        }

        void removeStudent(){
            System.out.println(" --enter the name of the student you want to remove --");
            String nameDelete = sc.nextLine();
            service.removeStudent(nameDelete);
        }


        void searchStudent(){
            System.out.println("--enter the name of student you want to search !!-- ");
            String searchStudentName = sc.nextLine();
            service.searchStudent(searchStudentName);
        }     
        
        
}


