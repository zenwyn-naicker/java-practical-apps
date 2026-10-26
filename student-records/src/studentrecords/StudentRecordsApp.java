/*Author: Zenwyn Naicker*/
package studentrecords;
import java.util.InputMismatchException;
import java.util.Scanner;
public class StudentRecordsApp { 
    public static void main(String[] args) {
        //varibles
        String id;
        String name;
        int  age;
        String email;
        String course;
        //objects
        Scanner input = new Scanner(System.in);
        Student student = new Student();
        //display start screen
        System.out.println(student.displayStartScreen());
        int startScreenInput = input.nextInt();
        if (startScreenInput == 1){
            //display menu
            System.out.println(student.displayMenu());
            int menuInput = input.nextInt();
            while (menuInput != 5){
                switch(menuInput){
                    case 1 :  
                        //prompt new student details
                        System.out.println("CAPTURE A NEW STUDENT");
                        System.out.println("************************");
                        System.out.print("Enter the student id: ");
                        id = input.next();
                        System.out.print("Enter the student name: ");
                        name = input.next();
                        //reprompt for age until it is >=16
                        age = -1;
                        boolean validInput = false;
                        while (!validInput) {
                            try {
                                System.out.print("Please enter the student age >> ");
                                age = input.nextInt();
                                if (student.validateAge(age)) {
                                    validInput = true;
                                } else {
                                    System.out.println("You have entered an incorrect student age!!!");
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Invalid input. Please enter an integer.");
                                input.next(); 
                            }
                        }
                        System.out.print("Enter the student email: ");
                        email = input.next();  
                        //reprompt for email until it contains @
                        while (!(email.contains("@"))){
                            System.out.println("You have entered an invalid student email!!! (must contain @)");
                            System.out.print("Please re-enter the student email >> ");
                            email = input.next();
                        }   
                        System.out.print("Enter the student course: ");
                        course = input.next();
                        //save new student details to ArrayLists
                        student.saveStudent(id, name, age, email, course);
                        System.out.println("The student details have been successfully saved.");
                        break; 
                    case 2 :
                        //search ArrayLists for student and display details
                        System.out.print("Enter the student id to search: ");
                        id = input.next();       
                        System.out.println(student.searchStudent(id));
                        break; 
                    case 3 :
                        //delete student from ArrayLists and confirm deletion
                        System.out.print("Enter the student id to delete: ");
                        id = input.next(); 
                        System.out.println("Are you sure you want to delete student " + id + " from the system? Yes (y) to delete");
                        String answer = input.next(); 
                        if (answer.equalsIgnoreCase("y")){
                            System.out.println(student.deleteStudent(id));
                        }
                        break;
                    case 4 :
                        //print student report
                        System.out.println(student.StudentReport());
                        break;
                    case 5 :
                        //exit student application
                        break;
                     default :
                }
                //display menu
                System.out.println(student.displayMenu());
                menuInput = input.nextInt();
            }
            System.out.println("Exited Programme.");
        }
        //close scanner
        input.close();
        //exit programme
        student.exitStudentApplication();
    }
}

/*************************************************************************************************************
* ***********************************************************************************************************
* Title: Java Programming 9th Edition
* Author: Joyce Farrell
* Date: 2018
* ***********************************************************************************************************
*************************************************************************************************************/

/*************************************************************************************************************
* ***********************************************************************************************************
* Title: Scanner Class in Java
* Author: GeeksforGeeks
* Date: 2023
* Availability: https://www.geeksforgeeks.org/scanner-class-in-java/
* ***********************************************************************************************************
*************************************************************************************************************/

/*************************************************************************************************************
* ***********************************************************************************************************
* Title: Java try and catch
* Author: W3Schools
* Date: 2024
* Availability: https://www.w3schools.com/java/java_try_catch.asp
* ***********************************************************************************************************
*************************************************************************************************************/
