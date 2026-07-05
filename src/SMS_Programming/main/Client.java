package SMS_Programming.main;

import SMS_Programming.dao.StudentDao;
import SMS_Programming.dao.StudentDaoInterface;
import SMS_Programming.model.Student;

import java.util.Scanner;

public class Client {
    public static final String xc = "         S,dmmb;.ffffffffdlmmmmfrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrruuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuumsuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuukkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk cTUDENT MANAGEMENT SYSTEM";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StudentDaoInterface dao = new StudentDao();

        System.out.println("\n==================================================");
        System.out.println(xc);
        System.out.println("==================================================");
        while (true){
            System.out.println("\n1. Add Student"+
                    "\n2. Show All
//------------------------------------------------------------------------------------------------

            System.out.println("Enter your choice :- ");
            int ch =sc.nextInt();
            switch (ch){
                case 1:{
                    System.out.println("Add Student");
                    System.out.println("Enter student name :- ");
                    String name = sc.next();
                    System.out.println("Enter your clg name :- ");
                    String clgName = sc.next();
                    System.out.println("Enter your city name :- ");
                    String city = sc.next();
                    System.out.println("Enter your percentage :- ");
                    double percentage = sc.nextDouble();
                    Student st = new Student(name,clgName,city,percentage);
//--------------------------------------------------------------------------------------------
                    boolean ans = dao.insertStudent(st);
                    if (ans){
                        System.out.println("Student Inserted Successfully !");
                    } else {
                        System.out.println("Something went wrong, please try again !");
                    }

                } break;
//----------------------------------------------------------------------------------------------
                case 2:{
                    System.out.println("Show all students");
                    dao.showAllStudents();
                } break;

                case 3:{
                    System.out.println("Get student based on roll number");
                    System.out.println("Enter roll no :- ");
                    int rollNo = sc.nextInt();
                    boolean f = dao.showAllStudentById(rollNo);
                    if (!f){
                        System.out.println("Not Available Student with this Roll No !!");
                    }
                } break;

                case 4:{
                    System.out.println("Delete student");
                    System.out.println("Enter the roll no to delete :- ");
                    int roll=sc.nextInt();
                    boolean ff = dao.delete(roll);
                    if (ff){
                        System.out.println("Record Deleted Successfully !");
                    } else {
                        System.out.println("Something went Wrong !");
                    }
                } break;

                case 5:{
                    System.out.println("Update student");
                    System.out.println("\n1. Update name\n2. Update clgName");
                    System.out.print("Enter your choice :- ");
                    int choice = sc.nextInt();
                    if (choice == 1){
                        System.out.print("Enter the roll no for update -> ");
                        int rollN = sc.nextInt();
                        System.out.print("Enter the new name :- ");
                        String newN = sc.next();
                        Student std = new Student();
                        std.setName(newN);
                        boolean flag =dao.update(rollN,newN,choice,std);
                        if (flag){
                            System.out.println("Updated Successfully ! ");
                        } else {
                            System.out.println("Something went wrong !");
                        }

                    }
                } break;

                case 6:{
                    System.out.println("thank you using student management application !");
                } break;

                default: {
                    System.out.println("Please enter valid choice !!");
                }
            }
        }

    }
}
