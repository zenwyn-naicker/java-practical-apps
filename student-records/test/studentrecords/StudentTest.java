/*Author: Zenwyn Naicker*/
package studentrecords;

import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {

    //object
    Student student = new Student();

    @Test
    public void testSaveStudent() {
        student.saveStudent("999", "Jazz", 16, "Jazz@gmail.com", "BCAD");
        String expected = "999" + "Jazz" + 16 + "Jazz@gmail.com" + "BCAD";
        String actual = student.getStudentIDList().get(0)
                + student.getStudentNameList().get(0)
                + student.getStudentAgeList().get(0)
                + student.getStudentEmailList().get(0)
                + student.getStudentCourseList().get(0);
        assertEquals(expected, actual);
    }

    @Test
    public void testSearchStudent() {
        //student found
        student.saveStudent("999", "Jazz", 16, "Jazz@gmail.com", "BCAD");
        StringBuilder expected = new StringBuilder();
        expected.append("STUDENT ID: ");
        expected.append("999");
        expected.append("\nSTUDENT NAME: ");
        expected.append("Jazz");
        expected.append("\nSTUDENT AGE: ");
        expected.append("16");
        expected.append("\nSTUDENT EMAIL: ");
        expected.append("Jazz@gmail.com");
        expected.append("\nSTUDENT COURSE: ");
        expected.append("BCAD");
        String actual = student.searchStudent("999");
        assertEquals(expected.toString(), actual);

        //student NOT found
        StringBuilder expected2 = new StringBuilder();
        expected2.append("Student with Student Id: ");
        expected2.append("111");
        expected2.append(" was not found!");
        String actual2 = student.searchStudent("111");
        assertEquals(expected2.toString(), actual2);

    }

    @Test
    public void testDeleteStudent() {
        //student found
        student.saveStudent("999", "Jazz", 16, "Jazz@gmail.com", "BCAD");
        StringBuilder expected = new StringBuilder();
        expected.append("Student with Student Id: ");
        expected.append("999");
        expected.append(" WAS deleted!");
        String actual = student.deleteStudent("999");
        assertEquals(expected.toString(), actual);

        //student NOT found
        StringBuilder expected2 = new StringBuilder();
        expected2.append("Student with Student Id: ");
        expected2.append("111");
        expected2.append(" was not found!");
        String actual2 = student.deleteStudent("111");
        assertEquals(expected2.toString(), actual2);
    }

    @Test
    public void testStudentReport() {
        student.saveStudent("999", "Jazz", 16, "Jazz@gmail.com", "BCAD");
        StringBuilder expected = new StringBuilder();
        expected.append("\nSTUDENT ");
        expected.append(1);
        expected.append("\n-----------------------------");
        expected.append("\nSTUDENT ID: ");
        expected.append("999");
        expected.append("\nSTUDENT NAME: ");
        expected.append("Jazz");
        expected.append("\nSTUDENT AGE: ");
        expected.append(16);
        expected.append("\nSTUDENT EMAIL: ");
        expected.append("Jazz@gmail.com");
        expected.append("\nSTUDENT COURSE: ");
        expected.append("BCAD");
        expected.append("\n-----------------------------");
        String actual = student.StudentReport();
        assertEquals(expected.toString(), actual);
    }

    @Test
    public void testValidateAge() {
        //valid student age
        boolean validAge = (student.validateAge(16));
        assertTrue(validAge);

        //invalid student age
        boolean invalidAge = (student.validateAge(15));
        assertFalse(invalidAge);
    }

}
