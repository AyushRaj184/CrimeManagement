import java.time.LocalDate;

public class Student {
    private int studentID;
    private String name;
    private int age;
    private String gender;
    private String department;
    private String year;
    private String crimeType;
    private LocalDate crimeDate;
    private String incidentDescription;
    private String location;
    private String witnessNames;
    private String reportingStaff;
    private String punishment;
    private String status;
    private String remarks;

   
    public Student(int studentID, String name, int age, String gender, String department, String year, 
                   String crimeType, LocalDate crimeDate, String incidentDescription, String location, 
                   String witnessNames, String reportingStaff, String punishment, String status, String remarks) {
        this.studentID = studentID;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.year = year;
        this.crimeType = crimeType;
        this.crimeDate = crimeDate;
        this.incidentDescription = incidentDescription;
        this.location = location;
        this.witnessNames = witnessNames;
        this.reportingStaff = reportingStaff;
        this.punishment = punishment;
        this.status = status;
        this.remarks = remarks;
    }

    
    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getCrimeType() {
        return crimeType;
    }

    public void setCrimeType(String crimeType) {
        this.crimeType = crimeType;
    }

    public LocalDate getCrimeDate() {
        return crimeDate;
    }

    public void setCrimeDate(LocalDate crimeDate) {
        this.crimeDate = crimeDate;
    }

    public String getIncidentDescription() {
        return incidentDescription;
    }

    public void setIncidentDescription(String incidentDescription) {
        this.incidentDescription = incidentDescription;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getWitnessNames() {
        return witnessNames;
    }

    public void setWitnessNames(String witnessNames) {
        this.witnessNames = witnessNames;
    }

    public String getReportingStaff() {
        return reportingStaff;
    }

    public void setReportingStaff(String reportingStaff) {
        this.reportingStaff = reportingStaff;
    }

    public String getPunishment() {
        return punishment;
    }

    public void setPunishment(String punishment) {
        this.punishment = punishment;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
