import java.util.ArrayList;

public class University  extends  AcademicEntity {


    ArrayList<Department> departmentList = new ArrayList<>();


    public ArrayList<Department> getDepartmentList() {
        return departmentList;
    }



    void AddDepartment(Department department){

        departmentList.add(department);

    }

    public University(String name) {
        super(name);
    }

    @Override
    void displayInfo() {

        System.out.println("University Name: "+getName());
    }
}
