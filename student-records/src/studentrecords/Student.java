/*Author: Zenwyn Naicker*/
package studentrecords;

import java.util.ArrayList;

public class Student {

    //data fields
    private ArrayList<String> studentIDList = new ArrayList<String>();
    private ArrayList<String> studentNameList = new ArrayList<String>();
    private ArrayList<Integer> studentAgeList = new ArrayList<Integer>();
    private ArrayList<String> studentEmailList = new ArrayList<String>();
    private ArrayList<String> studentCourseList = new ArrayList<String>();

    //setters and getters
    public ArrayList<String> getStudentIDList() {
        return studentIDList;
    }

    public void setStudentIDList(ArrayList<String> studentIDList) {
        this.studentIDList = studentIDList;
    }

    public ArrayList<String> getStudentNameList() {
        return studentNameList;
    }

    public void setStudentNameList(ArrayList<String> studentNameList) {
        this.studentNameList = studentNameList;
    }

    public ArrayList<Integer> getStudentAgeList() {
        return studentAgeList;
    }

    public void setStudentAgeList(ArrayList<Integer> studentAgeList) {
        this.studentAgeList = studentAgeList;
    }

    public ArrayList<String> getStudentEmailList() {
        return studentEmailList;
    }

    public void setStudentEmailList(ArrayList<String> studentEmailList) {
        this.studentEmailList = studentEmailList;
    }

    public ArrayList<String> getStudentCourseList() {
        return studentCourseList;
    }

    public void setStudentCourseList(ArrayList<String> studentCourseList) {
        this.studentCourseList = studentCourseList;
    }

    //compulsory methods
    public void saveStudent(String id, String name, int age, String email, String course) {
        studentIDList.add(id);
        studentNameList.add(name);
        studentAgeList.add(age);
        studentEmailList.add(email);
        studentCourseList.add(course);
    }

    public String searchStudent(String id) {
        StringBuilder message = new StringBuilder();
        if (studentIDList.contains(id)) {
            int index = studentIDList.indexOf(id);
            message.append("STUDENT ID: ");
            message.append(studentIDList.get(index));
            message.append("\nSTUDENT NAME: ");
            message.append(studentNameList.get(index));
            message.append("\nSTUDENT AGE: ");
            message.append(studentAgeList.get(index));
            message.append("\nSTUDENT EMAIL: ");
            message.append(studentEmailList.get(index));
            message.append("\nSTUDENT COURSE: ");
            message.append(studentCourseList.get(index));
        } else {
            message.append("Student with Student Id: ");
            message.append(id);
            message.append(" was not found!");
        }
        return message.toString();
    }

    public String deleteStudent(String id) {
        StringBuilder message = new StringBuilder();
        if (studentIDList.contains(id)) {
            int index = studentIDList.indexOf(id);
            studentIDList.remove(index);
            studentNameList.remove(index);
            studentAgeList.remove(index);
            studentEmailList.remove(index);
            studentCourseList.remove(index);
            message.append("Student with Student Id: ");
            message.append(id);
            message.append(" WAS deleted!");
        } else {
            message.append("Student with Student Id: ");
            message.append(id);
            message.append(" was not found!");
        }
        return message.toString();
    }

    public String StudentReport() {
        StringBuilder message = new StringBuilder();
        for (int i = 0, j = 1; i < studentIDList.size(); i++, j++) {
            message.append("\nSTUDENT ");
            message.append(j);
            message.append("\n-----------------------------");
            message.append("\nSTUDENT ID: ");
            message.append(studentIDList.get(i));
            message.append("\nSTUDENT NAME: ");
            message.append(studentNameList.get(i));
            message.append("\nSTUDENT AGE: ");
            message.append(studentAgeList.get(i));
            message.append("\nSTUDENT EMAIL: ");
            message.append(studentEmailList.get(i));
            message.append("\nSTUDENT COURSE: ");
            message.append(studentCourseList.get(i));
            message.append("\n-----------------------------");
        }
        return message.toString();
    }

    public void exitStudentApplication() {
        System.exit(0);
    }

    //additional methods
    public String displayStartScreen() {
        StringBuilder startScreen = new StringBuilder();
        startScreen.append("STUDENT MANAGEMENT APPLICATION");
        startScreen.append("\n***********************************");
        startScreen.append("\nEnter (1) to launch menu or any other key to exit");
        return startScreen.toString();
    }

    public String displayMenu() {
        StringBuilder menu = new StringBuilder();
        menu.append("Please select one of the following menu items:");
        menu.append("\n(1) Capture a new student.");
        menu.append("\n(2) Search for a student.");
        menu.append("\n(3) Delete a student.");
        menu.append("\n(4) Print student report.");
        menu.append("\n(5) Exit Application.");
        return menu.toString();
    }
   
    public boolean validateAge(int age) {
        if (age >= 16) {
            return true;
        } else {
            return false;
        }
    } 

}

/**
 * ***********************************************************************************************************
 * ***********************************************************************************************************
 * Title: Java Programming 9th Edition Author: Joyce Farrell Date: 2018
 * ***********************************************************************************************************
 * ***********************************************************************************************************
 */
/**
 * ***********************************************************************************************************
 * ***********************************************************************************************************
 * Title: ArrayList in Java Author: GeeksforGeeks Date: 2024 Availability:
 * https://www.geeksforgeeks.org/arraylist-in-java/
 * ***********************************************************************************************************
 * ***********************************************************************************************************
 */
