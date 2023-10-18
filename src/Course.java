import java.util.ArrayList;

public class Course {
    // course id , course name
   private int courseCode;
  private   String courseName;
  private   ArrayList<Student> enrolledStudents = new ArrayList<>();
  private ArrayList<Grade>  courseResult = new ArrayList<>();
  Professor professor;

    public Course(int courseCode, String courseName, Professor professor) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.professor = professor;
    }


    public ArrayList<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public ArrayList<Grade> getCourseResult() {
        return courseResult;
    }


    public  void setCourseResult(Grade grade) {

        courseResult.add(grade);
    }



    public int getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(int courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }


    void enrollCourse(Student student){

        enrolledStudents.add(student);

    }





}
