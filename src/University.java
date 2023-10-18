public class University  extends  AcademicEntity{


    public University(String name) {
        super(name);
    }

    @Override
    void displayInfo() {

        System.out.println("University Name: "+getName());
    }
}
