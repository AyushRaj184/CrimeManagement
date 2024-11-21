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
                Student student = new Student();
                student.setStudentID(resultSet.getInt("StudentID"));
                student.setName(resultSet.getString("Name"));
                student.setAge(resultSet.getInt("Age"));
                student.setGender(resultSet.getString("Gender"));
                student.setDepartment(resultSet.getString("Department"));
                student.setYear(resultSet.getString("Year"));
                student.setCrimeType(resultSet.getString("CrimeType"));
                student.setCrimeDate(resultSet.getDate("CrimeDate").toLocalDate());
                student.setIncidentDescription(resultSet.getString("IncidentDescription"));
                student.setLocation(resultSet.getString("Location"));
                student.setWitnessNames(resultSet.getString("WitnessNames"));
                student.setReportingStaff(resultSet.getString("ReportingStaff"));
                student.setPunishment(resultSet.getString("Punishment"));
                student.setStatus(resultSet.getString("Status"));
                student.setRemarks(resultSet.getString("Remarks"));

                students.add(student);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return students;
    }
}
