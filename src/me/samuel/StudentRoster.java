package me.samuel;

public class StudentRoster {

    private long studentID;
    private String studentFirstName;
    private String studentLastName;
    private String studentEmail;
    private String studentCourseList;

    public long getStudentID() {
        return studentID;
    }

    public void setStudentID(long studentID) {
        this.studentID = studentID;
    }

    public String getStudentFirstName() {
        return studentFirstName;
    }

    public void setStudentFirstName(String studentFirstName) {
        this.studentFirstName = studentFirstName;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public String getStudentCourseList() {
        return studentCourseList;
    }

    public void setStudentCourseList(String studentCourseList) {
        this.studentCourseList = studentCourseList;
    }
}