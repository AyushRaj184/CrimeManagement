import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentDAO studentDAO = new StudentDAO();
        
       
        studentDAO.addStudent(new Student(1, "Ravi Sharma", 20, "Male", "Mechanical Engg.", "2nd", "Fighting", LocalDate.of(2024, 11, 2), "Involved in physical altercation", "Canteen", "Amit, Saurav", "Prof. Gupta", "Suspension 2 weeks", "Resolved", "Warned for future behavior"));
        studentDAO.addStudent(new Student(2, "Sneha Joshi", 19, "Female", "Computer Science", "1st", "Vandalism", LocalDate.of(2024, 10, 25), "Graffiti on campus walls", "Library", "Rajesh, Priya", "Mr. Singh", "Cleaning duty", "Resolved", ""));
        studentDAO.addStudent(new Student(3, "Ankit Verma", 21, "Male", "Electronics", "3rd", "Cheating", LocalDate.of(2024, 11, 1), "Caught copying in exams", "Exam Hall", "Invigilator Sharma", "Dr. Kumar", "Exam nullification", "Resolved", "Apologized"));
        studentDAO.addStudent(new Student(4, "Meera Kapoor", 20, "Female", "Biotechnology", "2nd", "Substance abuse", LocalDate.of(2024, 9, 15), "Found with prohibited substances", "Hostel", "None", "Ms. Rathore", "Counseling", "Pending", ""));
        studentDAO.addStudent(new Student(5, "Aman Mehta", 22, "Male", "Civil Engg.", "4th", "Bullying", LocalDate.of(2024, 10, 20), "Harassing junior students", "Hostel Block B", "Shalini, Vivek", "Mr. Khanna", "Final warning", "Resolved", ""));
        studentDAO.addStudent(new Student(6, "Riya Nair", 18, "Female", "Physics", "1st", "Cheating", LocalDate.of(2024, 11, 4), "Using mobile to cheat in class", "Physics Lab", "Prof. Arora", "Dr. Singh", "Fined ₹500", "Resolved", ""));
        studentDAO.addStudent(new Student(7, "Kunal Thakur", 20, "Male", "History", "2nd", "Fighting", LocalDate.of(2024, 8, 30), "Fight during inter-dept sports", "Sports Ground", "Sanjay, Neha", "Coach Sharma", "Suspension 1 week", "Resolved", ""));
        studentDAO.addStudent(new Student(8, "Priya Das", 19, "Female", "Chemistry", "1st", "Vandalism", LocalDate.of(2024, 10, 10), "Damage to lab equipment", "Chemistry Lab", "Prof. Mishra", "Dr. Thomas", "Lab restriction", "Resolved", ""));
        studentDAO.addStudent(new Student(9, "Rohit Patil", 22, "Male", "Computer Science", "4th", "Cyberbullying", LocalDate.of(2024, 9, 28), "Online harassment of classmates", "Online Portal", "None", "Prof. Malik", "Counseling", "Pending", ""));
        studentDAO.addStudent(new Student(10, "Kavya Iyer", 18, "Female", "Mathematics", "1st", "Proxy attendance", LocalDate.of(2024, 11, 3), "Faking attendance for others", "Classroom", "Faculty monitoring", "Ms. Verma", "Suspension 3 days", "Resolved", ""));
        
        
        List<Student> students = studentDAO.getAllStudents();
        
        
        System.out.println("List of Students:");
        for (Student student : students) {
            System.out.println("ID: " + student.getStudentID() + ", Name: " + student.getName() + ", Age: " + student.getAge() +
                               ", Gender: " + student.getGender() + ", Department: " + student.getDepartment() + 
                               ", Year: " + student.getYear() + ", Crime Type: " + student.getCrimeType() +
                               ", Crime Date: " + student.getCrimeDate() + ", Incident Description: " + student.getIncidentDescription() +
                               ", Location: " + student.getLocation() + ", Witnesses: " + student.getWitnessNames() + 
                               ", Reporting Staff: " + student.getReportingStaff() + ", Punishment: " + student.getPunishment() +
                               ", Status: " + student.getStatus() + ", Remarks: " + student.getRemarks());
        }
    }
}
