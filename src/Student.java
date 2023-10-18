import javax.xml.transform.Result;

public class Student {
    String studentName ;
    int studentId;


    public Student(String studentName, int studentId) {
        this.studentName = studentName;
        this.studentId = studentId;
    }



    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }


    public  Grade viewResults(Course course){
        for(Grade result: course.getCourseResult()){
            if(result.getStudent().studentId == this.studentId)return result;
        } return null;

    }


}
