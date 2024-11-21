import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
    
    public void addStudent(Student student) {
        String query = "INSERT INTO students (StudentID, Name, Age, Gender, Department, Year, CrimeType, CrimeDate, IncidentDescription, Location, WitnessNames, ReportingStaff, Punishment, Status, Remarks) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        try (Connection connection = DatabaseUtil.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setInt(1, student.getStudentID());
            preparedStatement.setString(2, student.getName());
            preparedStatement.setInt(3, student.getAge());
            preparedStatement.setString(4, student.getGender());
            preparedStatement.setString(5, student.getDepartment());
            preparedStatement.setString(6, student.getYear());
            preparedStatement.setString(7, student.getCrimeType());
            preparedStatement.setDate(8, Date.valueOf(student.getCrimeDate()));
            preparedStatement.setString(9, student.getIncidentDescription());
            preparedStatement.setString(10, student.getLocation());
            preparedStatement.setString(11, student.getWitnessNames());
            preparedStatement.setString(12, student.getReportingStaff());
            preparedStatement.setString(13, student.getPunishment());
            preparedStatement.setString(14, student.getStatus());
            preparedStatement.setString(15, student.getRemarks());

            preparedStatement.executeUpdate();
            System.out.println("Student added successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    
    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        String query = "SELECT * FROM students";

        try (Connection connection = DatabaseUtil.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            while (resultSet.next()) {
                Student student = new Student(
                    resultSet.getInt("StudentID"),
                    resultSet.getString("Name"),
                    resultSet.getInt("Age"),
                    resultSet.getString("Gender"),
                    resultSet.getString("Department"),
                    resultSet.getString("Year"),
                    resultSet.getString("CrimeType"),
                    resultSet.getDate("CrimeDate").toLocalDate(),
                    resultSet.getString("IncidentDescription"),
                    resultSet.getString("Location"),
                    resultSet.getString("WitnessNames"),
                    resultSet.getString("ReportingStaff"),
                    resultSet.getString("Punishment"),
                    resultSet.getString("Status"),
                    resultSet.getString("Remarks")
                );
                students.add(student);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return students;
    }

    
    public void updateStudent(Student student) {
        String query = "UPDATE students SET Name=?, Age=?, Gender=?, Department=?, Year=?, CrimeType=?, CrimeDate=?, IncidentDescription=?, Location=?, WitnessNames=?, ReportingStaff=?, Punishment=?, Status=?, Remarks=? WHERE StudentID=?";

        try (Connection connection = DatabaseUtil.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setString(1, student.getName());
            preparedStatement.setInt(2, student.getAge());
            preparedStatement.setString(3, student.getGender());
            preparedStatement.setString(4, student.getDepartment());
            preparedStatement.setString(5, student.getYear());
            preparedStatement.setString(6, student.getCrimeType());
            preparedStatement.setDate(7, Date.valueOf(student.getCrimeDate()));
            preparedStatement.setString(8, student.getIncidentDescription());
            preparedStatement.setString(9, student.getLocation());
            preparedStatement.setString(10, student.getWitnessNames());
            preparedStatement.setString(11, student.getReportingStaff());
            preparedStatement.setString(12, student.getPunishment());
            preparedStatement.setString(13, student.getStatus());
            preparedStatement.setString(14, student.getRemarks());
            preparedStatement.setInt(15, student.getStudentID());

            preparedStatement.executeUpdate();
            System.out.println("Student updated successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    
    public void deleteStudent(int studentID) {
        String query = "DELETE FROM students WHERE StudentID=?";

        try (Connection connection = DatabaseUtil.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setInt(1, studentID);
            preparedStatement.executeUpdate();
            System.out.println("Student deleted successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
