import java.util.ArrayList;

public class Department  extends AcademicEntity{

    ArrayList<Course> courseList = new ArrayList<>();

    public Department(String name) {
        super(name);
    }

    @Override
    void displayInfo() {
        System.out.println("Department Name:"+getName());
    }
}
