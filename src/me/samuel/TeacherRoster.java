package me.samuel;

public class TeacherRoster {

    private long teacherID;
    private String teacherFirstName;
    private String teacherLastName;
    private String teacherEmail;
    private String teacherCourseList;

    public long getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(long teacherID) {
        this.teacherID = teacherID;
    }

    public String getTeacherFirstName() {
        return teacherFirstName;
    }

    public void setTeacherFirstName(String teacherFirstName) {
        this.teacherFirstName = teacherFirstName;
    }

    public String getTeacherLastName() {
        return teacherLastName;
    }

    public void setTeacherLastName(String teacherLastName) {
        this.teacherLastName = teacherLastName;
    }

    public String getTeacherEmail() {
        return teacherEmail;
    }

    public void setTeacherEmail(String teacherEmail) {
        this.teacherEmail = teacherEmail;
    }

    public String getTeacherCourseList() {
        return teacherCourseList;
    }

    public void setTeacherCourseList(String teacherCourseList) {
        this.teacherCourseList = teacherCourseList;
    }
}