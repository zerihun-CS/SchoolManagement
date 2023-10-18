public class Grade {
    private Student student;
   private float result;
   private char assignedGrade;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public float getResult() {
        return result;
    }

    public void setResult(float result) {
        this.result = result;
    }

    public char getAssignedGrade() {
        return assignedGrade;
    }

    public void setAssignedGrade(char assignedGrade) {
        this.assignedGrade = assignedGrade;
    }




    public Grade(Student student, float result ) {
        this.student = student;
        this.result = result;

        this.assignedGrade = computeGrade(result);
    }


    private char computeGrade(float result) {
        if (result > 80 && result < 100) return 'A';
        else if (result > 70 && result < 80) return 'B';
        else if (result > 60 && result < 70) return 'C';
        else if (result > 50 && result < 60) return 'D';
        else if (result < 50) return 'F';
        return 'I';
    }


    @Override
    public String toString() {
        return "Grade{" +
                "result=" + result +
                ", assignedGrade=" + assignedGrade +
                '}';
    }
}
