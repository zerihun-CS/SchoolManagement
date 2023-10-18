public class Professor {

    public Professor(String professorName, Department department) {
        this.professorName = professorName;
        this.department =department;
    }

    String professorName;

    Department department;


    void gradeCourse(Course course, Student student,float result){


        course.setCourseResult(new Grade(student, result));

    }


    void CreateCourse(String name, int code){
        department.courseList.add(new Course(code, name, this));
    }
}
