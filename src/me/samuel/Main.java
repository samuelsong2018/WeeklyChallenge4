package me.samuel;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Creating HashSet for students' information first.
        HashSet<StudentRoster> schoolStudents = new HashSet<>();
        Scanner studentInput = new Scanner(System.in);
        String studentInfo = "";

        System.out.println("Instructions: \nFirst, enter the information of all the students in your school. \nThen, we will move onto the teachers, and after that, the available courses. ");

        //Add students' information with do while loop.
        do {
            System.out.println("\nEnter a student's ID number: ");
            StudentRoster student = new StudentRoster();
            long studentID = studentInput.nextLong();
            student.setStudentID(studentID);

            System.out.println("Enter the student's first name: ");
            String studentFirstName = studentInput.next();
            student.setStudentFirstName(studentFirstName);

            System.out.println("Enter the student's last name: ");
            String studentLastName = studentInput.next();
            student.setStudentLastName(studentLastName);

            System.out.println("Enter the student's email address: ");
            String studentEmail = studentInput.next();
            student.setStudentEmail(studentEmail);

            System.out.println("Finally, enter all of the student's courses, and separate each with a comma, but no space: ");
            String ListOfCourses = studentInput.next();
            student.setStudentCourseList(ListOfCourses);

            //Add student to StudentRoster, then ask to either continue with this loop or move onto next loop.
            schoolStudents.add(student);
            System.out.println("Would you like to add another student, or move on to teachers? \nType 'S' for a student, or 'T' for a teacher. ");
            studentInfo = studentInput.next();

        } while (studentInfo.equalsIgnoreCase("S")||studentInfo.equalsIgnoreCase("Student")||studentInfo.equalsIgnoreCase("Students"));

        HashSet<TeacherRoster> schoolTeachers = new HashSet<>();
        Scanner teacherInput = new Scanner(System.in);
        String teacherInfo = "";

        //Now add teachers' information with do while loop.
        do {
            System.out.println("\n\nEnter a teacher's ID number: ");
            TeacherRoster teacher = new TeacherRoster();
            long teacherID = teacherInput.nextLong();
            teacher.setTeacherID(teacherID);

            System.out.println("Enter a teacher's first name: ");
            String teacherFirstName = teacherInput.next();
            teacher.setTeacherFirstName(teacherFirstName);

            System.out.println("Enter a teacher's last name: ");
            String teacherLastName = teacherInput.next();
            teacher.setTeacherLastName(teacherLastName);

            System.out.println("Enter the teacher's email address: ");
            String teacherEmail = teacherInput.next();
            teacher.setTeacherEmail(teacherEmail);

            System.out.println("Finally, enter all of the teacher's courses, and separate each with a comma, but no space: ");
            String ListOfCourses = teacherInput.next();
            teacher.setTeacherCourseList(ListOfCourses);

            //Add teacher to TeacherRoster, then ask whether to continue with loop.
            schoolTeachers.add(teacher);
            System.out.println("Would you like to add another teacher, or move on to courses? \nType 'T' for a teacher, or 'C' for a course. ");
            teacherInfo = teacherInput.next();

        } while (teacherInfo.equalsIgnoreCase("T")||teacherInfo.equalsIgnoreCase("Teacher")||teacherInfo.equalsIgnoreCase("Teachers"));

        HashSet<CourseListing> schoolCourses = new HashSet<>();
        Scanner courseInput = new Scanner(System.in);
        String courseInfo = "";

        //Lastly, add courses' information with do while loop.
        do {
            System.out.println("\n\nEnter the course's ID number: ");
            CourseListing course = new CourseListing();
            long courseID = courseInput.nextLong();
            course.setCourseID(courseID);

            System.out.println("Finally, enter the course's name: ");
            String courseName = teacherInput.next();
            course.setCourseName(courseName);

            //Add teacher to TeacherRoster, then ask whether to continue with loop.
            schoolCourses.add(course);
            System.out.println("Would you like to add another course before we show the full list of all the data you entered this session? \nType 'Y' for yes, or 'N' for no. ");
            courseInfo = courseInput.next();

        } while (courseInfo.equalsIgnoreCase("Y")||courseInfo.equalsIgnoreCase("Yes"));

        System.out.println("\n\nThese are your school's students, teachers, and available courses: ");

        //Show all students using enhanced for loop.
        System.out.println("\nStudents: ");
        for (StudentRoster person : schoolStudents) {
            System.out.println("\nID Number: " + person.getStudentID() + "\nFirst Name: " + person.getStudentFirstName()+
                    "\nLast Name: " + person.getStudentLastName() + "\nEmail: " + person.getStudentEmail() + "\nTakes: " + person.getStudentCourseList());
        }

        //Show all teachers using enhanced for loop.
        System.out.println("\n\nTeachers: ");
        for (TeacherRoster person : schoolTeachers) {
            System.out.println("\nID Number: " + person.getTeacherID() + "\nFirst Name: " + person.getTeacherFirstName()+
                    "\nLast Name: " + person.getTeacherLastName() + "\nEmail: " + person.getTeacherEmail()+ "\nTeaches: " + person.getTeacherCourseList());
        }

        //Show all courses using enhanced for loop.
        System.out.println("\n\nCourses: ");
        for (CourseListing course : schoolCourses) {
            System.out.println("\nID Number: " + course.getCourseID() + "\nCourse Name: " + course.getCourseName());
        }
        //Full list should be done printing.
    }
}