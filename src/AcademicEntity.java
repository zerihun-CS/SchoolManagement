abstract class AcademicEntity {

    public AcademicEntity(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    private String name;
    abstract void displayInfo();
}
