import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentDAO studentDAO = new StudentDAO();

        
        studentDAO.addStudent(new Student(1, "Ravi Sharma", 20, "Male", "Mechanical Engg.", "2nd", "Fighting", LocalDate.of(2024, 11, 2), "Involved in physical altercation", "Canteen", "Amit, Saurav", "Prof. Gupta", "Suspension 2 weeks", "Resolved", "Warned for future behavior"));

        
        List<Student> students = studentDAO.getAllStudents();
        for (Student student : students) {
            System.out.println(student.getName());
        }

        
        Student studentToUpdate = students.get(0); 
        studentToUpdate.setName("Ravi Kumar");
        studentDAO.updateStudent(studentToUpdate);

        
        studentDAO.deleteStudent(1); 
    }
}
